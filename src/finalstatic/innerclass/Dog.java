package finalstatic.innerclass;

public class Dog {
     final static int soDuoi = 1;
    public void sua(){
        System.out.println("Gau gau");
    }
    // nested class
    public class Husky{
        public void sua(){
            System.out.println("Huskyyyy");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
            dog.sua();
        Dog.Husky husky = dog.new Husky();
         husky.sua();


    }

}
