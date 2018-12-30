package com.github.vikeshpandey.oodesign.callcentre;

import java.util.ArrayList;
import java.util.List;

import static com.github.vikeshpandey.oodesign.callcentre.Designation.*;

public class CallCentre {
    public static void main(String[] args) {
        List<Employee> employees = createEmployees();
        EmployeeHandler employeeHandler = new EmployeeHandler(employees);
        CallHandler callHandler = new CallHandler(employeeHandler);
        final Call call = new Call("001");
        callHandler.disPatchCall(call);
    }

    private static List<Employee> createEmployees() {
        List<Employee> employees = new ArrayList<>(10);
        employees.add(new Employee("1", "A", RESPONDENT));
        employees.add(new Employee("2", "B", RESPONDENT));
        employees.add(new Employee("3", "C", RESPONDENT));
        employees.add(new Employee("4", "D", RESPONDENT));
        employees.add(new Employee("5", "E", RESPONDENT));
        employees.add(new Employee("6", "F", MANAGER));
        employees.add(new Employee("7", "G", MANAGER));
        employees.add(new Employee("8", "H", MANAGER));
        employees.add(new Employee("9", "I", DIRECTOR));
        employees.add(new Employee("10", "J", DIRECTOR));
        return employees;
    }
}
