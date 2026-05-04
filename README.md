# 📌 Anchor Displacement Prediction System (Spring Boot)

## 🚀 Overview
The Anchor Displacement Prediction System is a web-based engineering application that predicts displacement behavior of different anchor types in various soil conditions using Machine Learning models.

This project is a Java Spring Boot implementation of the original Python/Django system, enhanced with better scalability, REST APIs, and enterprise-level architecture.

---

## 🎯 Key Features

### 🔐 Authentication System
- User Signup & Login
- Secure password hashing using Spring Security (BCrypt)
- Session-based authentication

---

### 🌍 Soil Type Modules
Supports multiple soil conditions:
- Marine Clay
- Sand (Analytical & Experimental)
- Black Cotton Soil (Analytical & Experimental)

---

### 📊 Machine Learning Predictions
Predicts displacement for:
- Circular Anchor
- Square Anchor
- Star Anchor
- Helical Anchor

Types of displacement:
- Lateral
- Pullout
- Vertical / Uplift

---

### 📈 Advanced Visualization
- Interactive graphs using Chart.js
- Real-time comparison of anchor performance
- Dynamic result switching

---

### 📄 PDF Report Generation
- Download detailed report including:
  - Input parameters
  - Predicted values
  - Graph visualization
- Implemented using iText PDF library

---

### 📧 Feedback System
- Users can submit feedback from home page
- Sends email to admin using JavaMail API

---

### ⚙️ REST API Support
- Endpoints for:
  - Prediction
  - Authentication
  - Feedback
- Can be integrated with frontend/mobile apps

---

## 🧠 Machine Learning Details

### Algorithms Used
- Linear Regression
- Polynomial Regression
- Interpolation-based prediction

### Why These?
- Suitable for continuous value prediction
- Matches engineering experimental data
- Efficient and fast

---

### 📊 Evaluation Metrics
- RMSE (Root Mean Square Error)
- MAE (Mean Absolute Error)

---

## 🏗️ Tech Stack

### Backend
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Security

### Frontend
- HTML
- CSS
- JavaScript
- Chart.js

### Database
- MySQL (Aiven / Local)

### Tools
- Maven
- Eclipse IDE

---

## 📂 Project Structure

```
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 ├── config/
 └── util/
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository
```bash
git clone https://github.com/your-username/anchor-prediction-springboot.git
cd anchor-prediction-springboot
```

---

### 2️⃣ Configure Database

Edit `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/geotech_project
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Install Dependencies
```bash
mvn clean install
```

---

### 4️⃣ Run Application
```bash
mvn spring-boot:run
```

Application runs on:
```
http://localhost:8080
```

---

## 📡 API Endpoints

| Endpoint        | Method | Description            |
|----------------|--------|------------------------|
| /api/login     | POST   | User login             |
| /api/signup    | POST   | Register user          |
| /api/predict   | POST   | Predict displacement   |
| /api/feedback  | POST   | Send feedback          |

---

## 📊 Sample Output
- Displacement Graphs
- Numerical Results
- Downloadable PDF Report

---

## 🔒 Security
- Password hashing using BCrypt
- Protected routes
- Session-based authentication

---

## 🚀 Future Enhancements
- Deep Learning integration
- Real-time sensor data
- 3D visualization
- Cloud deployment (AWS/Azure)

---

## 👨‍💻 Author
Atharva Anil Nathe

---

## 📜 License
This project is for academic and research purposes only.
