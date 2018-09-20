# Spring Boot with AWS Lambda

Running Spring Boot with AWS Lambda and test with AWS SAM Local.

Followed [this tutorial](https://github.com/awslabs/aws-serverless-java-container/wiki/Quick-start---Spring-Boot)

## Prerequisite
Install AWS SAM Local. [Follow this guide](https://docs.aws.amazon.com/lambda/latest/dg/sam-cli-requirements.html).

```bash
mvn clean package
```
```bash
sam local start-api
```

```bash
curl http://localhost:3000/hello // You might see a different port.
```