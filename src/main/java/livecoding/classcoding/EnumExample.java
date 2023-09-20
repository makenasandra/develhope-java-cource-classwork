package livecoding.classcoding;

/**
 * An enumeration (enum for short) in Java is a special data type which contains
 * a set of predefined constants.
 */
public class EnumExample {
    enum Day{MONDAY, TUESDAY, WEDNESDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        switch (today){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println("It's a weekday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend");
                break;
        }
    }
}
