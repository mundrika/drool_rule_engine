
package org.hiring.employee.controller;


import org.hiring.employee.model.Employee;
import org.hiring.employee.service.EmpEligibilityCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmpEligibilityCheckController {
	@Autowired
	private EmpEligibilityCheckService empEligibilityCheckServ;

	@PostMapping("/eligible")
	public String applyEligibilityRules(@RequestBody Employee emp) {
		empEligibilityCheckServ.applyEligibilityRules(emp);
		return emp.sendResponse();
	}

}

