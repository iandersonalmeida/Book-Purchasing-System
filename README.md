# Book Purchasing System - Web Application Project
This project aims to develop a web application that addresses microservices architecture, expanding knowledge and practical experience in the fields of the software development cycle, frameworks, programming, testing and deployment.

* [General info](#general-info)
* [Development](#c)
* [Project Status](#project-status)
* [Inspiration](#inspiration)

## General info
The project is an application that addresses the idea of microservices, which describes components of a system that are independent or "loosely coupled". Each component has a defined responsibility and the resources it needs to function. For the development of the application's microservices, Spring Boot, MySQL for database management, the Postman tool for building HTTP requests and React for the user interface are currently being used.

## Development

###  Microservice architecture-based version of the application


![](response1.PNG)


### Part 2: Building a configuration server for a microservice

When we talk about properties of an object, what do we mean? It means that the object has attributes, qualities or characteristics that distinguish it from others; the possession of these characteristics constitutes the properties of an object; it is something about the object “in itself” that is perceptible; for example, one of the properties of stone would be hardness. Through properties it is possible to describe the object or the concept of the object. Given these preliminary considerations, what would be the concept of cloud or cloud computing?

I would say that computational operations are carried out in “floating” locations without necessarily knowing where the operation in question came from; these operations can be thought of as services offered. One of the properties of cloud computing is having resources located in different locations and which can be accessed as services. Now, going directly to the ideas in the books, these services are offered as IaaS, PaaS and SaaS:

- IaaS refers to computing resources that are required for infrastructure as a service;
- PaaS indicates a platform as a service. The provider of this service offers resources in addition to infrastructure for application development; 
- SaaS is the idea of business applications or software products as a service.

A Spring Cloud configuration server was developed based on IaaS. Through the Spring Starter Project, a project based on Spring Boot was created with all the necessary configurations represented in the pom.xml file; this file represents a Maven project. These settings are necessary to initialize the server.The class that will start the Spring Cloud service is the class that has the main method that serves as the execution entry point. This class is the _ConfserverApplication_ class that returns at runtime an object of the Class class that represents ConfserverApplication. This class has two annotations: @SpringBootApplication and @EnableConfigServer. The @SpringBootApplication annotation includes @Configuration, @EnableAutoConfiguration, and @ComponentScan:

- @Configuration: Indicates that a class declares one or more @Bean methods and can be processed by the Spring container to generate bean definitions and service requests for those beans at run time. The Spring container will process a class with this annotation as a configuration class that will be used to define beans;
- @EnableAutoConfiguration: Indicates a self-configuration of the context that this annotation provides. This self-configuration also involves the beans that will be configured.
- @ComponentScan: A component can be a class with a certain annotation that will allow Spring to detect and register it as a bean in the application context.
- @EnableConfigServer allows a class to act as a configuration server for other applications. So, I have the ConfserverApplication class that will be used as a configuration server for the microservices.

The developed microservice is also a Spring Boot application called _bookmicroservice_. When this application is running, it must get its external configuration from the ConfserverApplication server that is listening for requests. The data is provided by the configuration server for the services. The configuration server manages the properties of each application. The application.properties file points to the repository that holds the application's configuration data. Regarding the configuration server, the configuration file contains:
- server.port: indicates the port on which the server should listen for requests;
- spring.profiles.active: indicates which profile is active. In my case, it is native, which means that I am using the filesystem to store application configuration data that will be loaded;
- spring.cloud.config.server.native.search-locations: represents the locations where Spring Boot should look for configuration files.

Spring Boot provides the Spring Boot Actuator. Thus, two properties were added that allow checking and managing the environment through endpoints such as /env, /health, for example. With the URI: http://localhost:8080/actuator/env, it is returned, 

![](db-info.PNG) 


![](env-info.PNG)

Thus, I obtain configuration information from the application database as well as some environment information, respectively.

### Part 3: Remembering some concepts...

The Book Service microservice is a Spring Boot application and has some classes that perform specific tasks. The first class to be addressed is the Book class. This class is used to perform the mapping between java objects and relational database tables. To do this, the first JPA notation placed is @Entity; this annotation defines the class as an entity, or it becomes a JPA entity. The second annotation is @Table; this annotation represents a table with a primary key that uniquely identifies each record in the table and that is associated with the table in the database; two more JPA annotations have been added which specify the ID and column in the database table, @Id and @Column, respectively. @Id represents the primary key; @Column indicates the column mapped to a property. 

The BookRepository interface was created with an implementation class called BookRepositoryImpl. The class was annotated with @Repository and indicates that the interface becomes a repository; so Spring can create and inject the bean from the class. The repository manages a domain class and entity ID type. This management capability is provided by the CrudRepository interface. CrudRepository is a generic interface for performing CRUD operations on a repository. The domain class and ID are respectively the Book class and the Integer type.

The BookService class has been annotated with @Service. All classes annotated with @Controller, @Repository and @Service are beans in Spring. When the @Service bean is created, the container injects dependencies, that is, the @Service bean works with other beans or objects like @Repository, for example. BookService has a dependency on BookRepository; once the bean is created, BookRepository is injected by the container into the BookService. The BookRepository dependency was injected into the BookService class using the @Autowired annotation.
  
## Project Status
The project is currently under development.

## Inspiration
This application is based on the book: Spring Microservices in Action, and Spring Framework Documentation.

