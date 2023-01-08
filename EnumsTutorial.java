public class EnumsTutorial {
    public static void main(String[] args) {
        DaysOfWeekEnum day = DaysOfWeekEnum.SUNDAY;

        if(day == DaysOfWeekEnum.MONDAY) {
            System.out.println("Garfield has passed");
        } else {
            System.out.println("Reminder that the days of the week are: ");
            for(DaysOfWeekEnum singleDay : DaysOfWeekEnum.values()) {
                System.out.println(singleDay);
            }
        }
        System.out.println("Fun rating for this day: " + day.funRating);
    }
}