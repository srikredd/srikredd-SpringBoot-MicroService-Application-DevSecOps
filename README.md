# Spring Boot Microservices Project

This project is a Spring Boot microservices application with 4 microservices. The application is Dockerized, deployed to an EKS cluster using ArgoCD and Helm, and monitored using Istio. The infrastructure for the project is set up using Terraform.


## Workflow

1. Code for the 4 microservices is located in the `microservices` directory. Each service has its own directory with a Dockerfile for creating a Docker image of the service.
2. Any changes to the code in the GitHub repository will trigger a GitHub Actions pipeline. This pipeline will update the Dockerfile, build a new Docker image, and push the image to Docker Hub with a new tag.
3. ArgoCD is used to deploy the application to an EKS cluster. The ArgoCD configuration is located in the `argocd` directory. ArgoCD is configured to monitor the GitHub repository for any changes and automatically deploy updates.
4. Helm charts are used to deploy the application manifests. The Helm charts are located in the `kubernetes/helm-charts` directory.
5. Istio is used for service mesh capabilities, providing enhanced security and observability for the application.
6. The `terraform` directory contains the Terraform code for setting up the infrastructure for the project.

## Getting Started

To get started with this project, clone the repository and navigate to the `microservices` directory. From there, you can build and run each microservice locally. For deploying the application, follow the instructions in the `argocd` and `kubernetes` directories.

## Contributing

Contributions are welcome. Please open a pull request with your changes.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

