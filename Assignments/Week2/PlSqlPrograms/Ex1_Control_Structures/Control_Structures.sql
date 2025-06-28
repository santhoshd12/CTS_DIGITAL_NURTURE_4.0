use plsqlprog;

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Balance DECIMAL(10, 2),
    LoanInterestRate DECIMAL(5, 2),
    IsVIP VARCHAR(5) DEFAULT 'FALSE'
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);


-- Insert Customers
INSERT INTO Customers (CustomerID, Name, Age, Balance, LoanInterestRate)
VALUES (1, 'John', 65, 12000, 8.5);

INSERT INTO Customers (CustomerID, Name, Age, Balance, LoanInterestRate)
VALUES (2, 'Alice', 58, 9000, 7.5);

INSERT INTO Customers (CustomerID, Name, Age, Balance, LoanInterestRate)
VALUES (3, 'Bob', 62, 5000, 9.0);

-- Insert Loans
INSERT INTO Loans (LoanID, CustomerID, DueDate)
VALUES (101, 1, CURDATE() + INTERVAL 10 DAY);

INSERT INTO Loans (LoanID, CustomerID, DueDate)
VALUES (102, 2, CURDATE() + INTERVAL 40 DAY);

INSERT INTO Loans (LoanID, CustomerID, DueDate)
VALUES (103, 3, CURDATE() + INTERVAL 20 DAY);
delete from customers where age = null;
select * from Customers;
select * from loans;


DELIMITER $$

CREATE PROCEDURE ApplyInterestDiscount()
BEGIN
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE Age > 60;
END$$

DELIMITER ;

-- Run the procedure
CALL ApplyInterestDiscount();


DELIMITER $$

CREATE PROCEDURE PromoteVIP()
BEGIN
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE Balance > 10000;
END$$

DELIMITER ;

-- Run the procedure
CALL PromoteVIP();


DELIMITER $$

CREATE PROCEDURE LoanReminder()
BEGIN
    SELECT 
        CONCAT('Reminder: Dear ', c.Name, 
               ', your loan (Loan ID: ', l.LoanID, 
               ') is due on ', DATE_FORMAT(l.DueDate, '%d-%b-%Y')) AS ReminderMessage
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.DueDate BETWEEN CURDATE() AND CURDATE() + INTERVAL 30 DAY;
END$$

DELIMITER ;

-- Run the procedure
CALL LoanReminder();

