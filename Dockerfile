FROM       openjdk:17-alpine
COPY       ./target/demo-jenkins-0.0.1-SNAPSHOT.jar demo-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java" ,"-jar" ,"demo-jenkins-0.0.1-SNAPSHOT.jar"]
