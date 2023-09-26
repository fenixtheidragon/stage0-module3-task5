package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        int minutesInt = (int) (minutes * 100) / 100;
        int seconds = (int) (minutesInt * 60 + (minutes - minutesInt) * 100);
        System.out.println(seconds);
    }
}
