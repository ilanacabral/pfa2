FROM amazoncorretto:11.0.11

WORKDIR /usr/src/myapp

ADD ./target/pfa2-0.0.1-SNAPSHOT.jar /usr/src/myapp

EXPOSE 8081

CMD ["/usr/lib/jvm/java-11-amazon-corretto/bin/java","-jar", "pfa2-0.0.1-SNAPSHOT.jar"]
