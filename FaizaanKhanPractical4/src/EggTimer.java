public class EggTimer extends Clock {

    public EggTimer(String whoAmI) {
        super(whoAmI);
    }

    @Override
    public void count() {
        time--;
    }
}
