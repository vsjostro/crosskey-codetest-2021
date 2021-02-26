# Mortgage calculator

Mortgage calculator to calculate the fixed monthly payments for a loan.  

The customers have been added to a database and is displayed in the web application by going to the customer tab.

## Prerequisites 
Java SE 8 or newer

## Online version

The web application is deployed on Heroku. It has the mortgage calculator and also the data fetched from the SQLite database. 

[Link](https://crosskey-codetest-vsjostro.herokuapp.com/)


## Installation

Installation instructions to deploy the application locally. 

Clone repository
```ps1
git clone https://github.com/vsjostro/mortgageplan-crosskey.git
```

```ps1
cd crosskey-codetest-2021
```

Build the project using Maven. (Note: JAVA_HOME needs to be set to your JDK directory)
```ps1
./mvnw package
```

Start web application
```ps1
java -jar target/dependency/webapp-runner.jar ./target/crosskey-codetest-2021-1.0-SNAPSHOT.war
```

Application has started on port 8080.
```ps1
http://localhost:8080/
```
