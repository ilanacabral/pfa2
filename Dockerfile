FROM amazoncorretto:11.0.11

WORKDIR /usr/src/myapp

ADD ./target/osworks-api-0.0.1-SNAPSHOT.jar /usr/src/myapp

CMD ["/usr/lib/jvm/java-11-amazon-corretto/bin/java","-jar", "osworks-api-0.0.1-SNAPSHOT.jar"]
