# Weekely Test 3 -(12/02/2023)
## Frameworks and language

* Framework : Spring,SpringBoot
* Language : java (Version 11)

## Data flow
    Controller

* If the user had fetched any data from the frontend , then it would first come to the controller
#
    Service
* We can write the logic in service layer
* Whatever data comes to the controller, it forwards it to the service layer

#
    Repository
* SQL code is written in the repository layer.
* Will come from service layer to repository layer and there it will say that user has asked for this request.  Get us this request from the database.
* Whatever the user requests, it writes a query in SQL for the repository.
#
    DataBase Design
* Only data remains in it.

## Data Structure used in project
* List

## Project Summary
* University Event Management application is REST API Application
* Students enter data in this and events are also being created.It has two models one is student model and one is event model.
* In this we are creating, updating, deleting and viewing the data with the help of CURD operation.Whatever operations are being done in this, they are being done on the h2 data base.
