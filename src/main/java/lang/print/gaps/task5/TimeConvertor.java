package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float minutesInt = (minutes * 100) / 100;
        float seconds = minutesInt * 60 + (minutes - minutesInt) * 60;
        System.out.println(seconds);
    }
}
