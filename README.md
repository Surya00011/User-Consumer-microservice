# User Consumer Microservice

This microservice listens to a RabbitMQ queue for user data sent by the producer microservice and saves it to a MySQL database.

---

## 🧩 Tech Stack

- Java 17+
- Spring Boot
- Spring AMQP (RabbitMQ)
- Spring Data JPA
- MySQL
- Maven

---

## 📦 Features

- Consumes messages from RabbitMQ queue
- Deserializes JSON into `UserDto`
- Saves the user data into a MySQL database

---
