package _11_DSA_Stack_Queue.bai_tap.optional.toChucDuLieu;

import java.util.*;

public class Demerging {
    public static void main(String[] args) {
        ArrayList<Student> test = new ArrayList<>();
        Queue<Student> test2 = new ArrayDeque<>();

        test.add(new Student("Mạn","nữ","2000"));
        test.add(new Student("Thiên","nam","1995"));
        test.add(new Student("Hoa","nữ","1996"));
        test.add(new Student("Vũ","nam","1997"));
        Collections.sort(test);
        for (Student student: test){
            System.out.println(student);
        }
        Queue<Student> nu = new ArrayDeque<>();
        Queue<Student> nam = new ArrayDeque<>();
        for (Student student: test){
            if (student.getGender().equals("nữ")){
                nu.add(student);
            } else nam.add(student);
        }
        while (!nu.isEmpty()){
            test2.add(nu.poll());
        }
        while (!nam.isEmpty()){
            test2.add(nam.poll());
        }
        System.out.println("-------");
        for(Student student2: test2){
            System.out.println(student2);
        }
    }
}
