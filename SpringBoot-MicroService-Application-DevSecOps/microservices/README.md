
# Spring Boot Microservices Project

This directory contains the source code for each of your microservices. Each subdirectory represents a separate service and contains its source code, a pom.xml file for managing its dependencies, and a Dockerfile for building a Docker image of the service.

# Spring Boot Microservices Application README

## Overview

This Spring Boot Microservices application consists of four services that work together to manage products, orders, inventory, and notifications. The services are designed to interact with each other, utilizing both synchronous and asynchronous communication. Below is a brief overview of each service:

1. **Product Service**
   - Manages the creation and viewing of products.
   - Uses MongoDB as the database.

2. **Order Service**
   - Allows users to place orders for products.
   - Utilizes MySQL as the underlying database.

3. **Inventory Service**
   - Checks the availability of products in stock.
   - Interacts with MySQL for inventory-related operations.

4. **Notification Service**
   - Stateless service responsible for sending notifications.
   - Used to notify users after an order is placed.

## Architecture

The application follows a microservices architecture, where each service is responsible for a specific domain. The services communicate with each other through both synchronous HTTP requests and asynchronous message queues.

### Components

- **Controller Layer:**
  - Receives HTTP requests from clients.
  - Directs requests to the appropriate service layer.

- **Service Layer:**
  - Contains business logic and orchestrates interactions between different services.
  - Manages message queues for asynchronous communication.

- **Repository Layer:**
  - Communicates with databases (MongoDB for Product Service, MySQL for Order and Inventory Services).

## Database Configuration

- **Product Service:** MongoDB
- **Order Service:** MySQL
- **Inventory Service:** MySQL

## Communication

- **Synchronous Communication:**
  - HTTP requests are used for synchronous communication between services.

- **Asynchronous Communication:**
  - Services communicate asynchronously through message queues for certain operations.


