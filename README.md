# kafka-spring-boot
Helps to understand how to configure apache kafka in spring boot application

## Prerequisite

Install ZooKeeper and Apache Kafka. Below link will help to setup ZooKeeper 
and Apache kafka for Windows environment.

https://www.codenotfound.com/2016/09/apache-kafka-download-installation.html

```
Default port of Apache Kafka is 9092.
```

## How To Test


Try to access the below Rest endpoint from REST Client
```
http://localhost:8080/signup
```

### Request Body
```
{

"firstName" : "John",
"lastName" : "Doe",
"age" : 29,
"gender" : "Male"
}
```

The Publisher will publishes the User Object with topic named (signup.topic) and
the Listener will Listen to the same (signup.topic). You can able to see both the 
published and received User Object details in the Console

 