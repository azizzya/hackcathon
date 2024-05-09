Чтобы запустить бэк приложения, нужно выполнить несколько шагов:
1. Сгенерировать файл .jar:  
    1.1. Перейдите в директорию сервиса: store  
    1.2. Выполните команду: ./mvnw clean install -DskipTests
2. Запустить docker compose:  
! *Если приложение не запускается, пропишите команду docker system prune (на все вопросы отвечайте 'y' и пропишите docker compose build) и снова попробуйте выполнить docker compose up*):  
    2.1. Перейдите в директорию backend  
    2.2. Выполните команду: docker compose up

Swagger доступен по ссылке:
http://localhost:8080/swagger-ui/index.html

Есть две роли:
* ADMIN:   
пользователь по умолчанию для роли: admin:admin  
Authorization: Basic YWRtaW46YWRtaW4=
* USER:  
пользователь по умолчанию для роли: user:user  
Authorization: Basic dXNlcjp1c2Vy