package com.company.boxandfruits;

public class Fruit <T extends Number> {
    private int count;
    private float fruitWeight;

    public Fruit(int count) {
        this.count = count;
    }

    public Fruit(int count, float weight) {
        this.count = count;
        this.fruitWeight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitWeight(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public void add(Box box) {
        box.getBox().add(getFruitWeight() * getCount());
        System.out.println("В ящик " + box.hashCode() + " добавили " +
                getFruitWeight() * getCount() + " " + this);
    }
}
