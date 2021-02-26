# Mortgage calculator

Mortgage calculator to calculate the fixed monthly payments for a loan.  

## Prerequisites 
Java SE 8 or newer

## Online version

The web application is deployed on Heroku. It has the mortgage calculator and also the data fetched from the SQLite database. 

[Link](https://crosskey-codetest-vsjostro.herokuapp.com/)


## Installation

Installation instructions to deploy the application locally. 

Clone repository
```cmd
git clone https://github.com/vsjostro/mortgageplan-crosskey.git
```

```cmd
cd crosskey-codetest-2021
```

Build the project using Maven
```cmd
mvnw package
```

Start web application
```
java -jar target/dependency/webapp-runner.jar ./target/crosskey-codetest-2021-1.0-SNAPSHOT.war
```

Application has started on port 8080.
```
http://localhost:8080/
```
