import java.util.*;

public class StudentTest {
 public static void main(String[] args) {
  
  Vector<Student> vector = new Vector<Student>(3,3);
  Student student1 = new Student("Tannon", "10000,","Computer Science");
  Student student2 = new Student("Nate", "10022,","Computer Science");
  Student student3 = new Student("Jaspreet", "10640,","Computer Science");
  Student student4 = new Student("Mohammed", "10080,","Computer Science");
  vector.add(student1);
  vector.add(student2);
  vector.add(student3);
  System.out.println("The current capacity of Vector is " +vector.capacity());
  vector.add(student4);
  System.out.println("The current capacity of Vector is "+vector.capacity());
  ListIterator<Student> listIterator = vector.listIterator();
  while(listIterator.hasNext()) {
   Student student = listIterator.next();
   System.out.println("Forward Iteration*******");
   System.out.println("Student Name "+student.getName());
   
  }
  
  while(listIterator.hasPrevious()) {
   Student student = listIterator.previous();
   System.out.println("Backwards Iteration**********");
   System.out.println("Student Name"+student.getName());
  }
 
  
 }
 
 
}



 


