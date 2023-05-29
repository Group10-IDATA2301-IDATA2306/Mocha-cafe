# Spring Boot application for Mocha - Back-End
---

<b>Group:</b> 10</br>
<b>Course:</b> IDATA2306</br>
<b>Year:</b> 2023</br>
<b>University:</b> NTNU - Ålesund


## How to start

There are several options available for starting the application. The different options
starts the application with different application.properties files. For convenience, there
are two executables in this directory which starts the application in either:

* Production launch
* Testing launch

For production launching i.e., normal launch of the application. One may use the command:
```sh
mvn spring-boot:run
```
, or one may execute the executable named <i>prod</i>.

For test launching, one may execute the executable named <i>test</i>.


## API documentation

The REST API implementation has been documented using Swagger. If you would like to
consult the documentation, please see the following links:
* <a href="https://localhost:8080/swagger-ui/index.html">localhost:8080/swagger-ui</a>
* <a href="https://group10.web-tek.ninja:8080/swagger-ui/index.html">web-tek.ninja/swagger-ui</a>


## Application configuration

The application is deployed on an OpenStack server borrowed from NTNU. The entire application is
secured with a self-signed SSL-certificate, enabling HTTPS for the application. For authentication,
the application uses JSON Web Tokens. The API has been tested through JUnit tests and Postman tests.
The database is running on a MySQL/MariaDB server provided by Loopia, which also provided the email
client used for sending emails. The secret information in application.properties are in a file named
env.properties, which is not included in the GitHub repository.