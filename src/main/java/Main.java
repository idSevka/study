import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: \t" +
                name +
                "\t| age:\t" + age;
    }
}

public class Main {
    public static void main(String[] args) {

//        List<Student> students = new ArrayList<>();
//
//        Student st1 = new Student("Admin", 1977);
//        students.add(st1);
//        students.add(new Student("Sevka", 1996));
//        students.add(new Student("Albert", 2003));
//        students.add(new Student("Vovan", -200));
//        students.add(new Student("Emot", 2007));
//        students.add(new Student(null, 0));
//        students.add(new Student("Митя", 2022));
//        students.add(new Student("AaAaz", 101001101));
//        students.add(new Student(null, 1488));
//        students.add(new Student(null, 131));
//
//        boolean a = students.add(new Student("Test", 0));
//        System.out.println(a);

//        ObjectOutputStream oups = new ObjectOutputStream();
//
//        students.stream()
//                .filter(a -> a.getAge() > 1950)
//                .filter(a -> a.getAge() < 2022)
//                .forEach(System.out::println);

        List<Integer> numb = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ListIterator<Integer> iter = numb.listIterator();
        iter.add(7);
        System.out.println(numb);
    }


}