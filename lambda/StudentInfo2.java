package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo2 {
//   void testStudent(ArrayList<Student> al, StudentCheck sc){
//       for(Student s: al){
//            if(sc.check(s)){
//                System.out.println(s);
//            }
//       }
//   }
       void testStudent(ArrayList<Student> al, Predicate<Student> pr){
       for(Student s: al){
            if(pr.test(s)){
                System.out.println(s);
            }
       }
   }

}
class T2{
    public static void main(String[] args){
        Student st1 = new Student("Ivan",  'm', 22,3, 8.3);
        Student st2 = new Student("Sam",  'm', 25,1, 7.5);
        Student st3 = new Student("Tom",  'm', 22,3, 6.1);
        Student st4 = new Student("Victoria",  'f', 28,5, 10.0);
        Student st5 = new Student("Dean",  'm', 30,4, 8.9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        StudentInfo2 info = new StudentInfo2();
//        info.testStudent(students, new checkOverGrade());
//        info.testStudent(students, new StudentCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30;
//            }
//        });
//        info.testStudent(students, (Student s) -> s.age<30);
//        info.printStudentOverGrade(students, 8);
//        System.out.println("---------");
//        info.printStudentUnderAge(students, 25);
//        System.out.println("---------");
//        info.printStudentsMixCondition(students, 25, 8);

    }
}

interface StudentCheck{
    boolean check(Student s);
}

class checkOverGrade implements StudentCheck{

    @Override
    public boolean check(Student s) {
         return s.avgGrade > 7;
    }
}


