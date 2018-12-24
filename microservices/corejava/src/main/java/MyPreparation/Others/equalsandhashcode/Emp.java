package MyPreparation.Others.equalsandhashcode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
// @EqualsAndHashCode
@AllArgsConstructor
public class Emp {

  private int age;

  @Override
  public boolean equals(Object o) {
    System.out.println("equals() called...");
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Emp emp = (Emp) o;

    return this.age == emp.age;
  }

  @Override
  public int hashCode() {
    System.out.println("hashCode() called..");
    return age;
  }

  //  public int hashCode() {
  //    return age;
  //  }
  //
  //  public boolean equals(Object obj) {
  //
  //    boolean flag = false;
  //    Emp emp = (Emp) obj;
  //    if (emp.age == age) flag = true;
  //    return flag;
  //  }
}
