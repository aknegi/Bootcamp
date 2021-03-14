package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.TableStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trainee_employee")
public class TraineeEmployee extends EmployeeForTableStrategy {
    @Column(name = "training_id")
    private String trainingId;

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }
}
