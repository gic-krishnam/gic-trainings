package net.javaguides.springboot.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
    //get employees
	
	@GetMapping("employees")
	public List<Employee> getAllEmployee(){
		return this.employeeRepository.findAll();
	}
	//get employees by id
	@GetMapping("/employees{id}")
	public ResponseEntity<Employee> getUserById(@PathVariable (value = "id") long employeeId) 
	throws ResourceNotFoundException {
		Employee employee =employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found with id :" + employeeId));
				return ResponseEntity.ok().body(employee);
	}
	//save employee
	@PostMapping("employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return this.employeeRepository.save(employee);
	}
	
	//update employee
	@PutMapping("/employee/{id}")
	public ResponseEntity<Employee> updateEmployee( @PathVariable (value="id") long employeeId,
			@Validated @RequestBody Employee employeeDetails) {
		 Employee employee = employeeRepository.findById(employeeId)
			.orElseThrow(() -> new ResourceNotFoundException("Employee not found with id :" + employeeId));
		 employee.setFirstname(employeeDetails.getFirstname());
		 employee.setLastname(employeeDetails.getLastname());
		 employee.setEmail(employeeDetails.getEmail());
		 return ResponseEntity.ok(this.employeeRepository.save(employee));
	}
	
	//delete employee
	@DeleteMapping("/employee/{id}")
	public Map<String,Boolean> deleteEmployee(@PathVariable (value="id") long employeeId){
		 Employee employee = this.employeeRepository.findById(employeeId)
					.orElseThrow(() -> new ResourceNotFoundException("Employee not found with id :" + employeeId));
		 this.employeeRepository.delete(employee);
		 Map<String,Boolean> response=new HashMap<>();
		 response.put("deleted",Boolean.TRUE);
		 
		 return response;
}
}