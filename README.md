# Java + MYSQL Examples

1. Run a MySQL Server instance, for example on localhost using docker:
  - ```bash docker pull mysql```
  - ```bash docker run --name=mysql-container -e MYSQL_ROOT_PASSWORD=laTuaPassword -p 3306:3306 -d mysql:latest ```
2. Run one of the examples with ```bash ./gradlew runStepX ``` (on linux, and replace X with the desired step number) 
