FROM java:8
#author
MAINTAINER yanchen wenjuyanchen@foxmail.com

VOLUME /tmp

ADD build/libs/xia-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c 'touch /app.jar'
EXPOSE 8080

ENTRYPOINT ["java","-jar:","/app.jar"]