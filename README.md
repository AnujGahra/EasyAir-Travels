

# ✈️ Airline Booking Platform (Microservices + Kafka)

## 🧠 Overview

A **production-grade Airline Booking Platform** built using **microservices architecture and event-driven design**.
Inspired by real-world **Global Distribution Systems (GDS)** like Amadeus, this project simulates how modern airline booking systems handle **search, pricing, seat allocation, payments, and notifications** at scale.

---

## 🚀 Key Highlights

* Event-driven architecture using **Apache Kafka**
* **11 independent microservices** with database-per-service pattern
* **End-to-end booking flow** (Search → Seat → Payment → Booking → Notification)
* **Scalable & fault-tolerant system design**
* **Full-stack implementation** with modern UI

---

## 🏗️ Architecture

### 🔁 Event-Driven Flow (Saga Pattern)

```
Payment → Booking → Seat → Notification
```

* Services communicate asynchronously via Kafka
* Failure handling using **compensation events**

### 🌐 Core Components

* API Gateway (single entry point)
* Service Discovery (Eureka)
* Independent microservices
* Kafka event broker
* Redis caching layer

---

## ⚙️ Tech Stack

### 🖥️ Backend

* Spring Boot, Spring Cloud
* Netflix Eureka (Service Discovery)
* Spring Cloud Gateway
* OpenFeign + Resilience4j
* Apache Kafka
* Redis (Caching + JWT Blacklist)
* Spring Security + JWT
* MySQL (Database per service)

### 💳 Payments & Notifications

* Razorpay, Stripe
* Spring Mail (Email)
* Twilio (SMS)

### 🎨 Frontend

* React (Vite)
* Redux Toolkit
* Tailwind CSS, Radix UI
* Framer Motion

### 🐳 DevOps

* Docker & Docker Compose
* Google Jib (Container builds)
* Spring Boot Actuator

---

## 📦 Features

### 👤 User Features

* Flight search with filters
* Real-time seat selection
* Fare pricing & baggage rules
* Add-ons (meals, insurance)
* Secure payments
* PDF ticket generation
* Email & SMS notifications

### 🏢 Admin Features

* Airline & fleet management
* Flight scheduling
* Fare & baggage configuration
* Seat map builder
* Analytics dashboard

### ⚙️ System Features

* Role-Based Access Control (RBAC)
* Circuit breaker monitoring
* Distributed logging & health checks

---

## 🧩 Microservices (Sample)

* User Service (Auth, Profiles, Roles)
* Flight Service
* Search Service
* Seat Service
* Booking Service
* Payment Service
* Notification Service
* Admin Service
* API Gateway
* Discovery Server
* Config Service (optional)

---

## 🛡️ Security

* JWT-based authentication
* Role-based authorization (Admin/User)
* Token blacklist using Redis
* Secured API Gateway routing

---

## ⚡ Performance & Resilience

* Redis caching for low latency
* Circuit breakers (Resilience4j)
* Fault-tolerant service communication
* Graceful fallback mechanisms

---

## 🐳 Running the Project

### Prerequisites

* Java 17+
* Node.js
* Docker & Docker Compose
* MySQL

### Steps

```bash
# Clone repository
git clone https://github.com/AnujGahra/EasyAir-Travels.git

# Start services
docker-compose up --build

# Run frontend
cd frontend
npm install
npm run dev
```

---

## 📈 What I Learned

* Designing **scalable microservices systems**
* Implementing **Kafka-based event-driven architecture**
* Handling **distributed transactions using Saga**
* Building **secure authentication systems (JWT + RBAC)**
* Integrating **real-world payment gateways**
* Managing **Docker-based deployments**

---

## 💡 Use Cases

* Airline booking platforms
* Travel agency systems
* Corporate travel management
* GDS-like backend systems

---

## 🎯 Future Improvements

* Kubernetes deployment
* CI/CD pipeline integration
* Distributed tracing (Zipkin)
* Rate limiting & API throttling
* AI-based fare prediction

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repo and submit a PR.

---

## 📬 Contact

**Anuj Kumar**

* Full Stack Developer
* Java | Spring Boot | React | Microservices

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!

