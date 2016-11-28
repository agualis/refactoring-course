package com.agualis.refactoring.switchstatements;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceConditionalWithPolymorphism {

    @Test public void
    testEngineerSalary() {
        Employee employee = new Employee(DynamicEmployee.ENGINEER);

        assertThat(employee.payAmount(), is(25));
    }

//    @Test public void
//    testPromoteToManager() {
//        Employee employee = new Employee(DynamicEmployee.SALESMAN);
//
//        assertThat(employee.payAmount(), is(57));
//
//        employee.promoteToManager();
//
//        assertThat(employee.payAmount(), is(69));
//    }

}
