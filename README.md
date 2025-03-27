# Microservice Project

A microservices-based system using **Spring Boot, Docker, Kubernetes, and Helm**. It includes:

- **Accounts, Cards, and Loans Services** – Core business logic
- **Config Server** – Centralized configuration management
- **Eureka Server** – Service discovery
- **API Gateway** – Routing and authentication
- **RabbitMQ** – Message broker
- **Keycloak** – Authentication provider

## Technologies Used

- **Backend**: Java, Spring Boot
- **Infrastructure**: Docker, Kubernetes, Helm
- **Service Management**: Eureka, Config Server, RabbitMQ, Keycloak

## Setup & Installation

### 1. Apply Service Discovery
```bash
kubectl apply -f kubernetes-servicediscovery.yaml
```

2. Install Keycloak
   Using Helm
   bashCopyhelm install keycloak bitnami/keycloak
   Configuration Steps

Configure a new realm in Keycloak
Create a client for your microservices
Set up necessary roles for authentication

3. Install RabbitMQ
   Using Helm
   bashCopyhelm install rabbitmq bitnami/rabbitmq
4. Deploy Microservices
   Helm Deployment
   bashCopyhelm upgrade -i eazybank dev-env
   Additional Notes

Ensure your Kubernetes cluster is properly configured
Verify Keycloak and RabbitMQ installations using kubectl get pods
Check service endpoints and credentials after installation


