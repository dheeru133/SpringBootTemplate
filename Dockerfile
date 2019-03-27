From tomcat:8.0.51-jre8-alpine
copy ./target/RestAPI-0.0.1-SNAPSHOT.jar RestAPI-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","RestAPI-0.0.1-SNAPSHOT.jar"]
