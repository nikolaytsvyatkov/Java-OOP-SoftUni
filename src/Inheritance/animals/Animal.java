package Inheritance.animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.setAge(age);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw  new IllegalStateException("Invalid input!");
        }
        this.age = age;
    }

    public abstract String produceSound();
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s",this.getClass().getSimpleName())).append(String.format("%n"));
        sb.append(String.format("%s %d %s%n",this.name, this.age, this.gender));
        sb.append(this.produceSound());
        return sb.toString();
    }

}
