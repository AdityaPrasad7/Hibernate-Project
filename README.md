Hibernate Project

Overview
This project is a School Management System implemented using Java, Hibernate (JPA), and PostgreSQL. It manages entities such as School, Principal, Students, and Teachers, demonstrating ORM (Object-Relational Mapping) concepts.

Technologies Used
Java (JDK 17+)
Hibernate (JPA)
PostgreSQL
Maven (for dependency management)
Jakarta Persistence API


Project Structure
SchoolStudentPrincipal/
├── src/main/java/SchoolStudentPrincipal/
│   ├── Driver.java
│   ├── DriverToFind.java
│   ├── School.java
│   ├── Principal.java
│   ├── Students.java
│   ├── Teacher.java
│
├── src/main/resources/
│   ├── META-INF/
│   │   ├── persistence.xml
│
├── pom.xml
└── README.md


Installation & Setup

1. Clone the Repository
git clone https://github.com/your-username/hibernate-project.git
cd hibernate-project

2. Configure Database
Install PostgreSQL and create a database named school_db.
Update persistence.xml with your database credentials.

3. Build the Project
mvn clean install

5. Run the Application
Run the main class Driver.java to persist the school data.
mvn exec:java -Dexec.mainClass="SchoolStudentPrincipal.Driver"
Run DriverToFind.java to fetch and update data.
mvn exec:java -Dexec.mainClass="SchoolStudentPrincipal.DriverToFind"

Features
Add School with a Principal, Students, and Teachers
Fetch School details including associated entities
Update School name
Delete a Student from a School

Dependencies
Managed via Maven (pom.xml):
Hibernate Core 6.5.2.Final
PostgreSQL Driver 42.6.0
Jakarta Persistence API 3.1.0

Future Enhancements
Implement a web interface using Spring Boot & React
Add more CRUD operations with RESTful APIs
Implement authentication for secured access

License
This project is licensed under the MIT License.

Contributing
Contributions are welcome! Feel free to submit a pull request or open an issue.

Author
Aditya prasad Tripathy
LinkedIn: https://www.linkedin.com/in/aditya-prasad-tripathy-53a07a267/
