# 📘 Student Management System

---

## 📖 Overview

The **Student Management System** is a simple project built with **Spring Boot**, offering basic **CRUD operations** to manage student data through a RESTful API.

Whether you need to **add**, **retrieve**, or **delete** student records, this system provides an intuitive API to accomplish these tasks efficiently. It is ideal for managing educational data and can be expanded to suit more complex scenarios.

---

## 🚀 Features

- **Add a Student**: Register new student information into the system.
- **Retrieve Student by ID**: Look up a specific student’s details using their unique ID.
- **Fetch All Students**: Get a complete list of all registered students.
- **Delete a Student**: Remove a student record from the system by ID.

---

## 📂 Project Structure

- **Model Layer**: Defines the student entity with attributes such as `id`, `name`, and `email`.
- **Service Layer**: Contains the business logic for handling student data operations.
- **Controller Layer**: Provides REST API endpoints for managing students.

---

## 🛠️ Technologies Used

- **Spring Boot**: For building the backend REST API.
- **Maven**: Build automation tool for the project.
- **JUnit**: Testing framework for unit testing.
- **Mockito**: Framework for mocking objects during testing.

---

## 🔗 Endpoints

Here are the API endpoints available in the system:

1. **Add a Student**  
   - **Method**: `POST`  
   - **URL**: `/students/add`  
   - **Request Body**:  
     ```json
     {
       "id": 1,
       "name": "Ganesh",
       "email": "Gan@gmail.com"
     }
     ```

2. **Get a Student by ID**  
   - **Method**: `GET`  
   - **URL**: `/students/{id}`  
   - Example: `/students/1`

3. **Get All Students**  
   - **Method**: `GET`  
   - **URL**: `/students/all`

4. **Delete a Student by ID**  
   - **Method**: `DELETE`  
   - **URL**: `/students/delete/{id}`  
   - Example: `/students/delete/1`

---

## 🧰 Setup Instructions

Follow these steps to get the project up and running:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/username/student-management-system.git


2. **Navigate to the Project Directory**:

    ```bash
    cd student-management-system

3. **Build and Run the Project**:

   ```bash
   ./mvnw spring-boot:run
4.**Run the Tests**:

   ```bash
   ./mvnw test
<br>

---

## ✅ Testing
Unit tests are provided using JUnit and Mockito to ensure that the service methods and endpoints function correctly.

To run the tests, use the following command:
   ```bash
   ./mvnw test
<br>
🔮 Future Enhancements
We have exciting plans to expand the system’s capabilities in the future, such as:

🔗 Database Integration: Connect the system with a database like MySQL to store student data permanently.
📝 Update Functionality: Add the ability to update existing student records.
⚠️ Input Validation: Ensure that the data entered is correct and follows the required format (e.g., valid email addresses).
