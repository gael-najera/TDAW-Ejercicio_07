FROM amazoncorretto:17-alpine-jdk
COPY target/Ejercicio_07-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]