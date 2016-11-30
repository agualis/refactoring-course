package com.agualis.refactoring.switchstatements;

public class Employee {
    protected int monthlySalary = 25;
    protected int commission = 32;
    protected int bonus = 44;

    private EmployeeType type; //NOTE TYPE IS NOT FINAL --> MUTABLE

    Employee(int type) {
        this.setTypeCode(type);
    }

    public int payAmount() {
        return type.payAmount(this);
    }

    public void promoteToManager() {
        this.setTypeCode(EmployeeType.MANAGER);
    }

    public void setTypeCode(int type) {
        this.type = EmployeeType.newType(type);
    }
}
