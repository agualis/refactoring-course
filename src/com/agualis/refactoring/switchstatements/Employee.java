package com.agualis.refactoring.switchstatements;

public class Employee {
    private int monthlySalary = 25;
    private int commission = 32;
    private int bonus = 44;

    private EmployeeType type; //NOTE TYPE IS NOT FINAL --> MUTABLE

    Employee(int type) {
        this.setTypeCode(type);
    }

    public int payAmount() {
        switch (getTypeCode()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect StaticEmployee");
        }
    }

    public void promoteToManager() {
        this.setTypeCode(EmployeeType.MANAGER);
    }

    public int getTypeCode() {
        return type.getType();
    }

    public void setTypeCode(int type) {
        this.type = EmployeeType.newType(type);
    }
}
