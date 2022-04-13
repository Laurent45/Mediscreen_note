
FROM amazoncorretto:11
ARG JAR_FILE=build/libs/Mediscreen_note-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} note.jar
ENTRYPOINT ["java", "-jar", "/note.jar"]