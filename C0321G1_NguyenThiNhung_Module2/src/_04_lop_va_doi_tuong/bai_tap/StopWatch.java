package _04_lop_va_doi_tuong.bai_tap;
import java.time.LocalTime;
public class StopWatch {
    private LocalTime starTime,endTime;
    public StopWatch(){
        starTime=LocalTime.now();
    }
    public LocalTime getStarTime() {
        return starTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public StopWatch(LocalTime starTime,LocalTime endTime){
        this.starTime=starTime;
        this.endTime=endTime;
    }
    public void star(){
        starTime=LocalTime.now();
    }
    public void end(){
        endTime=LocalTime.now();
    }
    public int getElapsedTime(){
        int second=((endTime.getHour())-(starTime.getHour()))*3600+
                ((endTime.getMinute())-starTime.getMinute())*60+
                ((endTime.getSecond())-starTime.getSecond())*1000;
        return second;
    }


}
