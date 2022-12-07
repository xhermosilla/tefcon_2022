FROM alpine:latest

RUN apk add nodejs
COPY /src/index.js /opt/sort-node.js
WORKDIR /opt

ENTRYPOINT ["node", "/opt/sort-node.js"]