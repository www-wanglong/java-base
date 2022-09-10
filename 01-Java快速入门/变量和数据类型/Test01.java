
class Person {
    private String[] names;

    public static void main(String[] args) {
        System.out.print("xixi");
    }

    public void setName(String... names) {
        this.names = names;
    }

    public String getName() {
        return this.names[0];
    }

}

public class Test01 {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("xx");

        System.out.print(p.getName());

    }
}
