FROM openjdk:11-slim as build

EXPOSE 8080

# JAR файл прилжения
ARG JAR_FILE

CMD mkdir /opt/app
COPY target/*.jar /opt/app/licenseService.jar

ENTRYPOINT ["java","-jar","/opt/app/licenseService.jar"]