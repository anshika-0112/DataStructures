package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("DefaultName",1,1,24,40);
        Dog dog=new Dog("Tommy",1,1,26,36,2,4,1,32,"white");
        dog.eat();
    }
}
