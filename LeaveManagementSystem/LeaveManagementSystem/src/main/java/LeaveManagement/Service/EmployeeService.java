package LeaveManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LeaveManagement.Entity.Employee;
import LeaveManagement.Repositories.EmployeeRepo;

	@Service
	public class EmployeeService {

	    @Autowired
	    EmployeeRepo employeeRepository;
	    public List<Employee> getAllEmployee;
	    public Employee getEmployeeById()
	    

}