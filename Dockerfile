FROM openjdk:17
EXPOSE 8080
ADD target/emsH2FlywayActionTest.jar emsH2FlywayActionTest.jar
ENTRYPOINT ["java","-jar","/emsH2FlywayActionTest.jar"]