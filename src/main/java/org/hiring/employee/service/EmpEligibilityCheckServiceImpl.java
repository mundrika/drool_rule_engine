package org.hiring.employee.service;

import org.hiring.employee.model.Employee;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class EmpEligibilityCheckServiceImpl implements EmpEligibilityCheckService {
	
	  private final KieContainer kieContainer;
	  
	   public  EmpEligibilityCheckServiceImpl(KieContainer kieContainer) {
	        this.kieContainer = kieContainer;
	    }
	 
	public void applyEligibilityRules(Employee emp) {
		
	    KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(emp);
        kieSession.fireAllRules();
        kieSession.dispose();
		
	}
	

 
}

