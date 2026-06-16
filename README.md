# CI/CD Pipeline Project

## Overview
This project demonstrates a full end-to-end CI/CD pipeline using Jenkins, Maven, SonarQube, Docker, and Kubernetes. 
It automates code checkout, build, unit tests, static code analysis, containerization, and deployment.

## Features
- **Source Code Checkout**: Fetches source code from GitHub.
- **Build**: Uses Maven to compile and package the application.
- **Unit Testing**: Executes unit tests to validate functionality.
- **SonarQube Analysis**: Runs static code analysis to ensure code quality.
- **Docker Build**: Packages the app into a Docker image.
- **Docker Push**: Pushes the image to Docker Hub.
- **Kubernetes Deployment**: Configures and deploys the containerized app to a Kubernetes cluster.
- **Argo CD Integration**: Automates GitOps deployment for seamless rollouts.

## Prerequisites
- Jenkins installed and configured
- GitHub repository with source code
- Docker installed on Jenkins host
- SonarQube server configured
- Kubernetes cluster (e.g., Minikube, EKS)
- Argo CD installed (optional, for GitOps)

## Pipeline Stages
1. **Checkout**: Pulls the latest code from the GitHub repository.
2. **Build**: Runs `mvn clean package` to build the application.
3. **Unit Testing**: Executes `mvn test` to run unit tests.
4. **SonarQube Analysis**: Analyzes code quality using SonarQube.
5. **Docker Build**: Builds a Docker image tagged with the build number.
6. **Docker Push**: Authenticates to Docker Hub and pushes the image to the repository.
7. **Kubernetes Deployment**: Deploys the image to the cluster (via YAML manifests).
8. **Argo CD (Optional)**: Automates syncing the manifests to the cluster.

## Folder Structure

/jenkins-pipeline-ci-cd-v1
├── Jenkinsfile # Pipeline script
├── Dockerfile # Docker image definition
├── k8s/ # Kubernetes manifests
│ ├── deployment.yaml
│ ├── service.yaml
└── README.md # This file!


## How to Run
1. Ensure all prerequisites are met (Jenkins, Docker, SonarQube, Kubernetes).
2. Clone the repository:
   ```bash
   git clone <repo-url>


Configure Jenkins with the necessary credentials (e.g., Docker Hub, SonarQube).
Trigger the pipeline in Jenkins.
Monitor logs to see the build, test, and deployment progress.

