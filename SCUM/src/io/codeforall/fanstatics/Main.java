package io.codeforall.fanstatics;

public class Main {

    public static void main(String[] args) {

        MonoOperation<Integer> add = (x) -> x + x;
        System.out.println(add.execute(10));

        MonoOperation<Integer> multiply = (x) -> x * x;
        System.out.println(multiply.execute(8));

        BiOperation<Integer> add1 = (int a, int b) -> a + b;
        System.out.println(add1.execute(8,10));

    }


}
