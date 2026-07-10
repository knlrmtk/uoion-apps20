# Uoion Apps20 : This is a springboot java application used for docker container testing.

Complete Build & Run Commands:

Verify Java: java -version

Verify Maven: mvn -version

Build the application: mvn clean package

Run the application: mvn spring-boot:run
or
Run the packaged JAR: java -jar target/uoion-apps20-1.0.0.jar
---------------------------------------------------------------------
Deploy on an EC2 Instance:

Install Java 21 on the EC2 instance.

Copy the JAR file:
scp target/uoion-apps20-1.0.0.jar ec2-user@EC2-IP:/home/ec2-user/

Run the application:
java -jar uoion-apps20-1.0.0.jar

Ensure the EC2 security group allows inbound traffic on port 8080.

Access the application: http://EC2-Public-IP:8080/

This project is suitable as a basic Spring Boot starter and can later be extended with features such as Spring Boot Actuator, Prometheus metrics, Docker support, and deployment through a Jenkins CI/CD pipeline.
