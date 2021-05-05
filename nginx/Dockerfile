FROM nginx:latest
COPY default.conf /etc/nginx/conf.d/

EXPOSE 8000

# Add dockerize tool ------------------- se for usar
#RUN apk add --no-cache openssl
#ENV DOCKERIZE_VERSION v0.6.1
#RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
#    && tar -C /usr/local/bin -xzvf dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
#   && rm dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz