package lambda;

import java.util.ArrayList;
import java.util.List;

public class flatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Sam", 'm', 25, 1, 7.5);
        Student st3 = new Student("Tom", 'm', 22, 3, 6.1);
        Student st4 = new Student("Victoria", 'f', 23, 5, 10.0);
        Student st5 = new Student("Dean", 'm', 30, 4, 8.9);
        Facility f1 = new Facility("Economic");
        Facility f2 = new Facility("Programming");
        f1.addStudent(st1);
        f1.addStudent(st2);
        f1.addStudent(st3);
        f2.addStudent(st4);
        f2.addStudent(st5);

        List<Facility> facilities = new ArrayList<>();
        facilities.add(f1);
        facilities.add(f2);

        facilities.stream().flatMap(facility -> facility.getStudentListonFacility().stream())
                .forEach(student -> System.out.println(student.name));
    }
}

class Facility {
     String name;
     List<Student> studentListonFacility;

     public Facility(String name){
         this.name = name;
         studentListonFacility = new ArrayList<>();
     }

    public List<Student> getStudentListonFacility() {
        return studentListonFacility;
    }

    public void addStudent(Student s) {
        studentListonFacility.add(s);
    }
}