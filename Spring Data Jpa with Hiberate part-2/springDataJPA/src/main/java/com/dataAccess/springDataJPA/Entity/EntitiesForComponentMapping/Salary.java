package com.dataAccess.springDataJPA.Entity.EntitiesForComponentMapping;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Salary {

    @Column(name = "emp_basic_salary")
    private int basicSalary;
    @Column(name = "emp_bonus_salary")
    private int bonusSalary;
    @Column(name = "emp_tax_amount")
    private int taxAmount;
    @Column(name = "emp_special_allowance_salary")
    private int specialAllowanceSalary;

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    public int getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(int specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
