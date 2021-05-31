package _04_lop_va_doi_tuong.bai_tap;

public class StopWatchCachCuaThay {
    private long starTime;
    private long endTime;
    public StopWatchCachCuaThay() {
    }

    public long getStarTime() {
        return starTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void star() {
        starTime = System.currentTimeMillis();
    }
    public void end() {
        endTime = System.currentTimeMillis();
    }
    public long getTime() {
        return endTime - starTime;
    }

}
