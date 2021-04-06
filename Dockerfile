FROM openjdk:8
EXPOSE 8080
ADD target/jenkins_docker_app.jar jenkins_docker_app.jar
ENTRYPOINT ["java","-jar","/jenkins_docker_app.jar"]