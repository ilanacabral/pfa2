Programa Full Cycle de Aceleração - PFA - Desafio 1

A aplicação é uma API que lista os módulos de um curso. Roda em container Docker, usando MySQL também em container.

Para subir os containers, rode os seguintes comandos na sequeência abaixo:

docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=admin -it --init --network=my-custom-net mysql:latest
docker run -it --init -p 8080:8080 --network=my-custom-net --name=myapp ilanacabral/osworks-api

Para executar a aplicação em qualquer browser ou via Postman

Para listar todos os cursos : http://localhost:8080/modulos
Para listar por id : http://localhost:8080/modulos/1

