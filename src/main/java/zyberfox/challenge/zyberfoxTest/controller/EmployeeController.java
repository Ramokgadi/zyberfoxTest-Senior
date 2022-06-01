package zyberfox.challenge.zyberfoxTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zyberfox.challenge.zyberfoxTest.entity.Employee;
import zyberfox.challenge.zyberfoxTest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @GetMapping
    public List<Employee> getEmployees()
    {
        return service.getEmployees();
    }

    // add code to retrieve employee by Id and return the suitable http status


    @PutMapping(path = "/create")
    //add code to save the employee from json object and return and also return http status of Created or 201


    @PostMapping(path = "/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        //add code to update employee and return it
        // also return it a suitable http status
    }


    @PostMapping (value="/update-salary/{id}/{percentage}")
    public Employee updateSalary(@PathVariable ("id") int id, @PathVariable ("percentage") double percentage)
    {
        //add code to calculate increased of the selected employee and save to DB

    }
}
