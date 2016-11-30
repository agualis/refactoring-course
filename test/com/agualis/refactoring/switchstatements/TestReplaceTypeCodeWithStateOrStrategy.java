package com.agualis.refactoring.switchstatements;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestReplaceTypeCodeWithStateOrStrategy {

    @Test public void
    test() {
        DynamicEmployee employee = new DynamicEmployee(DynamicEmployee.SALESMAN);

        assertThat(employee.payAmount(), is(57));

        employee.promoteToManager();

        assertThat(employee.payAmount(), is(68));
    }
}
