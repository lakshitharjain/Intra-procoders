package com.infrrd.internal.employeemanagement;

import com.infrrd.internal.employeemanagement.entities.*;
import com.infrrd.internal.employeemanagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeemanagementApplication {

	@Autowired
	private  EmployeeRepository employeeRepository;

	@Autowired
	private DocumentMasterRepository documentMasterRepository;

	@Autowired
	private DocumentRepository documentRepository;

	@Autowired
	private SkillsMasterRepository skillsMasterRepository;

	@Autowired
    private SkillsRepository skillsRepository;

	public static void main(String[] args) {

		SpringApplication.run(EmployeemanagementApplication.class, args);
	}

	@Autowired
	public  void setEmployeeRepository() {
		Employee employee=new Employee(1  ,"bleh1@bleh.com", "bleh", 23452345, "ceo","HR", 2345234,"asdfaasfd", 2345234, 1);
		//employeeRepository.save(employee );
		DocumentMaster documentMaster = new DocumentMaster(1,"Address","yo", 23423, "Ravi", 345345, true);
		//documentMasterRepository.save(documentMaster );
		Document document = new Document( 1, documentMaster, "asdfasdfasdf",true, true, "Ravi", 34534, "RAvi", 34534, 1, employee) ;
		documentRepository.save(document);

		SkillsMaster skillsMaster=new SkillsMaster(2, "awesomeSkill", "Ravi", 34324, "Ravi", 23453, 1);
		skillsMasterRepository.save(skillsMaster);

        Skills skills=new Skills(2,"Ravi", 345345, "Ravi", 456456, 1, skillsMaster, employee);
        skillsRepository.save(skills);

	}
}
