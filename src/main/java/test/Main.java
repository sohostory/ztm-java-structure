package test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Animal[] animal = new Animal[2];
//        animal[0] = new Dog();
//        animal[1] = new Cat();

        Stack<Animal> animal = new Stack<>();
//        animal.add(new Cat());
        animal.add(new Dog());

        animal.pop().makeNoise();

        for(Animal a : animal) {
            a.makeNoise();
        }

        Cat cat1 = new Cat("ass", "hole");
        Animal cat2 = new Cat("butt", "face");
        Animal cat3 = new Dog();

        cat1.color();
        cat2.color();
        cat3.color();

        System.out.println(Cat.numOfNipples);
        cat1.numOfNipples = 3;
        System.out.println(Cat.numOfNipples);

        Cat cat4 = (Cat) cat2;
        cat4.cantTouchThis();

//
//        Cat dog = new Cat();
    }
}
