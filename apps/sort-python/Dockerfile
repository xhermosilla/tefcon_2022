FROM alpine:latest

RUN apk add python3
COPY /src/main.py /opt/sort-python.py
WORKDIR /opt

ENTRYPOINT ["python3", "/opt/sort-python.py"]