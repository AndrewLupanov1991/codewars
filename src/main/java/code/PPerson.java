package code;

public class PPerson {
    int age;

    String name;

    String surname;

    public  PPerson(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int hashcodede() {

        int hash;

        int digit = 31;

        hash = digit * age;

        hash = digit * name.hashCode() * surname.hashCode();

        return hash;



    }
}
