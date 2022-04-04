package lesson01.boxandfruits;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Orange orange = new Orange(20);
        Orange orange2 = new Orange(10);
        Apple apple = new Apple(45);

        Box<Orange> boxOrange = new Box(new ArrayList<>(), "апельсин");
        Box<Orange> boxOrange1 = new Box(new ArrayList<>(), "апельсин");
        Box<Apple> boxApple = new Box(new ArrayList<>(), "яблоко");
        Box<Apple> boxApple1 = new Box(new ArrayList<>(), "яблоко");

        boxOrange.add(orange);
        boxOrange.add(orange2);

        boxApple1.add(apple);
        boxApple.pass(boxApple1);

        System.out.println(boxApple.sameAvg(boxOrange));
    }
}
