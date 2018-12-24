package MyPreparation.Others;

public class DriverClass {

  public static void main(String[] args) {
    //    SingletonDemo s= SingletonDemo.getInstance();
    //    System.out.println(s.getClass());

    //    int[] numbers = {1, 2, 4, 3};
    ////    int frontSum = 0;
    ////    int backSum = 0;
    ////    int index = 0;
    ////    for (int i = 0; i < numbers.length; i++) {
    ////      if (numbers[i] == numbers[numbers.length - 1]) {
    ////        index = i + 1;
    ////
    ////      } else if (numbers[i] < numbers[numbers.length - 1]) {
    ////        frontSum = numbers[i] + numbers[i + 1];
    ////      } else if (numbers[i] > numbers[numbers.length - 1]) {
    ////        backSum = numbers[numbers.length - 1] + numbers[(numbers.length - 1) - i];
    ////      }
    ////    }

    //String s = "1234";
    //    int distinct = 0 ;
    //
    //    for (int i = 0; i < s.length(); i++) {
    //      for (int j = 0; j < s.length(); j++) {
    //        if(s.charAt(i)==s.charAt(j))
    //        {
    //          distinct++;
    //        }
    //      }
    //      System.out.println(s.charAt(i)+"--"+distinct);
    //      String d=String.valueOf(s.charAt(i)).trim();
    //      //System.out.println(d);
    //      s=s.replaceAll(d,"");
    //      //System.out.println(s);
    //      distinct = 0;
    //
    //    }

    //char[] c=s.toCharArray();
   // List<Character> charList = Arrays.asList(c);

    //System.out.println(Integer.parseInt(s));


String number = "1";
    System.out.println(DriverClass.check(number));


  }



  public static boolean check(String number){
return "1".equals(number);
  }


}
