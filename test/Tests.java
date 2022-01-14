import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void itShouldCreateAnValidBuilding_whenCreatingAnValidBuilding() {
        Integer id = 2;
        String resident = "Mark";

        Buildings buildings = new Buildings(resident, id);

        Assert.assertEquals(buildings.id, id);
        Assert.assertEquals(buildings.initialResident, resident);
    }
}
