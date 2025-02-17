import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class GartenTest {
    Garten garten;

    @BeforeEach
    public void initialize() {
        garten = new Garten(List.of(new Rose(1, 2), new Rose(2, 5), new Pflanze()));

    }


}
