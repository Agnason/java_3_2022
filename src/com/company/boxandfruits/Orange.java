package com.company.boxandfruits;

public class Orange extends Fruit {
    public Orange(int count) {
        super(count);
        this.setFruitWeight(1.5f);
        System.out.println("Появились апельсины, количеством " + getCount() + " штук. " + "Вес одного апельсина " + getFruitWeight());
    }

    public Orange(int count, float weight) {
        super(count, weight);
    }
}
