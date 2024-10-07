package org.example.java17.SwitchCase;

public class WithYieldStatement {

    public static void main(String[] args) {
        System.out.println(getDayOfTheWeak (DayOfTheWeak.THURSDAY));
        System.out.println(getDayOfTheWeakWithYield (DayOfTheWeak.THURSDAY));
    }

    static String getDayOfTheWeak(DayOfTheWeak dow) {

        String day = "";

           switch (dow) {
                case DayOfTheWeak.MONDAY -> {
                    System.out.println("Monday");
                    day = "Monday";
                }case DayOfTheWeak.TUESDAY -> {
                   System.out.println("Tuesday");
                    day = "Tuesday";
                }case DayOfTheWeak.WEDNESDAY-> {
                   System.out.println("Wednesday");
                    day = "Wednesday";
                }case DayOfTheWeak.THURSDAY -> {
                    day = "Thursday";
                   System.out.println("Thursday");
               }case DayOfTheWeak.FRIDAY -> {
                   System.out.println("Friday");
                    day = "Friday";
                }case DayOfTheWeak.SATURDAY -> {
                   System.out.println("Saturday");
                    day = "Saturday";
               }
            };
        return day;
    }

    static String getDayOfTheWeakWithYield(DayOfTheWeak dow) {

        return switch (dow) {
            case DayOfTheWeak.MONDAY -> {
                System.out.println("Monday");
                yield  "Monday";
            }case DayOfTheWeak.TUESDAY -> {
                System.out.println("Tuesday");
                yield  "Tuesday";
            }case DayOfTheWeak.WEDNESDAY-> {
                System.out.println("Wednesday");
                yield  "Wednesday";
            }case DayOfTheWeak.THURSDAY -> {
                System.out.println("## Thursday");
                yield  "Thursday";
            }case DayOfTheWeak.FRIDAY -> {
                System.out.println("Friday");
                yield  "Friday";
            }case DayOfTheWeak.SATURDAY -> {
                System.out.println("Saturday");
                yield  "Saturday";
            }
        };

    }
}
