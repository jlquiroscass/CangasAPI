# Dockerfile para API Go con Gin y HTTPS
FROM golang:1.23-alpine AS builder
WORKDIR /app
COPY . .
RUN go mod tidy && go build -o api main.go

FROM alpine:latest
WORKDIR /app
COPY --from=builder /app/api ./api
COPY locales.json ./locales.json
COPY certs/ ./certs/
EXPOSE 8443
CMD ["/app/api"]
