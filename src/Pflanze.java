public class Pflanze {
    int höhe = 0;
    int hoeheAusgewachsen = 3;
    String symbol = "\ud83c\udf3b";
    String name = "Pflanze";

    public int getHöhe() {
        return höhe;
    }

    public void giesse() {
        höhe += 1;
    }
    public boolean istErntbar() {
        return höhe >= hoeheAusgewachsen;
    }

    public String toString() {
        return symbol + " " + name + ": " + höhe + "/" + hoeheAusgewachsen;
    }
}
