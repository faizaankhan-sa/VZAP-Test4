public class Main {
    public static void main(String[] args) {
        EggTimer eggTimer = new EggTimer("i am an egg timer");
        StopWatch stopWatch = new StopWatch("i am a stop watch");

        eggTimer.start(20);
        stopWatch.start(0);

        eggTimer.count();
        System.out.println(eggTimer.whoAmI + ",time is" + eggTimer.time);

        stopWatch.count();
        System.out.println(stopWatch.whoAmI + ",time is" + stopWatch.time);

        stopWatch.setLapTime();
        System.out.println("the laptime was" + stopWatch.getLapTime());

        eggTimer.stop();
        stopWatch.stop();
    }
}






