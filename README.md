📚 Library Management System

(Spring Boot + Thymeleaf + REST API)

📌 Project Description

The Library Management System is a Spring Boot–based web application developed as part of the OOPJ / Java Practical Lab.
It allows management of library members with full CRUD operations using both:

🌐 Frontend (Website) – Thymeleaf + Bootstrap

🔌 Backend (REST APIs) – JSON-based APIs for Postman

The project follows MVC architecture and uses Java Collections for in-memory data storage.

🎯 Features

Add library member

View all members

Edit member details

Delete member

REST APIs for Postman testing

Clean and responsive UI using Bootstrap

🛠️ Technologies Used

Java 17

Spring Boot 3.2.5

Spring MVC

Thymeleaf

Maven

Bootstrap 5

Embedded Tomcat Server

🧱 Project Architecture

The project follows MVC (Model–View–Controller) architecture:

Controller  →  Service  →  Model
   ↓
 Thymeleaf View / JSON Response

📁 Project Structure
library-management
 └── src/main/java/com/example/librarymanagement
     ├── controller
     │   └── MemberController.java
     ├── model
     │   └── Member.java
     ├── service
     │   └── MemberService.java
     └── LibraryManagementApplication.java

 └── src/main/resources
     ├── templates
     │   └── members.html
     └── application.properties

🌐 Application URLs
🔹 Frontend (Website)
http://localhost:8080/

🔹 REST API Endpoints (Postman)
Operation	Method	URL
Add Member	POST	/api/members
Get All Members	GET	/api/members
Get Member by ID	GET	/api/members/{id}
Update Member	PUT	/api/members/{id}
Delete Member (UI)	GET	/members/delete/{id}
📌 Sample JSON (Postman)
Add Member
{
  "name": "Amit Kumar"
}

Update Member
{
  "name": "Amit Verma"
}

💾 Data Storage

Data is stored using Java HashMap

No database is used

Data is lost on server restart (in-memory storage)

▶ How to Run the Project

Open the project in IntelliJ IDEA / Eclipse

Ensure Java 17 is installed

Run:

LibraryManagementApplication.java


Open browser:

http://localhost:8080/

🧠 OOP Concepts Used

Encapsulation – Private fields with getters/setters

Abstraction – Service layer hides implementation

Polymorphism – Spring annotations handling different behaviors

Inheritance – Spring framework base classes

✅ Lab / Viva Readiness

✔ OOP Concepts implemented

✔ MVC architecture

✔ REST APIs (GET, POST, PUT, DELETE)

✔ Frontend + Backend integration

✔ Runnable project

🚀 Future Enhancements

Add database (MySQL / H2)

Add validation

Add exception handling

Add authentication & security

👨‍🎓 Author

Student Name: (Your Name)
Course: OOPJ / Java
Project Type: Academic / Lab Project

📜 License

This project is created for educational purposes only.
