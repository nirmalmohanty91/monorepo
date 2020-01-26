package MyPreparation.programs.stringprograms;

public class SBufferAndSBuilder {
  public static void main(String[] args) {

    StringBuffer stringBuffer = new StringBuffer("Nirmal");
    System.out.println(stringBuffer.reverse());

    StringBuilder stringBuilder = new StringBuilder("Nirmal");
    System.out.println(stringBuilder.reverse());

    String string = new String("Nirmal");
  }
}
