package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
     void printStudentOverGrade(ArrayList<Student> al, double grade){
           for(Student s: al){
               if(s.avgGrade > grade){
                   System.out.println(s);
               }
           }
    }
    void printStudentUnderAge(ArrayList<Student> al, double age){
          for(Student s: al){
              if(s.age < age){
                  System.out.println(s);
              }
          }
    }
    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade){
          for(Student s: al){
              if(s.age < age && s.avgGrade < grade ){
                  System.out.println(s);
              }
          }
    }
}
class T{
    public static void main(String[] args){
        Student st1 = new Student("Ivan",  'm', 22,3, 8.3);
        Student st2 = new Student("Sam",  'm', 25,1, 7.5);
        Student st3 = new Student("Tom",  'm', 22,3, 6.1);
        Student st4 = new Student("Victoria",  'f', 23,5, 10.0);
        Student st5 = new Student("Dean",  'm', 30,4, 8.9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.printStudentOverGrade(students, 8);
        System.out.println("---------");
        info.printStudentUnderAge(students, 25);
        System.out.println("---------");
        info.printStudentsMixCondition(students, 25, 8);

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course - o2.course;
//            }
//        });

//        Collections.sort(students, (stud1, stud2) -> stud1.course - stud2.course);
//        System.out.println(students);

    }
}


