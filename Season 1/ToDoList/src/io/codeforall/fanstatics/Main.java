package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {

        TodoList todoList = new TodoList();

        todoList.add(Importance.MEDIUM, 1, "qa");
        todoList.add(Importance.LOW, 1, "low,naono3a");
        todoList.add(Importance.HIGH, 2, "HIGH,na1onoa");
        todoList.add(Importance.LOW, 1, "Medium,naronoa");
        todoList.add(Importance.MEDIUM, 1, "Medium,nao3noa");
        todoList.add(Importance.HIGH, 1, "HIGH,nao3noa");
        todoList.add(Importance.MEDIUM, 1, "Medium,4naonoa");

        while (!todoList.isEmpty()) {
            System.out.println(todoList.priorityQueue.remove().toString());
        }

    }
}
