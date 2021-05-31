package _11_DSA_Stack_Queue.bai_tap.optional.toChucDuLieu;

public class Student implements Comparable<Student> {
    private String name;
    private String gender;
    private String birthday;

    public Student() {
    }

    public Student(String name,String gender,String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday=birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getBirthday().compareTo(o.getBirthday());
    }
}
