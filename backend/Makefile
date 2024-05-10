db-local:
	docker run --rm \
	--name postgres \
	-e POSTGRES_DB=store \
	-e POSTGRES_USER=root \
	-e POSTGRES_PASSWORD=root \
	-p 5432:5432 \
	-d postgres:alpine

compile-app-linux:
	./store/mvnw clean install -DskipTests -f store/

clean-docker-linux: compile-app-linux
	docker system prune -a --volumes -f

run-linux: clean-docker-linux
	docker compose up -d


compile-app-win:
	.\store\mvnw clean install -DskipTests -f store\

clean-docker-win: compile-app-win
	docker system prune -a --volumes -f

run-win: clean-docker-win
	docker compose up -d