import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void itShouldCreateAnValidBuilding_GivenIDAndResident() {
        Integer id = 2;
        String resident = "Mark";

        Buildings buildings = new Buildings(resident, id);

        Assert.assertEquals(buildings.id, id);
        Assert.assertEquals(buildings.initialResident, resident);
    }

    @Test
    public void itShouldCreateAnValidBuilding_GivenIDAndMoreResidents() {
        String[] residents = {"Mark", "Paul"};
        int id = 0;

        Buildings buildings = new Buildings(residents, id);

        Assert.assertEquals(buildings.initialResidents, residents);
    }
}
