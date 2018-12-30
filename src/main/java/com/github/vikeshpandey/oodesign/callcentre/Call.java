package com.github.vikeshpandey.oodesign.callcentre;

public class Call {
    private String id;
    private boolean resolved;
    private Employee assignedTo;
    private Employee resolvedBy;

    public Call(final String id) {
        this.id = id;
    }

    private Call(final String id,
                 final boolean resolved,
                 final Employee assignedTo,
                 final Employee resolvedBy) {
        this.id = id;
        this.resolved = resolved;
        this.assignedTo = assignedTo;
        this.resolvedBy = resolvedBy;
    }

    public String getId() {
        return id;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(final boolean resolved) {
        this.resolved = resolved;
    }

    public Employee getResolvedBy() {
        return resolvedBy;
    }

    public static CallBuilder builder() {
        return new CallBuilder();
    }

    public static class CallBuilder {
        private String id;
        private boolean resolved;
        private Employee assignedTo;
        private Employee resolvedBy;

        public CallBuilder id(String id) {
            this.id = id;
            return this;
        }

        public CallBuilder resolvedBy(Employee resolvedBy) {
            this.resolvedBy = resolvedBy;
            return this;
        }

        public CallBuilder assignedTo(Employee assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }

        public CallBuilder resolved(boolean resolved) {
            this.resolved = resolved;
            return this;
        }

        public Call build() {
            return new Call(id, resolved, assignedTo, resolvedBy);
        }
    }
}
