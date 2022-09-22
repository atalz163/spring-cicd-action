FROM  openjdk:11
EXPOSE 8080
ADD target/java-cicd-actions.jar java-cicd-actions.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]