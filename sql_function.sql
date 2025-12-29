SHOW DATABASES;

create table Hospitals (H_code int primary key, H_Name varchar(20), h_Location varchar(50));
CREATE DATABASE hospital_db;
USE hospital_db;

CREATE TABLE Hospitals (
    H_code INT PRIMARY KEY,
    H_Name VARCHAR(20),
    h_Location VARCHAR(50)
);

INSERT INTO Hospitals (H_code, H_Name, h_Location)
VALUES
(101, 'City Hospital', 'Mumbai'),
(102, 'Care Hospital', 'Pune'),
(103, 'Apollo Hospital', 'Delhi');

select * from Hospitals; 
-- write a query to extract left most fom the table-- 

SELECT LEFT(H_Location, 5) from Hospitals;

-- write a query to extract right most 7 character fom hospital location for each hospital the table-- 


SELECT RIGHT(H_Name, 4) AS last_four_chars
FROM Hospitals
WHERE H_code = 101;

SELECT ASCII('A') AS ascii_value;

SELECT H_Name,
       ASCII(LEFT(H_Name, 1)) AS ascii_value
FROM Hospitals;

-- write a query to ascii value of 2nd character in the hostpital name --

SELECT H_Name,
       ASCII(SUBSTR(H_Name, 2, 1)) AS ascii_value
FROM Hospitals;

-- Number function 1.mod 2.abs--
SELECT product_name, product_id
FROM products
WHERE MOD(product_id, 2) = 1;

-- write a query to find products with a product price that leave a remainder of 99.03400 and divided by 100 --
SELECT product_name, product_price
FROM products
WHERE MOD(product_price, 100) = 99.03400;

-- write a query to display remainder when 123 is divided by 2 --
SELECT MOD(123, 2) AS remainder;

-- predict the output of following query --
select mod(0,0); -- null or MySQL: ERROR 1365: Division by 0--

-- write a query to display product name and rounded product price to the nearest integer for all products --
SELECT product_name, ROUND(product_price) AS rounded_price
FROM products;

-- write a query to display product name and rounded product price to fisrt decimal place for all product and display the output as rounded price
SELECT product_name, ROUND(product_price, 1) AS rounded_price
FROM products;

-- write a query to retrive a list of product names and their prices rounded to nearest hundred give qurry in one line --  
SELECT product_name, ROUND(product_price, -2) AS rounded_price FROM products;

-- write a query to display the result and 44.3989 rounded to position 2 --
SELECT ROUND(44.3989, 2) AS result;

-- write a query to display product name and truncated product price to 2 decimal places for all products --
SELECT 
    product_name,
    TRUNCATE(product_price, 2) AS truncated_price
FROM products;

-- write a query to display result when 1234.567 truncated to position 2 --
SELECT TRUNCATE(1234.567, 2) AS result;

-- write a query to display product name and square of product price --
SELECT product_name, POWER(product_price, 2) AS price_square FROM products;

-- write a query to display product name and product price and ceilin value of the product prices as ceiling price --
SELECT product_name, product_price, CEILING(product_price) AS ceiling_price FROM products;

SELECT product_name, product_price, FLOOR(product_price) AS floor_price FROM products;


-- write a query to find current date --
SELECT CURDATE();

-- write a query to find current time --
SELECT CURTIME() AS current_time;

-- how can you retrive passenger name and booking date and time who there booking on or after the current date and time write a query --
select passenger_name, booking_datetime from booking where booking_datetime >= now();
SELECT passenger_name, booking_datetime FROM bookings WHERE booking_datetime >= SYSDATE;

-- how can you retriv ethe passenger on october 2026-10-23 and displayy their name and booking datesqueries in sql --
SELECT passenger_name, date(booking_date)
FROM booking
WHERE DATE(booking_date) = '2026-10-23';


select date(now());

-- write a quey to display current date using now() --
SELECT DATE(NOW());

-- write a query to display time to date and time 2023-1-28 17:15:59 --
SELECT TIME('2023-01-28 17:15:59');

