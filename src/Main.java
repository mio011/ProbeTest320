import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garten garten = new Garten(List.of(new Pflanze(), new Pflanze(), new Pflanze(), new Pflanze(), new Rose(2, 16), new Rose(2, 16)));
        Gartensimulation g = new Gartensimulation(garten);
        g.start();
    }
}