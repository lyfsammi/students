FROM java:8-jre

ADD ./target/students-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-jar", "app/students-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080