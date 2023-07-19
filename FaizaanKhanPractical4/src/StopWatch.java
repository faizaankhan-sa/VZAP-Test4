public class StopWatch extends Clock {

    private int lapTime;

    public StopWatch(String whoAmI) {
        super(whoAmI);
    }

    @Override
    public void count() {
        time++;
    }

    public void setLapTime() {
        lapTime = time;
    }

    public int getLapTime() {
        return lapTime;
    }
}
