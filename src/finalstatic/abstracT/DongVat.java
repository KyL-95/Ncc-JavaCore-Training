package finalstatic.abstracT;

public class DongVat implements Actions {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void sleep() {
        System.out.println("Động vật ngủ");
    }

    @Override
    public void eat() {
        System.out.println("Động vật ăn");
    }
}
