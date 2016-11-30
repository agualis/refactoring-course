package com.agualis.refactoring.switchstatements;

public class Salesman extends EmployeeType {
    @Override
    public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.commission;
    }

    int getType() {
        return EmployeeType.SALESMAN;
    }
}