-- write a query to display passenger name and booking date time who booked their ticket in the morning befor 12pm --
select p_name, b_date from booking where time(b_date) < '12:00:00';

-- write a query to display a passengerr name and booking time to made their booking during the morning hours between 6 and 11:59 --
select p_name, time(b_date) from booking where time(b_date) between '06:00:00' AND '11:59:59';


-- time stand differnce, date_add. write a query to find no. of year , month, days between 2023-1-11 to 2024-1-11 and disply the result year_diff, month_diff, day_diff --
select timestampdiff(year, '2023-01-11', '2024-01-11') AS year_difference,
	timestampdiff(month, '2023-01-11', '2024-01-11') AS month_difference,
    timestampdiff(day, '2023-01-11', '2024-01-11') AS day_difference;
    
select timestampdiff(hour, '2023-01-01 12:10:10', '2023-10-11 12:10:10') AS hour_difference,
	timestampdiff(minute, '2023-01-01 12:10:10', '2023-10-11 12:10:10') AS minute_difference,
    timestampdiff(second, '2023-01-01 12:10:10', '2023-10-11 12:10:10') AS second_difference;
    
select p_name, b_date, timestampdiff(day, b_date, now()) as day_booking from booking;    

-- write a query add four hours and display the output as added four hrs add 10 minuts and display output as added 10 minute add 12 second and display the output as added 12 sec to a date time 2023-1-11 12:03:26 --
SELECT 
    ADDTIME('2023-01-11 12:03:26', '04:00:00') AS added_four_hrs,
    ADDTIME('2023-01-11 12:03:26', '00:10:00') AS added_10_minute,
    ADDTIME('2023-01-11 12:03:26', '00:00:12') AS added_12_sec;
    
    SELECT 
    DATE_ADD('2023-01-11 12:03:26', INTERVAL 4 HOUR) AS added_four_hrs,
    DATE_ADD('2023-01-11 12:03:26', INTERVAL 10 MINUTE) AS added_10_minute,
    DATE_ADD('2023-01-11 12:03:26', INTERVAL 12 SECOND) AS added_12_sec;

SELECT 
    timestampadd(hour, 4 , '2023-01-11 12:03:26') AS added_four_hrs,
    ADDTIME('2023-01-11 12:03:26', '00:10:00') AS added_10_minute,
    ADDTIME('2023-01-11 12:03:26', '00:00:12') AS added_12_sec;
    
    
     SELECT 
    DATE_ADD('2023-01-01', INTERVAL 3 day) AS added_3_day,
    DATE_ADD('2023-01-01', INTERVAL 5 month) AS added_5_months,
    DATE_ADD('2023-01-01', INTERVAL 2 year) AS added_2_years;

-- write a aquery to retirve passgener name and booking date time who has book their ticket exactly 16 days before the current date --
select p_name, b_date from booking where date(b_date) = current_date() - interval 16 day;
-- or --
SELECT p_name, b_date FROM booking
WHERE TIMESTAMPDIFF(DAY, b_date, CURRENT_DATE()) = 16;

SELECT DATE_ADD(2023-10-25, INTERVAL 3 HOUR) as result;

select p_name, b_date from booking where timestampdiff(day, b_date, LAST_DAY(b_date)) < 5;


select p_name, b_date from booking where month(b_date) between 6 and 12;

SELECT DAYNAME('2023-10-10') AS day_name;
-- can we retrive thier passenger names who booked thier on the weekend saturday and sunday -- 
SELECT p_name, b_date
FROM booking
WHERE DAYNAME(b_date) IN ('Saturday', 'Sunday');

-- write a query to retrive passenger name who booked their tickets between mondat to friday --
select p_name, b_date from booking where dayname(b_date) IN ('Monday','Tuesday','Wednesday','Thursday','Friday');
SELECT p_name, b_date FROM booking WHERE DAYNAME(b_date) NOT IN ('Saturday', 'Sunday');


