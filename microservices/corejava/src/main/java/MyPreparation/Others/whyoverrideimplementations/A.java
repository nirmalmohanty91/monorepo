package MyPreparation.Others.whyoverrideimplementations;

public interface A {
  default void printGreetings() {
    System.out.println(
        "Ohh snap! You are not calling the overridden method. You must have named the implementation method differently. Please always annotate the implementation methods with @Override to get a compile time message");
  }
}
