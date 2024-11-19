package io.codeforall.fanstatics;

public class Tasks implements Comparable<Tasks> {

    private Importance priority;
    private int secPriority;
    private String description;


    public Tasks(Importance priority, int secPriority, String description) {
        this.priority = priority;
        this.secPriority = secPriority;
        this.description = description;

    }


    public int impToInt(Importance priority) {
        switch (this.priority) {
            case HIGH:
                return 3;

            case MEDIUM:
                return 2;

            case LOW:
                return 1;
        }
        return 0;
    }


    @Override
    public int compareTo(Tasks tasks) {
        if (tasks.priority == this.priority && tasks.secPriority == this.secPriority) {
            return 0;
        }
        if (priority.getPriority() < impToInt(this.priority)) {
            return -1;
        }
        if (priority.getPriority() > impToInt(this.priority)) ;
            return 1;
        }

    @Override
    public String toString() {
      //  "priority: " + priority;

        return description;
    }
}
