package com.github.vikeshpandey.oodesign.callcentre;

import java.util.List;
import java.util.Optional;

import static com.github.vikeshpandey.oodesign.callcentre.Designation.RESPONDENT;
import static com.github.vikeshpandey.oodesign.callcentre.State.BUSY;
import static com.github.vikeshpandey.oodesign.callcentre.State.FREE;

public class EmployeeHandler {
    private List<Employee> employees;

    public EmployeeHandler(final List<Employee> employees) {
        this.employees = employees;
    }

    public Optional<Employee> isAnyEmployeeAvailableForCall(Designation designation) {
        return employees
                       .stream()
                       .filter(employee ->
                                       FREE.equals(employee.getState()) &&
                                               designation.equals(employee.getDesignation()))
                       .findAny();
    }


    public Employee markBusy(Employee employee) {
        employee.setState(BUSY);
        return employee;
    }


}
