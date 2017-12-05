FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./target/dev999-website-api.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/dev999-website-api.jar"]

EXPOSE 8080