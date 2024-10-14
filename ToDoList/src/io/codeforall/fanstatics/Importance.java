package io.codeforall.fanstatics;



public enum Importance {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int priority;

    Importance(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }
}

