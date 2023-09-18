# Bookstore application using Java + Java Swing

![Welcome](https://res.cloudinary.com/dbiliw2ja/image/upload/v1695031013/Welcome_df1dei.png)
![SellPanel](https://res.cloudinary.com/dbiliw2ja/image/upload/v1695031014/SellPanel_oyxgk7.png)
![Bill](https://res.cloudinary.com/dbiliw2ja/image/upload/v1695031013/Bill_w5sgvz.png)
![Book](https://res.cloudinary.com/dbiliw2ja/image/upload/v1695031013/Book_uxn2oj.png)
![Login](https://res.cloudinary.com/dbiliw2ja/image/upload/v1695031013/Login_sxg5ra.png)

This project served as an bookstore management application for bookstore owner. 
Tech using: Java, Java swing, Mysql (phpmyadmin) 

Features:

- Fully management features such as create,read,update,delete for product, genre, bill, employee, customer, account based on account privilege
- Basic privilege for all account (mainAdmin & Admin)
- Protection from accessing different panel based on account privilege
- Remembered account on login 
- Advanced search algorithm with multiple filters for different category/panel

Notes:
- You can add an account by adding an employee, default username will be the employee id and password will be "{EmployeeID}{Phone}"
- For now, only account with mainAdmin role (username: root, password: admin) can add employee, account, and only mainAdmin can access Account Panel
- You can extend this project by adding more role/privilege or adding more feature like discount/promotion for customer.
- When adding new book, fill all the information and for the image url you have to use this specific path src/img/book/{BookID}

### Prerequisites

**Mysql connector for Java**

**JDBC for database connection**

### Cloning the repository

```shell
git clone https://github.com/tuanloc288/java-swing-bookstore.git
```

### Setup database

Simply import the file in Database folder (doanjava.sql) on your phpmyadmin and name it doanjava.
If you want to change db name, make sure to match the url variable in mainBUS_DAO/mainDAO to "jdbc:mysql://localhost:3306/{DbName}"

### Start the app

Press F6 (default) or right click on main/main.java then choose Run file
