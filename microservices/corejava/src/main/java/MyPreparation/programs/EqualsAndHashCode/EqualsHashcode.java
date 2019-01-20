package MyPreparation.programs.EqualsAndHashCode;

public class EqualsHashcode {
  public static void main(String[] args) {
    Student student = new Student(12);
    Student student1 = new Student(12);
    // The below statement will return false if you didn't override equals(). Because the default
    // implementation of object class uses == operator and it will return false as it is comparing
    // the reference object it self
    System.out.println(student.equals(student1));

    // As the contract is if two objects are equal then their hashcode must be equal. But the default
    // implementation of hashcode in object class returns a random integer when hashCode() is invoked
    // upon the class. So even if you created two objects with same content, the hashCode() will return
    // different value for each invocation. So we have to override the hashCode() method as well.
    System.out.println(student.hashCode());
    System.out.println(student1.hashCode());
  }
}
