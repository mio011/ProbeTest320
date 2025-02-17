import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gartensimulation {
    Garten garten;
    Wuerfel wuerfel = new Wuerfel();

    public Gartensimulation(Garten garten) {
        this.garten = garten;
    }

    public void start() {
        while (!garten.istAllesGeerntet()) {
            int pflanze = frageSpieler(wuerfel.wuerfle(), wuerfel.wuerfle());
            garten.giessePflanze(pflanze);
            zeigeGarten();
        }
        System.out.println("Garten wurde erfolgreich gegossen!");
    }

    public int frageSpieler(int wurf1, int wurf2) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sie haben " + wurf1 + ", " + wurf2 + " gewürfelt.\nWelche Pflanze wollen sie giessen?");
        int result;
        try {
            result = Integer.parseInt(r.readLine());
        } catch (Exception e) {
            throw new RuntimeException();
        }
        while (result != wurf1 && result != wurf2 && result != wurf1 + wurf2) {
            System.out.println("Ihre eingabe hat nicht den Regeln entsprochen. Sie können die Zahlen " + wurf1 + ", " + wurf2 + " und " + (wurf1 + wurf2) + " giessen.");
            System.out.println("Sie haben " + wurf1 + ", " + wurf2 + " gewürfelt.\nWelche Pflanze wollen sie giessen?");
            try {
                result = Integer.parseInt(r.readLine());
            } catch (Exception e) {
                result = 0;
            }
        }
        return result;
    }

    public void zeigeGarten() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Pflanze pflanzen : garten.getPflanzen()) {
            stringBuilder.append(pflanzen.toString());
            if (pflanzen != garten.getPflanzen().getLast()) {
                stringBuilder.append(" || ");
            }
        }
        System.out.println(stringBuilder);
    }
}
