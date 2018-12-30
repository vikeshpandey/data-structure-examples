package com.github.vikeshpandey.oodesign.callcentre;

import java.util.LinkedList;
import java.util.Optional;

import static com.github.vikeshpandey.oodesign.callcentre.Call.builder;
import static com.github.vikeshpandey.oodesign.callcentre.Designation.RESPONDENT;

public class CallHandler {
    private EmployeeHandler employeeHandler;
    private static final LinkedList<Call> respondentQueue = new LinkedList<>();
    private static final LinkedList<Call> managerQueue = new LinkedList<>();
    private static final LinkedList<Call> directorQueue = new LinkedList<>();

    public CallHandler(final EmployeeHandler employeeHandler) {
        this.employeeHandler = employeeHandler;
    }

    public void disPatchCall(final Call call) {
        Optional<Employee> optionalRespondent = employeeHandler.isAnyEmployeeAvailableForCall(RESPONDENT);
        if (optionalRespondent.isPresent()) {
            assignCall(call, optionalRespondent.get());
        } else {
            respondentQueue.add(call);
        }
    }

    private Call assignCall(final Call call, final Employee employee) {
        Call assignedCall = builder()
                                    .id(call.getId())
                                    .assignedTo(employee)
                                    .build();
        employeeHandler.markBusy(employee);
        resolveCall(assignedCall, employee);
        //TODO:: incomplete
        return null;
    }


    public boolean resolveCall(final Call assignedCall, final Employee employee) {
        if (assignedCall.isResolved()) {
            return true;
        } else {
            Optional<Employee> optionalManager = employeeHandler.isAnyEmployeeAvailableForCall(Designation.MANAGER);
            if (optionalManager.isPresent()) {
                assignCall(assignedCall, optionalManager.get());
            } else {
                managerQueue.add(assignedCall);
            }
        }
        return true;
    }
}
