# Swift Wheels

This is a simple Java-based Bike Hiring System that allows customers to Hire and return bikes for a specified number of days. The system provides functionalities for Hiring available bikes, returning rented bikes, and viewing hiring information.

## Features

- Hire a bike for a specified number of days.
- View available bikes for hire.
- Calculate the hiring cost based on the number of days.
- Return a hired bike.
- Manage customers and hiring.

## Classes

### 1. `Bike`
- Represents a bike in the system.
- Contains attributes such as bike ID, brand, model, base price per day, and availability.
- Has methods for calculating rental price, renting the bike, and returning the bike.

### 2. `Customer`
- Represents a customer in the system.
- Contains attributes such as customer ID and name.

### 3. `Rental`
- Represents a hiring transaction.
- Contains information about the rented bike, the customer hiring the bike, and the hiring duration (number of days).

### 4. `BikeRentalSystem`
- The core class managing the bike rental system.
- It has lists to store bikes, customers, and hiring.
- It provides methods for hiring bikes, returning bikes, and displaying available options for the customer.
