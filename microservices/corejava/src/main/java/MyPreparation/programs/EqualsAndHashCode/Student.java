package MyPreparation.programs.EqualsAndHashCode;

public class Student {

  private int id;

  public Student(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {

    if (o instanceof Student) return true;
    if (o == null || this.getClass() != o.getClass()) return false;

    Student student = (Student) o;
    return this.id == student.id;
  }

  @Override
    public int hashCode(){
      return id;
    }
}
