package com.agualis.refactoring.switchstatements;

public class Manager extends EmployeeType {
    int getType() {
        return EmployeeType.MANAGER;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.commission;
    }
}
