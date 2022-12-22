package mutable;

public class Dorobou {
    private String name;

    public Dorobou(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dorobou{" +
                "name='" + name + '\'' +
                '}';
    }
}
