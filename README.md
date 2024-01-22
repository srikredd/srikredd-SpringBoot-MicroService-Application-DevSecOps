# DevSecOps Spring Boot Microservices Project

Welcome to our DevSecOps project utilizing Spring Boot Microservices! This project focuses on building a scalable and secure application deployment pipeline. Below are the step-by-step instructions for setting up and running the project.

## Project Overview

This project includes the following key components:

1. **Spring Boot Microservices Application**
2. **DockerFile for Each Microservice**
3. **GitHub Actions Workflow**
4. **AWS EKS (Elastic Kubernetes Service) Cluster Setup with Terraform**
5. **Manual and Helm Chart Deployment to EKS**
6. **GitOps Implementation using ArgoCD**
7. **Monitoring with Prometheus and Grafana**

## Getting Started

Follow these steps to get the project up and running:

### 1. Spring Boot Microservices

- Clone this repository to your local machine.
- Navigate to the `SpringBoot-MicroService-Application-DevSecOps` directory.
- Follow the README instructions in each microservice directory for setup.

### 2. DockerFile for Each Microservice

- Create DockerFiles for each microservice by following the instructions in the respective microservice directories.

### 3. GitHub Actions Workflow

- Configure GitHub Actions by creating workflows in the `.github/workflows` directory.
- The workflows automate Docker image creation and deployment processes.

### 4. AWS EKS Cluster Setup with Terraform

- Navigate to the `terraform` directory.
- Follow the README instructions to set up a highly available and scalable AWS EKS cluster.

### 5. Manual and Helm Chart Deployment to EKS

- Deploy the application manually to EKS using deployment manifests.
- Explore Helm Charts for future improvements in deployment strategies.

### 6. GitOps Implementation using ArgoCD

- Install and configure ArgoCD for continuous deployment and Git repository monitoring.

### 7. Monitoring with Prometheus and Grafana

- Install Prometheus and Grafana for monitoring purposes.

## Contribution Guidelines

If you would like to contribute to this project, please follow our [Contribution Guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).

Feel free to reach out if you have any questions or need assistance!

Happy coding!

