#Java EE - Apache Shiro
Simple Java EE with Apache Shiro as security using JDBC JNDI with hash password.

## Requirements
* Java EE 7
* PostgreSQL
* Apache Shiro
* Payara Application Server

## Database
Prepared database with name `java_shiro` and please make username with password for
the database as username: `demo` & password: `password`. Then execute sql files
from `/src/main/resources/db`.

```
psql -U demo -d java_shiro -a -f /src/main/resources/db/schema.sql

psql -U demo -d java_shiro -a -f /src/main/resources/db/data.sql
```

## JDBC JNDI
Make sure on Payara Application Server already installed PostgreSQL JDBC Driver.
Then configure JDBC Connection Pool and JDBC Resources with name `jdbc/java/shiro`.