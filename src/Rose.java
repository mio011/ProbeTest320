public class Rose extends Pflanze {

    int hoehe;
    int hoeheAusgewachsen;
    String name = "Rose";
    String symbol = "\ud83c\udf39";

    public Rose(int hoehe, int hoeheAusgewachsen){
        this.hoehe = hoehe;
        this.hoeheAusgewachsen = hoeheAusgewachsen;
    }

    public void giesse() {
        höhe += hoehe * hoehe;
    }

    public boolean istErntbar() {
        return höhe >= hoeheAusgewachsen;
    }

    public String toString() {
        return symbol + " " + name + ": " + höhe + "/" + hoeheAusgewachsen;
    }
}
