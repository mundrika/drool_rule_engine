package org.hiring.employee.service;

import static org.junit.Assert.assertEquals;
import org.hiring.employee.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpEligibilityCheckServiceTest {
	@Autowired
	EmpEligibilityCheckService empelgbCheck;

	
	@Test
    void empEligibilityCheckIfAgeLessThan21() {
		
        Employee emp = new Employee();
        emp.setAge(20);
        emp.setName("XYZ");
        empelgbCheck.applyEligibilityRules(emp);
        assertEquals(true, emp.getEligibiltyStatus());
    }
     
	@Test
    void empEligibilityCheckIfAgeEquqlTo21() {
        Employee emp = new Employee();
        emp.setAge(21);
        emp.setName("XYZ");
        empelgbCheck.applyEligibilityRules(emp);
        assertEquals(true, emp.getEligibiltyStatus());
    }
	@Test
    void empEligibilityCheckIfAgeGreaterThan21() {
        Employee emp = new Employee();
        emp.setAge(22);
        emp.setName("XYZ");
        empelgbCheck.applyEligibilityRules(emp);
        assertEquals(false, emp.getEligibiltyStatus());
    }

	
	
		
}
