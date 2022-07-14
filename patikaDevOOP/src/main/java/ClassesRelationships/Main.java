package ClassesRelationships;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mehmet","Mutlu",1,"İstanbul",80);
        Student student2 = new Student("Ahmet","Dal",2,"Ankara",90);
        Student student3 = new Student("Murat","Balcı",3,"İzmir",100);


        Instructor teacher1 = new Instructor("Naz","Özdemir","CENG");
        Course mat = new Course("Maths","MAT",teacher1);

        System.out.println(mat.getInstructor().getName());
        //Student[] stu = {student1,student2,student3};
        //System.out.println("Average is \t:"+mat.calcAverage(stu));
    }
}
