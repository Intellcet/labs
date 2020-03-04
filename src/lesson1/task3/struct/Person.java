package lesson1.task3.struct;

public class Person {
    private Integer age;
    private String sex;
    private String name;

    public Person(Integer age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ name: " + this.name + ", sex: " + this.sex + ", age: " + this.age + "}";
    }
}
