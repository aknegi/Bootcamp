package com.dataAccess.springDataJPA.Services;

import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.JoiningStrategy.EmployeePermanent;
import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.JoiningStrategy.EmployeeTraining;
import com.dataAccess.springDataJPA.Repositories.RepoForJoiningStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceForJoiningStrategy {
    @Autowired
    RepoForJoiningStrategy repoForJoiningStrategy;

    public void addPermanentEmployee() {
        EmployeePermanent permanent = new EmployeePermanent();
        permanent.setId(1);
        permanent.setEmpName("Theta");
        permanent.setPermanentId("P101");
        repoForJoiningStrategy.save(permanent);
    }

    public void addTraineeEmployee() {
        EmployeeTraining trainee = new EmployeeTraining();
        trainee.setId(2);
        trainee.setEmpName("Beta");
        trainee.setTrainingId("T101");
        repoForJoiningStrategy.save(trainee);
    }
}
