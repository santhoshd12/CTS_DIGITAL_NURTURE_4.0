package com.cognizant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static EmployeeService employeeService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        employeeService = context.getBean(EmployeeService.class);

        LOGGER.info("Inside main");
        testAddEmployee();
    }

    private static void testAddEmployee() {
        LOGGER.info("Start");

        Employee emp = new Employee();
        emp.setName("Dummy");
        emp.setSalary(5000);

        employeeService.addEmployee(emp);

        LOGGER.info("End");
    }
}
