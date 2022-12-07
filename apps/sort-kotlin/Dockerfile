FROM alpine:latest

RUN apk add openjdk17-jre
COPY /bin/sort-kotlin.jar /opt/
WORKDIR /opt

ENTRYPOINT ["/usr/bin/java", "-jar", "/opt/sort-kotlin.jar"]