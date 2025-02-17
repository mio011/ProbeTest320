import java.util.List;

public class Garten {

    private List<Pflanze> pflanzen;

    public Garten(List<Pflanze> pflanzen) {
        this.pflanzen = pflanzen;
    }

    /**
        @implNote getPflanzen fn,mansdfknkjsanfkjnsajkdfjsadf sadfasf
     */

    public List<Pflanze> getPflanzen() {
        return pflanzen;
    }

    public void giessePflanze(int pflanze) {
        pflanzen.get(pflanze - 1).giesse();
    }

    public boolean istAllesGeerntet() {
        for (Pflanze pf : pflanzen) {
            if(!pf.istErntbar()) return false;
        }
        return true;
    }

}
