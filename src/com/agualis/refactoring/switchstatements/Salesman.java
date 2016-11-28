package com.agualis.refactoring.switchstatements;

public class Salesman extends EmployeeType {
    int getType() {
        return EmployeeType.SALESMAN;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.commission;
    }
}
