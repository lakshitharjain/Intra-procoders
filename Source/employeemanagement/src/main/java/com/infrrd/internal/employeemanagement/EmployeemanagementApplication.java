package com.infrrd.internal.employeemanagement;

import com.infrrd.internal.employeemanagement.entities.*;
import com.infrrd.internal.employeemanagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;

@SpringBootApplication
public class EmployeemanagementApplication {

    @Autowired
    private EmployeeRepository employeeRepository;

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
    public void setEmployeeRepository() {
        Employee employee = new Employee(1, "bleh1@bleh.com", "bleh", new Timestamp(System.currentTimeMillis()), "ceo", "HR", new Timestamp(System.currentTimeMillis()), "asdfaasfd", new Timestamp(System.currentTimeMillis()), 1);
        employeeRepository.save(employee);
        DocumentMaster documentMaster = new DocumentMaster(1, "Address", "yo", new Timestamp(System.currentTimeMillis()), "Ravi", new Timestamp(System.currentTimeMillis()), 1);
      //  documentMasterRepository.save(documentMaster);
        Document document = new Document(1, documentMaster, "asdfasdfasdf", true, true, "Ravi", new Timestamp(System.currentTimeMillis()), "RAvi", new Timestamp(System.currentTimeMillis()), 1, employee);
       // documentRepository.save(document);

        SkillsMaster skillsMaster = new SkillsMaster(2, "awesomeSkill", "Ravi", new Timestamp(System.currentTimeMillis()), "Ravi", new Timestamp(System.currentTimeMillis()), 1);
        //skillsMasterRepository.save(skillsMaster);

        Skills skills = new Skills(2, "Ravi", new Timestamp(System.currentTimeMillis()), "Ravi", new Timestamp(System.currentTimeMillis()), 1, skillsMaster, employee);
        //skillsRepository.save(skills);

    }
}
