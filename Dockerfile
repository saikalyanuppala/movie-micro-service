FROM openjdk:11
LABEL SAI KALYAN UPPALA
COPY target/*.jar movies.jar
ENTRYPOINT ["java","-jar","/movies.jar"]