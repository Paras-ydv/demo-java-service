# .cicd.yml - PipelineHub CI/CD Configuration
name: java-pipeline
language: java
environment: production

# Pipeline stages to execute
stages:
  - checkout
  - install
  - build
  - test
  - security_scan
  - package
  - deploy
  - notify

# Environment variables
variables:
  JAVA_VERSION: "17"
  MAVEN_OPTS: "-Xmx2048m"

# Custom scripts per stage
scripts:
  install:
    - mvn clean install -DskipTests
    - mvn dependency:resolve
  build:
    - mvn compile
    - mvn checkstyle:check
    - mvn pmd:check
  test:
    - mvn test
    - mvn jacoco:report
    - mvn verify
  security_scan:
    - mvn dependency-check:check
    - mvn org.owasp:dependency-check-maven:check
  package:
    - mvn package -DskipTests
    - docker build -t $REPO_NAME:$COMMIT_HASH .
  deploy:
    - kubectl apply -f k8s/
    - kubectl set image deployment/$REPO_NAME app=$REPO_NAME:$COMMIT_HASH
    - kubectl rollout status deployment/$REPO_NAME --timeout=5m
