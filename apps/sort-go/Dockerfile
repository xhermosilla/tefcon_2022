FROM alpine:latest as BASE

RUN apk add  go
COPY /src/main.go /opt/
WORKDIR /opt
RUN go build -o sort-go main.go

FROM alpine:latest

COPY --from=BASE /opt/sort-go /opt/sort-go
RUN chmod +x /opt/sort-go

ENTRYPOINT ["/opt/sort-go"]