package com.agualis.refactoring.switchstatements;

public abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract int getType();

    public static EmployeeType newType(int type) {
        switch (type){
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new RuntimeException("Incorrect employee type code: " + type);
        }
    }

    public int payAmount(Employee employee) {
        return employee.payAmount();
    }
}
