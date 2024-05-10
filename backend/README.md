Чтобы запустить бэк приложения, нужно выполнить несколько шагов:
1. Сгенерировать файл .jar:  
    1.1. Перейдите в директорию сервиса: store  
    1.2. Выполните команду: ./mvnw clean install -DskipTests
2. Запустить docker compose:  
! Если приложение выдает ошибку, пропишите команду следующее:
* docker system prune (на все вопросы отвечайте 'y')
* docker compose build
В случае нормального выполнения:  
    2.1. Перейдите в директорию backend  
    2.2. Выполните команду: docker compose up -d

Swagger доступен по ссылке:
http://localhost:8080/swagger-ui/index.html

Есть две роли:
* ADMIN:   
пользователь по умолчанию для роли: admin:admin  
Authorization: Basic YWRtaW46YWRtaW4=
* USER:  
пользователь по умолчанию для роли: user:user  
Authorization: Basic dXNlcjp1c2Vy