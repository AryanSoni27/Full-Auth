# Full Auth

## Overview
Full Auth is a complete authentication system implemented using JWT (JSON Web Token) in a Spring Boot application. This project provides a secure and scalable authentication mechanism that includes user registration, login, and token-based authorization.

## Features
- User Registration
- User Login
- JWT-based Authentication
- Role-Based Authorization
- Secure API Endpoints
- Token Expiry Handling

## Technologies Used
- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Lombok
- MySQL (or any other relational database)

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/AryanSoni27/Full-Auth.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Full-Auth
   ```
3. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
4. Build the project using Maven:
   ```sh
   mvn clean install
   ```
5. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
| Endpoint         | Method | Description |
|-----------------|--------|-------------|
| `auth/v1/signup` | POST   | Register a new user |
| `/auth/v1/login`    | POST   | Authenticate user and get JWT token |

## Usage
1. Register a user by sending a `POST` request to `/auth/v1/signup` with a JSON body containing username, email, and password.
2. Log in using the credentials, and you will receive a JWT token.
3. Use the token to access secured endpoints by including it in the `Authorization` header as `Bearer <token>`.

## Contribution
Feel free to fork this repository and contribute by submitting pull requests. For major changes, please open an issue first to discuss your ideas.

## License
This project is open-source and available under the MIT License.

## Contact
For any queries or discussions, feel free to reach out or open an issue in the repository.

