public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /** Default constructor. */
    public Person() {

    }

    /** Constructor with name, age, address. */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /** compareTo() method for Comparable interface. */
    public int compareTo(Person p) {
        if (this.name.compareTo(p.name) != 0) {
            return this.name.compareTo(p.name);
        }

        if (this.age == p.age) {
            return 0;
        } else if (this.age < p.age) {
            return -1;
        } else {
            return 1;
        }
    }
}