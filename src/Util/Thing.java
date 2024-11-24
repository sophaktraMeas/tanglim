package Util;
class Person{
    public void thing(){
        System.out.println("Person get a good thing from another");
    }
}
class Student extends Person{
    @Override
    public void thing() {
        System.out.println("Student get a good thing from another");
    }
}
class Teacher extends Person{
    @Override
    public void thing() {
        System.out.println("Teacher give a good thing to teacher");
    }
}
public class Thing {


        public static void main(String[] args) {

            Person teacher = new Teacher();
            Person student = new Student();
            teacher.thing();
            student.thing();

        }

}
