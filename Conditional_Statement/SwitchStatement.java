public class SwitchStatement {
    public static void main(String[] args) {
        // This program demonstrates the use of a switch statement to determine the day of the week based on a number input.
        int day = 3;
        String dayName;
        switch (day) {
            case 1: dayName = "Monday";
                break;
            case 2: dayName = "Tuesday";
                break;
            case 3: dayName = "Wednesday";
                break;
            case 4: dayName = "Thursday";
                break;
            case 5: dayName = "Friday";
                break;
            case 6: dayName = "Saturday";
                break;
            case 7: dayName = "Sunday";
                break;
            default : dayName = "Holiday";
        }
        System.out.println("Today is " + dayName);
    }
}
