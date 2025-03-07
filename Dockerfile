FROM ubuntu:latest
LABEL authors="gaeln"

ENTRYPOINT ["top", "-b"]