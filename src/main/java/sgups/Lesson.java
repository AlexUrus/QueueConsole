package sgups;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Lesson {
    String name;
    public Calendar startLess;
    public Calendar endLess;

    public QueueStudent queueStudent;

    public Lesson(String name, String tStartLess, String tEndLess) {
        this.name = name;
        startLess = new GregorianCalendar();
        endLess = new GregorianCalendar();
        setTimeLess(tStartLess,startLess);
        setTimeLess(tEndLess,endLess);
        queueStudent = new QueueStudent();
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", startLess=" + startLess.getTime() +
                ", endLess=" + endLess.getTime() +
                '}';
    }

    private void setTimeLess(String startDate, Calendar calendar) {
        //формат даты hours.min day.month.year
        String[] strings = startDate.split(" ");
        String[] time = strings[0].split("\\.");
        String[] date = strings[1].split("\\.");
        calendar.set(Integer.parseInt(date[2]),Integer.parseInt(date[1]),Integer.parseInt(date[0]),
                Integer.parseInt(time[0]),Integer.parseInt(time[1]));
    }

}
