package Inheritance;

class Animal {
    void sound() {
        System.out.println("This is an animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}
