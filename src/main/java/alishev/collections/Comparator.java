package alishev.collections;

import java.util.*;

public class Comparator {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(2);
//        list.add(18);
//        list.add(99);
//        list.add(0);
//        System.out.println(list);
//        Collections.sort(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.sort(list, (o1, o2) -> o2 - o1);
//        System.out.println(list);

        List<Person>people = new ArrayList<>();
        people.add(new Person("Bob",3));
        people.add(new Person("Cat",1));
        people.add(new Person("Anna",2));
        people.add(new Person("Dany",4));
        System.out.println(people);

        Collections.sort(people,(p1,p2) -> p2.getName().compareTo(p1.getName()));
        System.out.println(people);
    }

}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
