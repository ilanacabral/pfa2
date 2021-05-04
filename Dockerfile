FROM amazoncorretto:11.0.11-alpine

WORKDIR /usr/src/myapp

ADD ./target/pfa2-0.0.1-SNAPSHOT.jar /usr/src/myapp

EXPOSE 8081

# Add dockerize tool -------------------
RUN apk add --no-cache openssl
ENV DOCKERIZE_VERSION v0.6.1
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz

CMD ["/usr/lib/jvm/java-11-amazon-corretto/bin/java","-jar", "pfa2-0.0.1-SNAPSHOT.jar"]
