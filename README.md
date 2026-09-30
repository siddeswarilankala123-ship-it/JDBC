# Function Hall Booking - Database ZIP

This package contains the database structure for an Online Function Hall Booking application.

Tables:
1. users
2. function_halls
3. bookings

Relationships:
users.id -> bookings.user_id
function_halls.id -> bookings.hall_id

How to use:
1. Install MySQL.
2. Open MySQL Workbench.
3. Open database/schema.sql.
4. Execute the complete script.
5. Your Java/JDBC application can connect to database `hall_booking`.

JDBC URL:
jdbc:mysql://localhost:3306/hall_booking

Update your Java DB connection with your MySQL username and password.

Note: The sample password column is intentionally just a database field. For a real application, store securely hashed passwords rather than plain text.
