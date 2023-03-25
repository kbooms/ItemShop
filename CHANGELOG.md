# Item Shop Devlog/Changelog

---
All noteable changes to this project will be documented in this file.  

---
## 3/25/2023

### Project Setup
#### Initial Bones
- Maven Project
- JDK 17
- ItemShop Database created and .sql files written  
- Item and Order Model classes created
- Item and Order DAO Interfaces created

Before any information can be transferred between the program and the database we need to establish a connection. To do this we do about 5 things:  
-[] Add the apache `commons-dbcp2` dependency to our pom.xml  
-[] Reload the Maven project with this dependency added  
-[] Import the dbcp2 `BasicDataSource` class to the project  
-[] Write a connection string  
-[] Connect the Program to the Database using BasicDataSource  

#### Add the apache commons dbcp2 dependency
Within the `<dependencies>` section of the pom.xml we need to add this dependency  
```
    <dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-dbcp2</artifactId>
            <version>2.1.1</version>
        </dependency>
    </dependencies>
```
#### Reload the Maven Project
With the dependency added, the project can be reloaded with the `Ctrl+Shift+O` keys. Alternatively, an icon may pop up in the corner of your pom.xml screen. Clicking this will do the same thing.  
![](img/00-reload-project.png)  
#### Import the BasicDataSource Class
Within the top of the Main (ItemShop) class we will import the following dependencies  
```
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
```

#### Write a connection string
Connection String follows this format  
`jdbc:postgresql://SERVER_NAME:PORT/DATABASE_NAME`  
- `jdbc`: the protocol is JDBC
- `postgresql`: the driver name. (We're using PostgreSQL)
- `SERVER_NAME`: the host name or IP address of the database server
- `PORT`: The port number of the database server
- `DATABASE_NAME`: the name of the database on the server  

Our connection string looks like this  
`jdbc:postgresql://localhost:5432/ItemShop`  
#### Connect the Program to the Database using BasicDataSource
First need is to instantiate the `BasicDataSource`  
`BasicDataSource dataSource = new BasicDataSource();`  
Then set the connection string as the URL, we also need to include credentials. For the time being they will be coded in.  
```
dataSource.setUrl("jdbc:postgresql://localhost:5432/ItemShop");
dataSource.setUsername("postgres");
dataSource.setPassword("postgres1");
```

