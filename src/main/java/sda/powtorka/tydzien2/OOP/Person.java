package sda.powtorka.tydzien2.OOP;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person() {
    }

    public Person(String nname, String ssurname, int aage) {
        this.name = nname;
        this.surname = ssurname;
        this.age = aage;
    }

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduce() {
        System.out.println(name + " " + surname);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Tom","Brady",36);
        person1.introduce();

        Person person2 = new Person("Ann","Bann",43
                ,new Address("Mullow Street", "London","Sri Lanka",23,33));
        System.out.println(person2.address.getCity());
    }
}
