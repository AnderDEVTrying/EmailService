# Email Service with AWS SES

This project sends emails using **Amazon SES** integrated with **Spring Boot**.

## Technologies

- Java 17
- Spring Boot 3.x
- AWS SES

## Configuration

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/EmailService.git
   ```

2. Configure your AWS credentials in the `application.properties` file:
   ```properties
   aws.region=your-region
   aws.accessKeyId=your-access-key-id
   aws.secretKey=your-secret-access-key
   ```

3. Run the project:
   ```bash
   mvn spring-boot:run
   ```

## Endpoint

The endpoint to send emails is:

```
POST localhost:8080/api/send
```

### Example Request

```json
POST localhost:8080/api/send
Content-Type: application/json

{
  "to": "recipient@example.com",
  "subject": "Email Subject",
  "body": "This is the body of the test email."
}
```

---
