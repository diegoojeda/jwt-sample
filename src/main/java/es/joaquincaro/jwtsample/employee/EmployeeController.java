package es.joaquincaro.jwtsample.employee;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class EmployeeController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Employee>> getCompetitions() {
		Iterable<Employee> employees = Arrays.asList(
				new Employee("Juan", "Garcia", "CTO"),
				new Employee("Pedro", "lopez", "CIO"));
		return new ResponseEntity<Iterable<Employee>>(employees, HttpStatus.OK);
	}
}
