# quarkus-starter-demo
## Objective:
- Run and test Quarkus framework with open jdk-hotspot 11, [mandrel](https://github.com/graalvm/mandrel/blob/default/README.md) (native image) and compare performance, memory test results. Compare the same with other frameworks like spring-boot, helidon.
- Use Redhat distribution of Quarkus and use mandrel to build native images and evaluate for production use in microservices

### Pre-requisites:
* Install jdkhotspot 11 (use open jdk)
* Install [mandrel](https://github.com/graalvm/mandrel/blob/default/README.md)
* Maven: 3.8.1
* Use k6 to mock performance load test using Virtual Users, to setup k6 in local refer to this [link](https://k6.io/docs/getting-started/installation/).
* Create database: `hms_user`, use import.sql to import sample records or create yours as suitable.
* Docker (optional).

### About the setup:
- Setup using postgresql-jdbc extension, Hibernate ORM, Hibernate with Panache and Spring Web API.
Refer to [pom.xml](https://github.com/pranay-s/springboot-starter-demo/blob/main/pom.xml)
- Created one entity `User` and using two APIs
  * `GET  /user/list` to list all users
  * `POST /user` to create an user entity
- Default heap mem set to 4gb to fasten native build image time, can be changed using `-Xmx` flag at start time

### In pipeline:
- Create a comprehensive test suite with APIs to evaluate under stress test
- Use multiple entities and check runtime memory usage
- Evaluate use of gRPC and integrate with Async Queue service

### Commands
#### Native Build:
**Instructions**:
- extract mandrel tar in `/usr/lib/mandrel`
- go to project path, run:
```shell
export PATH=/usr/lib/mandrel/mandrel-java11-20.3.3.0-Final/bin:$PATH
export JAVA_HOME=/usr/lib/mandrel/mandrel-java11-20.3.3.0-Final
```
Build native image:
```shell
./mvnw package -Pnative
```
To run native image:
```shell
./target/code-with-quarkus-1.0.0-PROTO-runner
```
**Using docker**:
Go to project dir.
```shell
sudo docker build -f src/main/docker/Dockerfile.fast-jar -t quarkus/code-with-quarkus-fast-jar .
sudo docker run -i --net=host --rm -p 8080:8080 --name quarkus-native quarkus/code-with-quarkus
```
To run using jdk hotspot and run in dev mode:
```shell
./mvnw compile quarkus:dev
```
