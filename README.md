# 🧾 Inventory System - Backend

RESTful API developed with Spring Boot for managing an inventory system, including products, categories, and stock levels. This backend powers the Angular-based frontend available in a separate repository.

## 🚀 Features

- Create, read, update, and delete inventory items
- Modular architecture using services and repositories
- MySQL database integration
- Organized in controllers, entities, services, and repositories

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- MySQL
- Maven

## 🧪 How to Run Locally

### 1. Clone the repository

git clone https://github.com/GabrielCharlesDev/inventory-system-backend.git
cd inventory-system-backend


2. Configure the database
Set your own credentials in src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=your_user
spring.datasource.password=your_password
Create the database manually or let Spring generate it if configured.

3. Run the project

mvn spring-boot:run
The backend will be available on:
📍 http://localhost:8080/

🔗 Related Frontend
This API is used by the Angular frontend, available here:
👉 inventory-system-frontend

👤 Author
Gabriel Charles
📧 gabrielcharlesmz@gmail.com
🔗 LinkedIn https://www.linkedin.com/in/gabrielcharlesdev/
🔗 GitHub https://github.com/GabrielCharlesDev
