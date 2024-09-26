# 💰 Payable Management System with CLI
## 📖 Introduction
The **Payable Management System** is a Java-based application with a **Command Line Interface (CLI)** for managing payables, such as invoices and employee payroll. It helps automate the calculation of payments and keeps track of different payable types. This project is built using Object-Oriented Programming (OOP) principles and offers flexibility for different employee types and invoicing.

## ✨ Features
- **🧾 Invoice Management**: Easily add invoices with part details, quantity, and price per item.
- **💼 Employee Payroll Management**:
  - Hourly Employees
  - Commission Employees
  - Base-Plus Commission Employees
- **🔧 Command Line Interface (CLI)**: A simple and intuitive CLI that allows the user to:
  - Register new payables
  - View and print payable records
  - Export payable details to a file
- **🛡️ Error Handling and Input Validation**: Ensures that input data (such as wages, hours, and sales) is valid before processing.
- **💸 Payment Calculation**: Automatically calculates payments for employees or invoices.
- **📁 File Export**: Allows exporting all payable records into a text file.

## 🛠 Technologies
- **☕ Java**: Core language for the entire project.
- **🧩 Object-Oriented Programming**: Utilized to manage different types of employees and invoices.
- **📄 File I/O**: Payable records can be written to a file for external use.
- **⚠️ Exception Handling**: Robust error handling for validating input.

## 🚀 Usage
Once the program is running, you'll interact with a menu-driven interface:

- **📝 Register New Payable**: Choose to register an invoice or employee (hourly, commission-based, or base-plus commission-based).
- **📊 View Payable Records**: Displays a summary of all the payables in the system.
- **💾 Export Payables to File**: Saves all the payable records into a text file (print.txt) on your system for future reference.

## 📂 Payable Types
- **🧾 Invoice**: Register invoices with part number, description, quantity, and price per item.
- **👷 HourlyEmployee**: Enter employee's details, hourly wage, and hours worked to calculate the payment.
- **💼 CommissionEmployee**: Register commission-based employees and input their gross sales and commission rate.
- **💰 BasePlusCommissionEmployee**: Employees with a base salary in addition to commission on sales.

## 💾 File Export
All payable records can be exported to a **print.txt** file using the Print Payable option from the main menu. This file will include a detailed summary of all registered invoices and employee payables.

## Demo Video
[Download Project Demo Video](Demo.mp4)

## 🔮 Future Enhancements
- Add support for salaried employees.
- Improve the CLI to include more advanced navigation options.
- Add database integration to store and manage records persistently.
- Implement a GUI for easier interaction beyond the command line.
