# Weekly Test 4 -(26/02/2023)

## Frameworks and language
* Framework : Spring,SpringBoot
* Language : java (Version 17)

## Data flow
#
    Controller

* StudentController
  * getStudent
  * addStudent
  * deleteStudent
  * updateStudent
* LaptopController
  * getLaptop
  * addLaptop
  * deleteLaptop
  * updateLaptop
* CourseController
  * getCourse
  * addCourse
  * deleteCourse
  * updateCourse
* BookController
  * getBook
  * addBook
  * deleteBook
  * updateBook

#
    Service

* StudentService
  
* LaptopService
  
* CourseService
  
* BookService

#
    dao

* StudentRepo

* LaptopRepo

* CourseRepo

* BookRepo


## Data Structure used in project

* List

## Project Summary

* In this project we have created 5 models namely :- 
  * Student 
  * Address
  * Laptop
  * Book 
  * Course.
* Using this project we map other model info into another model by hibernet mapping. -using this project we can manage student info which course student have enroll and which laptop use etc.
  
# Weekly Test 4 -(19/02/2023)
## Frameworks and language

* Framework : Spring,SpringBoot
* Language : java (Version 11)

## Data flow
    Controller

* AddressController
  * saveAddress()
* OrderController
  * saveOrder()
  * getOrderById()
* ProductController
  * saveProduct()
  * getProductByCategory()
  * getAllProduct()
  * deleteById()
* UserController
  * saveUser()
  * getUserById()
#
    Service
* getOrderByOrderId( ) -- This function will return all the details of an order.
* getUserByUserId( ) -- This function will return a user corresponding to it's userId.
* getProducts( ) -- This function will fetch all the products from the database depending upon it's category.
* deleteProduct( ) -- This function will delete a product and all it's corresponding orders from the 'tbl_order' table.

#
    Repository
* SQL code is written in the repository layer.
* Will come from service layer to repository layer and there it will say that user has asked for this request.  Get us this request from the database.
* Whatever the user requests, it writes a query in SQL for the repository.
#
    DataBase Design
* Only data remains in it.

## Data Structure used in project
* H2 Database

## Project Summary
* Ecommerce  application is REST API Application In this project we have created 4 models namely;User, Product, Address and Order. We have provided some endpoints and also in this section below we have given our API. Using this API we can perform the operations accordingly.



End Points:

* /get-order-by-orderId
* /get-user-by-userid
* /get-products-by-category
* /deleteById/productId
*  Here, while deleting a product by it's Id, we are required to delete it's corresponding order so that there is no vioaltion of data integrity.

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
