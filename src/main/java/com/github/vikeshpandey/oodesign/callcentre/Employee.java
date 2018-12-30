package com.github.vikeshpandey.oodesign.callcentre;

import java.util.Objects;

import static com.github.vikeshpandey.oodesign.callcentre.State.FREE;

public class Employee {
    private String id;
    private String name;
    private Designation designation;
    private State state;

    public Employee(final String id,
                    final String name,
                    final Designation designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.state = FREE;
    }

    public Employee(final String id,
                     final String name,
                     final Designation designation,
                     final State state) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                       Objects.equals(name, employee.name) &&
                       designation == employee.designation &&
                       state == employee.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, designation, state);
    }
}
