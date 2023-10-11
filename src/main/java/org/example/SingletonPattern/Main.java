package org.example.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        SingleObject obj1 = SingleObject.getInstance();
        SingleObject obj2 = SingleObject.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode()); // hash code will be the same
        System.out.print(obj1.equals(obj2)); // will return true
    }
}

/*
  https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
*/