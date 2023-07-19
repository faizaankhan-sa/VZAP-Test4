public abstract class Clock implements Timer {

    int time;
    String whoAmI;

    public Clock(String whoAmI) {
        this.whoAmI = whoAmI;
    }

    @Override
    public void start(int time) {
        this.time = time;
    }

    @Override
    public void stop() {
        System.out.println(whoAmI + ",i have stopped");
    }

    @Override
    public abstract void count();
}
