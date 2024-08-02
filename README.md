# Dog Daycare API

## Description
A RESTful API for managing dog daycare services built with Java and Spring Boot.

## Class Diagram
![dogdaycare](https://github.com/user-attachments/assets/c5f29238-8c39-4e4f-b1e1-3a466a715e8b)


## Setup
1. Clone the repository: `git clone < https://github.com/alexa2386/final-project.gitl>`
2. Navigate to the project directory: `cd dog-daycare-api`
3. Configure MySQL and update `application.properties`
4. Run the application: `./mvnw spring-boot:run`

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- JUnit
- Mockito

## Controllers and Routes Structure
- **User**
  - POST `/api/users`
  - GET `/api/users/{id}`
  - PUT `/api/users/{id}`
  - DELETE `/api/users/{id}`
- **Dog**
  - POST `/api/dogs`
  - GET `/api/dogs/{id}`
  - PUT `/api/dogs/{id}`
  - DELETE `/api/dogs/{id}`
- **Booking**
  - POST `/api/bookings`
  - GET `/api/bookings/{id}`
  - PUT `/api/bookings/{id}`
  - DELETE `/api/bookings/{id}`
- **HealthRecord**
  - POST `/api/health-records`
  - GET `/api/health-records/{id}`
  - PUT `/api/health-records/{id}`
  - DELETE `/api/health-records/{id}`

## Extra Links
- [Presentation Slides](link-to-presentation)

## Future Work
- Add authentication and authorization
- Implement a frontend interface
- Enhance error handling and validation

## Resources
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)

## Team Member
- Alexia Hamilton
