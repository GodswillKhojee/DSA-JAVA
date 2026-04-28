package OOPS.methodOverriding;

class Parent {
    public void display() {
        System.out.println("hello from parent");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("hello from child");
    }
}

public class example {
    public static void main(String[] args) {
        Parent sup = new Child();
        sup.display();
    }
}