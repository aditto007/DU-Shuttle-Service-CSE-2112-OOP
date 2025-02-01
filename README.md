# DU Shuttle Service

## Overview
The **DU Shuttle Service** is an Object-Oriented Programming (OOP) based project designed to enhance campus transportation with smart ticketing, route details, and a seamless, cashless shuttle experience for Dhaka University students. Built with **Java Swing** for UI, **MySQL** for database management, and **Apache Ant** for project build automation, this system ensures modularity, scalability, and an efficient user experience.

## Homepage Preview
![DU Shuttle Service Start Page](src/visuals/StartPage.png)

## Technologies Used
### Programming & IDE
- **Java (JDK 22)**
- **NetBeans IDE**
- **Apache Ant** (Build automation tool)

### Database
- **MySQL** for data storage and retrieval

### UI Libraries & Tools
- **Java Swing** for graphical user interface
- **JCalendar** for date selection

## Installation Guide

### Prerequisites
Before setting up the project, ensure the following are installed:
- **Java JDK 22**
- **NetBeans IDE**
- **MySQL Server**
- **Apache Ant** configured in NetBeans

### Steps to Set Up the Project
1. **Download the Project**
   - Download the zip file from the [GitHub repository](your-github-repo-link-here).
   - Extract the file and rename it to **"DU Shuttle Service"**.

2. **Import Project into NetBeans**
   - Open **NetBeans IDE**.
   - Click on **File > Open Project**.
   - Navigate to the extracted folder and select the project.

3. **Set Up Database**
   - Open MySQL and create a new database.
   - Import the provided SQL file to set up tables and initial data.
   
4. **Run the Project**
   - Build the project using **Apache Ant**.
   - Run the main file to start the application.
5. **Another Way to Run the Project**
   - Download the `dist` folder from the repository.
   - Open a terminal and navigate to the `dist` folder.
   - Run the JAR file using the following command:
     ```sh
     java -jar DU_Shuttle_Service.jar
     ```
   - Ensure you have **JDK 22** installed on your system to run the JAR file.     

## Features
- **Smart Ticketing System**: Digital ticket purchasing with payment.
- **Add Money**: Add money with popular payment portals.
- **Cashless Payments**: Seamless transactions for student convenience.
- **User Authentication**: Secure login for students.
- **Easy Access**: Access to the route details, emergency call, and complaints/suggestions.
## Troubleshooting
### Database Connection Issues
- Ensure **MySQL** is running and credentials are correct.
- Verify that the **MySQL JDBC driver** is properly configured.

### Build Errors in NetBeans
- Ensure **Apache Ant** is installed and configured.
- Check if all required JAR files (**JCalendar, iText**) are properly added to the project.

## Future Plan
- **Admin Interface** – To control and observe the ticket buyers.
- **Online Payment Integration** – Integrating with popular online payment methods.
- **Mobile Application** – Develop an Android/iOS version for better accessibility.
- **Live Location Tracking** – Live Location of the transport.
## Contribution
We welcome contributions! Feel free to fork the repository, make improvements, and submit a pull request.

## License
This project is licensed under the [MIT License](LICENSE).

---
**Developed by DU Shuttle Service Team** 🚍
