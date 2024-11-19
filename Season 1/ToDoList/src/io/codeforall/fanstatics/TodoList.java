package io.codeforall.fanstatics;

import java.util.PriorityQueue;

public class TodoList  {

    public TodoList(){
        priorityQueue = new PriorityQueue<>();
    }

    PriorityQueue<Tasks> priorityQueue;


    public void add(Importance importance, int num, String str) {
        Tasks tasks = new Tasks(importance, num, str);
        priorityQueue.add(tasks);
    }



    public boolean isEmpty() {
       return priorityQueue.isEmpty();
    }


}
