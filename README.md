# 🛡️ Vigilant: AI-Powered Transaction Service

Vigilant is a microservice-based backend application designed to monitor financial transactions in real-time. It serves as the data ingestion and processing layer of a fraud detection system, leveraging AI to identify suspicious activities.

## 🚀 Current Status & Features
* **Transaction Management:** A robust infrastructure to record and track financial transactions.
* **Automated Status Handling:** Every new transaction is automatically timestamped and initialized with a `PENDING` status.
* **Database Integration:** Seamless data persistence using PostgreSQL and Spring Data JPA.
* **Infrastructure as Code (IaC):** Fully containerized development environment using Docker and Docker Compose.

## 🛠️ Tech Stack
* **Framework:** Spring Boot 3.2.2
* **Language:** Java 17
* **Database:** PostgreSQL
* **Message Broker:** Apache Kafka (Ready for AI service integration)
* **Tools:** Docker & Docker Compose, Lombok, Maven

## 📂 Project Structure

```text
com.vigilant
├── model       # Entity definitions (Transaction)
├── repository  # Database access layer (JPA)
├── service     # Business logic and processing
└── controller  # (Next Step) REST API Endpoints
```

## ⚙️ How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/NisaUstundag/Vigilant.git](https://github.com/NisaUstundag/Vigilant.git)
   ```
2. **Start Infrastructure:**
   ```bash
   docker-compose up -d
   ```
3. **Run the Application:**
   Open the project in IntelliJ IDEA and run `VigilantApplication.java`.

## 📈 Roadmap
- [x] Set up foundational Spring Boot skeleton.
- [x] Configure Docker-PostgreSQL-Kafka connections.
- [ ] Implement REST Controller for transaction ingestion.
- [ ] Integrate Kafka Producer to stream transactions to the AI analyzer.
- [ ] Develop a separate Python-based AI service for fraud scoring.
- [ ] Build a dashboard to visualize flagged transactions.

---
*This project is being developed to explore and apply modern software architectures and AI integration.*
