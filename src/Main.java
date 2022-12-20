public class Main {

    public static void main(String[] args) {
        System.out.println("Cat: ");
        Animal kot = new Cat(200,0,2);
        kot.run(50);
        kot.swim(1);
        kot.jump(3);

        System.out.println("Dog: ");
        Animal sob = new Dog(500,10, 0.5F);
        sob.run(600);
        sob.swim(2);
        sob.jump(0.1F);
    }
    }