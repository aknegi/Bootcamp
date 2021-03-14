package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.EntityesForSingleTableStrategy.SingleEntityTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "Trainee")
public class Trainee extends EmployeeForSingleTableStrategy {
    @Column(name = "training_id")
    private String trainingId;

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }
}
