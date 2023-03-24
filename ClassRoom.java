package anotherChibuzo;

import java.util.Arrays;

public class ClassRoom {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student inem = new Student();
        inem.setFullName("Inemesit Legend");
        inem.setJavaScore(67);
        inem.setDatabaseScore(12);
        inem.setPythonScore(99);


        Student goodness = new Student();
        goodness.setFullName("Goodness Chinedu");
        goodness.setJavaScore(99);
        goodness.setPythonScore(99);
        goodness.setDatabaseScore(99);

        Student oluchi = new Student();
        oluchi.setFullName("Oluchi Olamma");
        oluchi.setJavaScore(98);
        oluchi.setPythonScore(18);
        oluchi.setDatabaseScore(76);

        students[0] = inem;
        students[1] = goodness;
        students[2] = oluchi;

        for (Student student:students) {
//            System.out.println(student);
//                        OR
//            String toPrint = student.getFullName() +
//                    " " + student.getPythonScore() +
//                    " " + student.getJavaScore() +
//                    " " + student.getDatabaseScore();
//            System.out.println(toPrint);
//                        OR
            System.out.println(student);
        }
//        Arrays.stream(students).forEach(student -> {
//            System.out.println(student);
//        });
//                        OR REPLACE WITH LAMDA
        Arrays.stream(students).forEach(System.out::println);

    }
}
