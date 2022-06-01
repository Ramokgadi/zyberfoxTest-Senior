package zyberfox.challenge.zyberfoxTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zyberfox.challenge.zyberfoxTest.entity.Employee;
import zyberfox.challenge.zyberfoxTest.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Save and return employee object
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    // Add code to update and return employee object below


    //Add code to return all employees


    // add code to find employee by ID


    public double calculateSalaryIncrease(double increasePercentage,double salary)
    {
        //add code and return increased salary
    }
}
