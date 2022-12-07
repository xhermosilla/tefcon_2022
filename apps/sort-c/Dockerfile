FROM alpine:latest as BASE

RUN apk add build-base
COPY /src/main.c /opt/
WORKDIR /opt
RUN gcc -o sort-c main.c

FROM alpine:latest

COPY --from=BASE /opt/sort-c /opt/sort-c
RUN chmod +x /opt/sort-c

ENTRYPOINT ["/opt/sort-c"]