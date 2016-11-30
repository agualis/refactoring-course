package com.agualis.refactoring.switchstatements;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceConditionalWithPolymorphism {

    public static final int ENGINEER_SALARY = 24;

    @Test public void
    testEngineerSalary() {
        Employee employee = new Employee(DynamicEmployee.ENGINEER);

        assertThat(employee.payAmount(), is(ENGINEER_SALARY));
    }

    @Test public void
    testPromoteToManager() {
        Employee employee = new Employee(DynamicEmployee.SALESMAN);

        assertThat(employee.payAmount(), is(57));

        employee.promoteToManager();

        assertThat(employee.payAmount(), is(69));
    }

}
