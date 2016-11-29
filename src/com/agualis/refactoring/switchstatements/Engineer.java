package com.agualis.refactoring.switchstatements;

public class Engineer extends EmployeeType {
    int getType() {
        return EmployeeType.ENGINEER;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.monthlySalary;
    }
}
