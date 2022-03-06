package com.company.boxandfruits;

public class Apple extends Fruit {
    public Apple(int count) {
        super(count);
        this.setFruitWeight(1.0f);
        System.out.println("Появились яблоки, количеством " + getCount() + " штук. " + "Вес одного яблока " + getFruitWeight());
    }
}
