package finalstatic.innerclass;

public class Dog2 {
     int age;
    public void sua(){
        System.out.println("Gau gau");
    }

   public static class Chiba extends Dog {
        public void sua(){
            System.out.println("ChiBAAAAAAA");
        }
    }

    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();

        Dog2.Chiba chiba = new Dog2.Chiba();
        int a = Dog.soDuoi;
        chiba.sua();

    }
}
