# RailwayReservationSystem
Advance Java Training Project
This is a Spring Boot microservices-based Railway Reservation System that provides APIs for user management, train details, and ticket booking. It follows a microservices architecture and integrates Spring Cloud Eureka, API Gateway, and Spring Security to ensure scalability and security.


# Tech Stack:

Java 17
Spring Boot
Spring Cloud Netflix Eureka (Service Discovery)
Spring Cloud API Gateway
Spring Data JPA (Hibernate)
Spring Security
MySQL Database



# Microservices Overview : 

1️⃣ User Service (user-service)
Manages user registration, authentication, and authorization.
Stores user credentials in an encrypted format.
Secured endpoints with Spring Security.

2️⃣ Train Service (train-service)
Manages train details like available seats, routes, and schedules.
Provides an API to update available seats when a reservation is made.

3️⃣ Reservation Service (reservation-service)
Handles ticket bookings.
Calls train-service using Feign Client to update available seats after booking.

4️⃣ API Gateway (api-gateway)
Acts as a single entry point for all microservices.
Handles request routing, authentication, and security.
Also functions as a Eureka Server for service registration.



⚡ Features
✅ User Authentication & Security (Spring Security + Encrypted Passwords)
✅ Microservices Architecture (Independent services for scalability)
✅ Service Discovery (Eureka Server + Eureka Clients)
✅ Database Integration (MySQL with Spring Data JPA)
✅ API Gateway (Routing & Security Layer)

