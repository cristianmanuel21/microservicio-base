FROM openjdk:11
VOLUME /tmp
ADD ./target/springboot-servicio-item-0.0.1-SNAPSHOT.jar servicio-item-.jar
ENTRYPOINT ["java","-jar","/servicio-item-.jar"]