FROM openjdk:8u232-jre-slim
# FROM openjdk:8
WORKDIR /fsdms
VOLUME /fsdms-data
ENV PROJECT_ARTIFACTID="fsdms-company-srv" PROJECT_VERSION="0.0.1-SNAPSHOT"
COPY target/$PROJECT_ARTIFACTID-$PROJECT_VERSION.jar /fsdms/app.jar
EXPOSE 9052
ENTRYPOINT ["java", "-jar", "/fsdms/app.jar"]
