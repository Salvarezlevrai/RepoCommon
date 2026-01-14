package org.example;


public class OrderService {
    private Logger logger;

    public OrderService(Logger logger){

    this.logger = logger ;
    }
    public void createOrder(String product){
        logger.log("order: " + product);
        logger.log("Order created");

    }
}

