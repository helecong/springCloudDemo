FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./target/dev999-useraccount-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/dev999-useraccount-service.jar"]

EXPOSE 8000