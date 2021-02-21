## E-commerce com microsserviços | [Digital Innovation One](https://digitalinnovation.one/)

Project developed to use microservices in an e-commerce environment.

## 📌 Index
- ⚙ [Settings](#-settings)
- 💻 [Technologies](#-technologies)
- 🚀 [How to run](#-how-to-run)
---

## ⚙ Settings
  Docker, postgresql, and jdk must be installed.
  To the postgresql create the user: admin and password: admin, port: 5432 to the localhost (port: 5433 to docker).
  Then create the database with name checkout and payment.
  
---

## 💻 Technologies
    - Java
    - Spring Boot
    - PostgreSQL
    - Docker
    - Apache ZooKeeper
    - Apache Kafka
    - Apache Avro
---

## 🚀 How to run

  > Cloning the repository
  ```bash
    # Cloning repository
    git clone https://github.com/antoniosergiojr/ecommerce_digital_innovation_one.git
  ```

  > Running web project
  ```bash
    # Accessing web project
    cd ecommerce_digital_innovation_one

    # Running web project	
	
    In the terminal access ecommerce-checkout-api/docker and run docker-compose up --build --force-recreate to build and docker-compose down to destroy.
    Run docker ps to check.
	
    run ecommerce-checkout-api and ecommerce-payment-api in your IDE. 
    
    Open ecommerce-checkout-frontend/cart.html in your browser, fill in the fields and click buy.
	 
    Notes:
    -> Access http://localhost:8080/v1/checkout/ in the postman ou insomnia to make a request (POST) in JSON format. To this alter in the class CheckoutResource
       @ModelAttribute to @RequestBody.
    -> http://localhost:8081/subjects/streaming.ecommerce.checkout.created-value/versions/latest
	
    
  ```
---
