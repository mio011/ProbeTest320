import java.util.Random;

public class Wuerfel {

    int maxWurfZahl = 3;

    public int wuerfle() {
        Random rand = new Random();
        return rand.nextInt(1, maxWurfZahl + 1);
    }
}
