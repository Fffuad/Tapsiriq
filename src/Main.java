public class Main {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        System.out.println(studentManager.getById(2));
        System.out.println(studentManager.getaAll());
        studentManager.SaveStudent(new Student(5,"Nergiz",26));
        System.out.println(studentManager.getaAll());
    }
}
