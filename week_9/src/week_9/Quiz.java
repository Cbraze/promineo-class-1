package week_9;

public class Quiz {
	
	/**********************************************************************************
	 * Multiple Choice: 2 points each
	 **********************************************************************************/
	
	/* 1. What does the C in CRUD stand for?
	 * 	a. concat
	 * 	b. create
	 * 	c. correct
	 * 	d. compute
	 */
	 char answer1 = ' ';
	  
	/* 2. What does the R in CRUD stand for?
	 * 	a. rewrite
	 * 	b. retrieve
	 * 	c. remember
	 * 	d. read
	 */
	 char answer2 = ' ';
	  
	/* 3. Which SQL command is used to create new data?
	 * 	a. CREATE
	 * 	b. INSERT INTO
	 * 	c. MAKE NEW
	 * 	d. CREATE INTO
	 */
	 char answer3 = ' '; 
	 
	/* 
	 * 4. How can you see what rows will be deleted before deleting them?
	 * a. Run a SELECT query with the same WHERE clause first.
	 * b. Add `VERIFY` to the end of your DELETE command.
	 * c. Enable MySQL's safe delete feature.
	 * d. Omit the WHERE clause from your DELETE command.
	 */ 
	 char answer4 = ' ';
	 
	/* 
	 * 5. Given a table named `customers` which of the following is a correct UPDATE command?
	 * a. UPDATE first_name FROM 'BOB' SET customers TO CHANGE;
	 * b. UPDATE first_name FROM customers WHERE id = 2003;
	 * c. UPDATE customers CHANGE first_name TO 'BOB' WHERE id = 2003;
	 * d. UPDATE customers SET first_name = 'Bob' WHERE id = 2003;
	 */ 
	 char answer5 = ' ';
	 
	/* 
	 * 6. In a SELECT, how can we show the result set by descending birth_date?
	 * a. Add `SELECT * DESC BY birth_date`
	 * b. Add `LIST birth_date DESC;`
	 * c. Add `GROUP BY birth_date DESC;`
	 * d. Add `ORDER BY birth_date DESC;`
	 */ 
	 char answer6 = ' ';
	 
	/* 
	 * 7. What does SQL stand for?
	 * a. Semantic Query Language
	 * b. Sweet Query Language
	 * c. Structured Query Language
	 * d. Sombrero Query Language
	 */ 
	 char answer7 = ' ';
	 
	/* 
	 * 8. An INNER JOIN only returns rows where _______.
	 * a. The left tables contains a value
	 * b. both tables contain a value
	 * c. The right table contains a value
	 * d. The right or the left table contains a value
	 */ 
	 char answer8 = ' ';
	 
	/* 
	 * 9. A LEFT JOIN only returns rows where _______.
	 * a. The left tables contains a value
	 * b. both tables contain a value
	 * c. The right table contains a value
	 * d. The right or the left table contains a value
	 */ 
	 char answer9 = ' ';
	 
	/* 
	 * 10. A FULL OUTER JOIN only returns rows where _______.
	 * a. The left tables contains a value
	 * b. The right or the left table contains a value
	 * c. The right table contains a value
	 * d. both tables contain a value
	 */ 
	 char answer10 = ' ';
	 
	/* 
	 * 11. What must you have in order to use GROUP BY in your query?
	 * a. An aggregate function.
	 * b. A HAVING clause.
	 * c. At least 100 rows of data returned in your result set.
	 * d. MySQL version 8 or later.
	 */ 
	 char answer11 = ' ';
	 
	/* 
	 * 12. What does a HAVING clause do?
	 * a. It is a function that can be used in place of a WHERE clause.
	 * b. HAVING is not a SQL command.
	 * c. Functions like a WHERE clause, but for aggregated data using GROUP BY.
	 * d. Shows all tables with a specific column name.
	 */ 
	 char answer12 = ' ';
	 
	/* 
	 * 13. What is wrong with the following query?
	 * `SELECT c.first_name, p.phone_number FROM customer INNER JOIN ON phonenumbers p.customer_id = c.id;
	 * a. The ON is in the wrong spot; it should come before the condition.
	 * b. You always have to use the full name of the table in the SELECT clause.
	 * c. No aliases where provided, but they were used in the SELECT clause.
	 * d. Both a and c.
	 */ 
	 char answer13 = ' ';
	 
	/* 
	 * 14. Which command is used to make a new database?
	 * a. CREATE DATABASE [database name];
	 * b. MAKE DATABASE [database name];
	 * c. NEW DATABASE [database name];
	 * d. DATABASE [database name];
	 */ 
	 char answer14 = ' ';

