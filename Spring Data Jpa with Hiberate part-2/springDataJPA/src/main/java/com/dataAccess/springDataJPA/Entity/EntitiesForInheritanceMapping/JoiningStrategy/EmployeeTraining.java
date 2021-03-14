package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.JoiningStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_training")
@PrimaryKeyJoinColumn(name = "emp_id")
public class EmployeeTraining extends  EmployeeForJoiningStrategy{
    @Column(name = "emp_id")
    private int Id;
    @Column(name = "training_id")
    private String trainingId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }
}
