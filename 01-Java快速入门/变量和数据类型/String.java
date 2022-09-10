import java.util.StringJoiner;

class Main {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
//        var sj = new StringJoiner(", ", "Hello ", "!");
//        for (String name : names) {
//            sj.add(name);
//        }
        var s = String.join(", ", names);
        System.out.println(s);
    }
}