	/* 
	 * 15. Which of the following correctly sets a tables primary key?
	 * a. PRIMARY KEY AS id;
	 * b. PRIMARY KEY = id;
	 * c. PRIMARY KEY id;
	 * d. PRIMARY KEY (id);
	 */ 
	 char answer15 = ' ';
	 
	/* 
	 * 16. Which of the following correctly sets a foreign key that points to the id column on the customers table?
	 * a. ADD FOREIGN KEY (customer_id) REFERENCES customers(id);
	 * b. FOREIGN KEY (customer_id) REFERENCES customers(id);
	 * c. ADD FOREIGN KEY (customer_id) REFERS TO customers(id);
	 * d. FOREIGN KEY (customer_id) REFERS TO customers(id);
	 */ 
	 char answer16 = ' ';
	 
	/* 
	 * 17. When creating a new table, what are the columns and constraints seperated by?
	 * a. periods
	 * b. semicolons
	 * c. commas
	 * d. nothing
	 */ 
	 char answer17 = ' ';
	 
	/* 
	 * 18. What happens if you try to enter data with a foreign key value that doesn't exist in the referenced table?
	 * a. MySQL will change the value to an existing value implicitly.
	 * b. It will create a row in the references table with that value.
	 * c. It will cause a join to be null on that value for that row.
	 * d. MySQL throws an error.
	 */ 
	 char answer18 = ' ';
	 
	/* 
	 * 19. How do you delete a table?
	 * a. DELETE TABLE [table name];
	 * b. DROP TABLE [table name];
	 * c. DROP [table name];
	 * d. DELETE [table name];
	 */ 
	 char answer19 = ' ';
	 
	/* 
	 * 20. What do you add to a column if it cannot have an empty value?
	 * a. NEVER EMPTY
	 * b. NOT NULL
	 * c. NOT EMPTY
	 * d. NEVER NOT SOMETIMES EMPTY OR NULL
	 */ 
	 char answer20 = ' ';
	 
	/**********************************************************************************
	 * true or false: 2 points each
	 **********************************************************************************/
	 
	// 21. `SELECT * FROM employees WHERE last_name LIKE 'A%';` returns all employees with a last_name that starts with `a`;
	boolean answer21 = ;
	 
	// 22. The INSERT INTO command inserts rows into a table.
	boolean answer22 = ;
	
	// 23. The CREATE TABLE command creates a new table.
	boolean answer23 = ;
	
	// 24. `SELECT first_name FROM customers WHERE last_name = "smith";` will not work because last_name isn't mentioned in the SELECT statement.
	boolean answer24 = ;
	
	// 25. SQL stands for Structured Query Language.
	boolean answer25 = ;
	
	// 26. All relational databases use the exact same SQL syntax.
	boolean answer26 = ;
	
	// 27. CRUD stands for Create, Retrieve, Update, and Delete.
	boolean answer27 = ;
	
	// 28. HAVING can only be used after GROUP BY.
	boolean answer28 = ;
	
	// 29. HAVING and WHERE are interchangeable.
	boolean answer29 = ;
	
	// 30. When we see duplicated rows, like address1, address2, address3, we need to normalize our tables.
	boolean answer30 = ;
	
	// 31. `DELETE TABLE [table name];` deletes a table.
	boolean answer31 = ;
	
	// 32. `DELETE DATABASE [database name];` deletes a database;
	boolean answer32 = ;
	
	// 33. ERD stand for Every Relationship Diagram.
	boolean answer33 = ;
	
	// 34. `UPDATE COLUMN` is used to change a fields value.
	boolean answer34 = ;
	
	// 35. `INSERT INTO [database name]` will create a new table.
	boolean answer35 = ;
	
	// 36. Foreign key data types must match the data type of the column they point to.
	boolean answer36 = ;
	
	// 37. CONCAT() is an aggregate function.
	boolean answer37 = ;
	
	// 38. The best way to create a many to many relationship is using two tables. 
	boolean answer38 = ;
	
	// 39.A composite key is a primary key made of multiple columns instead of one.
	boolean answer39 = ;
	
	// 40. You can create a many to many relationship with two tables, but you will have a lot of data duplication.
	boolean answer40 = ;
	
	
	/**********************************************************************************
	 * Essay Questions: 5 points each
	 * 
	 * Use the employees database schema to answer these questions.
	 **********************************************************************************/
	
	/* 41. Write a query that shows all employees with a last_name that starts with `a`.
	 *  
	 */
	
	/* 42. Write a query that shows all titles and last names for employees who have a last_name that ends with `s`.
	 *  
	 */
	
	/* 43. Write a query that shows all salaries, titles, and first names for employees in the marketing department.
	 *  
	 */
	
	/* 44. Write a query that shows the max salary by department.
	 *  
	 */

}
