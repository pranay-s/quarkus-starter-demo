# quarkus-starter-demo
## Objective:
- Run and test Quarkus framework with open jdk-hotspot 11 vs [mandrel](https://github.com/graalvm/mandrel/blob/default/README.md) (Downstream distribution of GraalVM) and compare performance, memory test results.
- Use Redhat distribution of Quarkus and use mandrel to build native images and evaluate for production use in microservices

### Pre-requisites:
* Install jdkhotspot 11
* Install [mandrel](https://github.com/graalvm/mandrel/blob/default/README.md)
* Use k6 to mock performance load test using Virtual Users, to setup k6 in local refer to this [link](https://k6.io/docs/getting-started/installation/).
* Create database: `hms_user`, use import.sql to import sample records or create yours as suitable.

### About the setup:
- Setup using postgresql jdbc dependency for connecting with a PostgreSQL local server, Hibernate ORM, Hibernate with Panache and Spring Web API.
Refer to [pom.xml](https://github.com/pranay-s/springboot-starter-demo/blob/main/pom.xml)
- Created one entity `User` and using two APIs
  * `GET  /user/list` to list all users
  * `POST /user` to create an user entity
