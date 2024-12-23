


# Item Inventory Management System

Welcome to the **Item Inventory Management System**! This project is a Spring Boot-based RESTful API designed to help manage items in an inventory. It provides a simple and intuitive interface to perform CRUD (Create, Read, Update, Delete) operations on items, making it ideal for small to medium-sized inventory management tasks.

---

## Features
- **Add New Items**: Easily add items to the inventory with details like name, quantity, and price.
- **View All Items**: Fetch a complete list of items in the inventory.
- **Search for an Item**: Retrieve details of a specific item by its unique ID.
- **Update Item Details**: Modify an item’s name, quantity, or price as needed.
- **Delete Items**: Remove items from the inventory when they’re no longer needed.

---

## Technologies Used
- **Backend**: Spring Boot
- **Database**: MySQL
- **Build Tool**: Maven
- **Language**: Java
- **JSON Parsing**: Jackson


---

## Endpoints

| HTTP Method | Endpoint               | Description                     |
|-------------|------------------------|---------------------------------|
| `GET`       | `/Item/getListOfItems` | Fetches a list of all items.    |
| `GET`       | `/Item/getItem/{id}`   | Retrieves details of an item by its ID. |
| `POST`      | `/Item/addItem`        | Adds a new item to the inventory. |
| `PUT`       | `/Item/updateItem/{id}`| Updates an existing item.       |
| `DELETE`    | `/Item/deleteItem/{id}`| Deletes an item by its ID.      |

---

## Setup and Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/item-inventory.git
   cd item-inventory
   ```

2. **Set Up the Database**:
    - Install and configure MySQL.
    - Create a database named `inventory_management`:
      ```sql
      CREATE DATABASE inventory_management;
      ```

3. **Update Application Properties**:
    - Open `src/main/resources/application.properties` and configure your database credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/inventory_management
      spring.datasource.username=your_mysql_username
      spring.datasource.password=your_mysql_password
      spring.jpa.hibernate.ddl-auto=update
      ```

4. **Build and Run**:
    - Use Maven to build and start the application:
      ```bash
      mvn clean install
      mvn spring-boot:run
      ```

5. **Test the Endpoints**:
    - Use Postman, cURL, or any HTTP client to interact with the API.

---

## Sample JSON Payloads

### Add Item (`POST /Item/addItem`)
```json
{
  "name": "Laptop",
  "quantity": 10,
  "price": 1200.00
}
```

### Update Item (`PUT /Item/updateItem/1`)
```json
{
  "name": "Updated Laptop",
  "quantity": 8,
  "price": 1100.00
}
```

---



## Future Enhancements
- Add user authentication and role-based access control.
- Implement pagination and sorting for large datasets.
- Integrate a front-end interface for better usability.
- Add reporting features for inventory analysis.

---

## Contributors
- **Adithya Kasarla**: Developer  
  Contributions and suggestions are welcome! Feel free to fork the repository and submit pull requests.

---

## License
This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
```
