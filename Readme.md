# Demo-config

Spring boot application to demonstrate how to access properties stored in Docker Swarm config.

How to run.

Create Docker config `demo-config` from `demo-config.yaml`

    docker config create demo-config demo-config.yaml

Build project

    ./mvnw install

Build image

    docker build -t demo-config .

Deploy docker stack

    docker stack deploy -c docker-compose.yaml demo-config

Check output
    
    docker service logs demo-config_demo

*Note:* External configs are supported in Docker Swarm mode only. If you want use `Docker compose` comment line `external: true` in  `docker-compose.yaml` abd uncomment `file: ./demo-config.yaml`.
