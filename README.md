# Пример сервиса с openapi генератором

### Запуск сервиса:
- `./gradlew :service:bootRun`

### Генерация клиентов и моделей:
- `./gradlew :api:mainApiGenerator`

### Запрос GET:
- `curl --location 'http://localhost:8080/exampleget?item=30'`

### Запрос POST:
- `curl --location 'http://localhost:8080/examplepost' \
  --header 'accept: application/json' \
  --header 'Content-Type: application/json' \
  --data '{
  "message": "test",
  "item": "10"
  }'`