#FROM adoptopenjdk/openjdk11:ubi
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} spring-kafka-consumer.jar
#ENTRYPOINT ["java", "-jar", "spring-kafka-consumer.jar"]

FROM gradle:jdk11 as builder
COPY . /home/gradle
RUN gradle clean bootJar

FROM adoptopenjdk:11-jre-hotspot
COPY --from=builder /home/gradle/build/libs/*.jar ./kafka-producer.jar
CMD java -jar kafka-producer.jar