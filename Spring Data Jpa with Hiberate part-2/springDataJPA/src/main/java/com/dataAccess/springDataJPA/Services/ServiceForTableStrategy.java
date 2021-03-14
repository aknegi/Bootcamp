package com.dataAccess.springDataJPA.Services;

import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.TableStrategy.PermanentEmployee;
import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.TableStrategy.TraineeEmployee;
import com.dataAccess.springDataJPA.Repositories.RepoForTableStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceForTableStrategy {
    @Autowired
    RepoForTableStrategy repoForTableStrategy;

    public void addPermanentEmployee() {
        PermanentEmployee permanent = new PermanentEmployee();
        permanent.setId(1);
        permanent.setEmpName("Theta");
        permanent.setSalary(55000);
        permanent.setPermanentId("P101");
        repoForTableStrategy.save(permanent);
    }

    public void addTraineeEmployee() {
        TraineeEmployee trainee = new TraineeEmployee();
        trainee.setId(2);
        trainee.setEmpName("Beta");
        trainee.setSalary(15000);
        trainee.setTrainingId("T101");
        repoForTableStrategy.save(trainee);
    }
}
