package stream;

import java.util.List;

public class Student {

    private String name;
    private boolean isMale;
    private int age;
    private float score;
    private List<String> subjects;

    public Student() {
    }

    public Student(String name, boolean isMale, int age, float score, List<String> subjects) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.score = score;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
