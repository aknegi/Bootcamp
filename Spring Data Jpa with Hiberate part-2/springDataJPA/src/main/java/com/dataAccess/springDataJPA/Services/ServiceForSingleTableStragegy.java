package com.dataAccess.springDataJPA.Services;

import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.EntityesForSingleTableStrategy.SingleEntityTable.Permanent;
import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.EntityesForSingleTableStrategy.SingleEntityTable.Trainee;
import com.dataAccess.springDataJPA.Repositories.RepoForSingleTableStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceForSingleTableStragegy {

    @Autowired
    RepoForSingleTableStrategy repoForSingleTableStrategy;

    public void addPermanentEmployee() {
        Permanent permanent = new Permanent();
        permanent.setEmpName("Theta");
        permanent.setSalary(45000);
        permanent.setPermanentId("P101");
        repoForSingleTableStrategy.save(permanent);
    }

    public void addTraineeEmployee() {
        Trainee trainee = new Trainee();
        trainee.setEmpName("Beta");
        trainee.setSalary(15000);
        trainee.setTrainingId("T101");
        repoForSingleTableStrategy.save(trainee);
    }
}
