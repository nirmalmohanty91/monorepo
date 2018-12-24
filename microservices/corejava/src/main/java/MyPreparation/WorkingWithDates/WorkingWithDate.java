package MyPreparation.WorkingWithDates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WorkingWithDate {

  public static void main(String[] args) {

    //    System.out.println(MyEnum.get(MyEnum.NIRMAL));
    //    System.out.println(MyEnum.NIRMAL.getClass());
    // Working with LocalDate

    //    System.out.println(LocalDate.of(1991, 06, 05));
    //    System.out.println(LocalDate.of(1991, Month.JUNE, 05));
    //
    //    LocalDate today = LocalDate.now();
    //    LocalDate nextDay = today.plusDays(1);
    //    LocalDate previousDay = today.minusDays(1);
    //    LocalDate previousMonthSameDay = today.minus(1, ChronoUnit.MONTHS);
    //    LocalDate nextMonthSameDay = today.plus(1, ChronoUnit.MONTHS);
    //    DayOfWeek dayOfWeek = LocalDate.parse("1991-06-05").getDayOfWeek();
    //    int dayOfTheMonth = LocalDate.parse("1991-06-05").getDayOfMonth();
    // System.out.println(dayOfWeek+":"+dayOfTheMonth);
    // boolean isLeapYear = LocalDate.now().isLeapYear();
    // System.out.println(isLeapYear);
    // System.out.println(LocalDate.of(1991, 06, 05).isLeapYear());
    // WorkingWithDate.printDate(today, nextMonthSameDay);
    // boolean isAfter = LocalDate.parse("1991-06-05").isAfter(LocalDate.parse("1891-06-05"));
    // System.out.println(isAfter);
    // boolean isBefore = LocalDate.parse("1991-06-05").isAfter(LocalDate.parse("1991-06-05"));
    // System.out.println(isBefore);
    //    LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
    //    LocalDate firstDayOfMonth =
    //        LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
    // System.out.println(beginningOfDay);
    // System.out.println(firstDayOfMonth);
    // Working with LocalTime
    //
    //    LocalTime timeNow = LocalTime.now();
    //    WorkingWithDate.printTime(timeNow);
    //
    //      ZoneId zoneId = ZoneId.of("Europe/Paris");
    // System.out.println(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String date = "2016-08-16";

        System.out.println(date);

      DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
      //Date date1 = format.parse(date);

      //LocalDate localDate = LocalDate.parse(date, formatter1);

      //System.out.println(localDate);

    // System.out.println(localDate);

    // System.out.println(formatter.format(localDate));

   // List<String> list = Arrays.asList("A", "B", "C", "D");

    //    List<String> result =
    //        list.stream()
    //            .map(
    //                l -> {
    //                  List<String> l1 = new ArrayList<>();
    //                  list.forEach(l2 -> l1.add(l2));
    //                  return l1;
    //                })
    //            .findFirst()
    //            .get();
    //
    //    System.out.println(result);
//    Optional<String> s = Optional.ofNullable(list.stream().filter(a -> a.equalsIgnoreCase("K")).findFirst().get());
//    System.out.println(s.isPresent());
    //    Optional<String> result1 = list.stream().findAny();
    //    System.out.println(result1);
    //    System.out.println(result1.isPresent());
    //    System.out.println(result1.toString());

    //    Optional<String> result1 = list.stream().findFirst();
    //    Optional<String> result2 = list.stream().findAny();
    //    System.out.println(result);
    //    System.out.println(result1);
    //    System.out.println(result2);
  }

  private static void printDate(LocalDate today, LocalDate localDate) {
    // System.out.println(today);
    // System.out.println(localDate);
  }

  private static void printTime(LocalTime time) {
    // System.out.println(time);
  }
}
