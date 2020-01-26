package MyPreparation.otherImportantJavaConcepts;

public class TestingConstantPool {

  public static void main(String[] args) {
    // Testing Integer Constant pool
    Integer c = 127;
    Integer d = 127;
    System.out.println(c == d);

    Integer e = 128; // uses Integer.valueOf() internally
    Integer f = Integer.valueOf(128);
    System.out.println(e == f);
    /**
     * The above statement is printing false because when you assign values to Integer wrapper class
     * variable it takes it as Integer.valueOf(supplied_value). And this method will always cache
     * values in the range -128 to 127, inclusive, and may cache other values outside of this range.
     * So for faster operation it uses the concept called constant pool. So within the pool if the
     * value is found in the range of -128 to 127, the new object will simply point to the available
     * object in the pool which make the "==" check true. But if the value goes beyond the range a
     * new object is created and it doesn't look in the constant pool.
     */
    System.out.println(e.equals(f));
    Integer g = -128;
    Integer h = -128;
    System.out.println(g == h);
    /** ------------------------------------------ */
    final int i = 5;
    final int j = 127;
    final long l = 12;

    byte a = i;
    byte b = j;
    System.out.println(a);
    System.out.println(b);
  }
}
