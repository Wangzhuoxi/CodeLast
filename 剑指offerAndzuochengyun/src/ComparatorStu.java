import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorStu {
    public static class Student{
        private int id;
        private int age;
        private String name;

        public Student(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }
    }
    public static class IdAscendingComparator implements Comparator<Student>
    {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id-o2.id;
        }
    }
    public static void printStu(Student[] stus)
    {

        for(Student stu:stus)
            System.out.println(stu.name+" "+stu.id+" "+stu.age);

    }


    public static void main(String[] args) {
        Student s1=new Student(3,13,"A");
        Student s2=new Student(1,14,"B");
        Student s3=new Student(4,15,"C");
        Student[] stus={s1,s2,s3};
        printStu(stus);
        Arrays.sort(stus,new IdAscendingComparator());
        printStu(stus);
        //优先级对列就是堆
        //加入比较的准则， 及小根堆
        PriorityQueue<Student> heap=new PriorityQueue<>(new IdAscendingComparator());
        heap.add(s1);//加入时系统给排序
        heap.add(s2);
        heap.add(s3);
        while(!heap.isEmpty())
        {
            Student student=heap.poll();
            System.out.println("Name: "+student.name+" "+"id: "+student.id+"age "+student.age);
        }
        return;
    }
}
