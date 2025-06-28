
--  Create Accounts Table
CREATE TABLE IF NOT EXISTS Accounts (
    AccountID INT PRIMARY KEY,
    CustomerName VARCHAR(100),
    AccountType VARCHAR(20), 
    Balance DECIMAL(10, 2)
);

--  Create Employees Table
CREATE TABLE IF NOT EXISTS Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department VARCHAR(50),
    Salary DECIMAL(10, 2)
);

--  Insert Sample Data into Accounts
INSERT INTO Accounts VALUES (1, 'John', 'Savings', 10000)
    ON DUPLICATE KEY UPDATE Balance=10000;
INSERT INTO Accounts VALUES (2, 'Alice', 'Savings', 15000)
    ON DUPLICATE KEY UPDATE Balance=15000;
INSERT INTO Accounts VALUES (3, 'Bob', 'Current', 5000)
    ON DUPLICATE KEY UPDATE Balance=5000;
INSERT INTO Accounts VALUES (4, 'Michael', 'Savings', 20000)
    ON DUPLICATE KEY UPDATE Balance=20000;

--  Insert Sample Data into Employees
INSERT INTO Employees VALUES (101, 'Emily', 'HR', 50000)
    ON DUPLICATE KEY UPDATE Salary=50000;
INSERT INTO Employees VALUES (102, 'David', 'Sales', 60000)
    ON DUPLICATE KEY UPDATE Salary=60000;
INSERT INTO Employees VALUES (103, 'Sophia', 'HR', 55000)
    ON DUPLICATE KEY UPDATE Salary=55000;
INSERT INTO Employees VALUES (104, 'James', 'IT', 70000)
    ON DUPLICATE KEY UPDATE Salary=70000;

--  Scenario 1: Process Monthly Interest
DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
END$$

DELIMITER ;

-- ✅ Scenario 2: Update Employee Bonus by Department
DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN deptName VARCHAR(50),
    IN bonusPercent DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * (bonusPercent / 100))
    WHERE Department = deptName;
END$$

DELIMITER ;

-- ✅ Scenario 3: Transfer Funds Between Accounts
DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN fromAccountID INT,
    IN toAccountID INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE fromBalance DECIMAL(10,2);

    -- Get source account balance
    SELECT Balance INTO fromBalance
    FROM Accounts
    WHERE AccountID = fromAccountID;

    -- Check if balance is sufficient
    IF fromBalance >= amount THEN
        -- Deduct from source account
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = fromAccountID;

        -- Add to destination account
        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = toAccountID;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient funds in source account';
    END IF;
END$$

DELIMITER ;

--  Example Calls
-- Process interest for savings accounts
CALL ProcessMonthlyInterest();

-- Add 10% bonus to HR department
CALL UpdateEmployeeBonus('HR', 10);

-- Transfer 2000 from Account 1 to Account 3
CALL TransferFunds(1, 3, 2000);

--  Verify Data
SELECT * FROM Accounts;
SELECT * FROM Employees;
