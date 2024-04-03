package cz.tsb.democonfig;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner { // Implement CommandLineRunner

  private final ConnectionProperties connectionProperties;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Config Server Value: " + connectionProperties.getServer());
    System.out.println("Config Port Value: " + connectionProperties.getPort());
    while (true) {
    }
  }

  @Configuration
  public static class MyConfig {
    @Bean
    @ConfigurationProperties(prefix = "demo-config")
    public ConnectionProperties getConnectionProperties() {
      return new ConnectionProperties();
    }
  }

}