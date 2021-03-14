package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.EntityesForSingleTableStrategy.SingleEntityTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Permanent")
public class Permanent extends EmployeeForSingleTableStrategy{
    @Column(name = "permanent_id")
    private String permanentId;

    public String getPermanentId() {
        return permanentId;
    }

    public void setPermanentId(String permanentId) {
        this.permanentId = permanentId;
    }
}
