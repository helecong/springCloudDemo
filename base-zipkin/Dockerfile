FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./target/base-zipkin.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/base-zipkin.jar"]

EXPOSE 7000