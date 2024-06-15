from amazoncorretto:11-alpine-jdk
maintainer Web Dev Esteban Daniel Cardozo
copy target/SpringBoot-0.0.1-SNAPSHOT.jar edc-app.jar
entrypoint ["java","-jar","/edc-app.jar"]
