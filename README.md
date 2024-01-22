# DevSecOps Spring Boot Microservices Project

Welcome to the DevSecOps-enabled Spring Boot microservices project! This initiative combines the power of Spring Boot microservices with a robust DevSecOps pipeline. With a total of four microservices, Dockerized deployment, and orchestrated on an EKS cluster using ArgoCD and Helm, this project sets a high standard for security and efficiency.

## Project Structure

1. **Microservices Codebase**: The `microservices` directory is home to the code for each microservice. Individual directories include Dockerfiles for creating Docker images of the services, ensuring a secure and isolated runtime environment.

2. **GitHub Actions Pipeline**: Every code change triggers a GitHub Actions pipeline. This pipeline updates the Dockerfile, builds a new Docker image, and securely pushes it to Docker Hub with a unique tag, following best practices for DevSecOps.

3. **ArgoCD Deployment**: In the `argocd` directory, you'll find the ArgoCD configuration. It actively monitors the GitHub repository for changes, allowing for automatic and secure deployment updates that align with DevSecOps principles.

4. **Helm Charts for Manifests**: Helm charts, located in the `kubernetes/helm-charts` directory, simplify the deployment of application manifests. Helm supports versioning, rollback, and other key features, promoting a secure and consistent deployment process.

5. **Istio for Service Mesh**: Integrated Istio provides advanced service mesh capabilities, delivering enhanced security and observability. With Istio, this project prioritizes secure and efficient communication between microservices.

6. **Infrastructure with Terraform**: The `terraform` directory contains Terraform code for establishing the project's infrastructure. This ensures a secure and well-defined foundation, aligning with DevSecOps principles from the ground up.

## Getting Started

To embark on this DevSecOps journey, clone the repository and navigate to the `microservices` directory. Here, you can build and run each microservice locally, ensuring your development environment aligns with the security standards set by this project. Detailed deployment instructions are available in the `argocd` and `kubernetes` directories.

## Contributing

This project thrives on collaboration. To contribute and strengthen the DevSecOps aspects, open a pull request with your proposed changes. Let's work together to elevate the security and efficiency of this Spring Boot microservices project.

## License

This project is licensed under the MIT License. Refer to the LICENSE file for specific details.

Feel empowered to explore, contribute, and integrate DevSecOps practices into your Spring Boot microservices journey! If you have questions or encounter issues, feel free to reach out.


