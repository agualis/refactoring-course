package com.agualis.refactoring.switchstatements;

public class Engineer extends EmployeeType {

    @Override
    public int payAmount(Employee employee) {
        return employee.monthlySalary;
    }

    int getType() {
        return EmployeeType.ENGINEER;
    }
}
