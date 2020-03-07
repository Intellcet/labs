package lesson1.task3.struct;

public class Sex {
    public static final String MAN = "Man";
    public static final String WOMAN = "Woman";

    private String sex;

    private boolean isSexIsNotValid(String sex) {
        return !sex.equals(Sex.MAN) && !sex.equals(Sex.WOMAN);
    }

    Sex(String sex) throws Exception {
        if (isSexIsNotValid(sex)) throw new Exception("Sex is not valid!");
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    void setSex(String sex) throws Exception {
        if (isSexIsNotValid(sex)) throw new Exception("Sex is not valid!");
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.sex;
    }
}
