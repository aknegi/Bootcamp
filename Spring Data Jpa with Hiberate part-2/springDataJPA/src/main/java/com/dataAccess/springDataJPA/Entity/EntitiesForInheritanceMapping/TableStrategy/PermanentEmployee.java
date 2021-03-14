package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.TableStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "permanent_employee")
public class PermanentEmployee extends EmployeeForTableStrategy {
    @Column(name = "permanent_id")
    private String permanentId;

    public String getPermanentId() {
        return permanentId;
    }

    public void setPermanentId(String permanentId) {
        this.permanentId = permanentId;
    }
}
