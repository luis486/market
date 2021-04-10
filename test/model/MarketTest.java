
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import exception.*;
import model.*;

public class MarketTest {

    MiniMarket mm;
    Person p;

    public void scenary1() {
        mm = new MiniMarket();
        p = new Person(TypeDocument.TI, 10040);
    }

    public void scenary2() {
        mm = new MiniMarket();
        p = new Person(TypeDocument.CC, 10034);
    }

    public void scenary3() {
        mm = new MiniMarket();
        p = new Person(TypeDocument.PP, 10087);
    }

    @Test
    public void testAddPerson1() {
        scenary1();
        try {
            mm.addPerson(p.getId(), p.getType());
            fail("The child shouldnt be added");
        } catch (AgeException a) {
            assertTrue(mm.getPeople().size() == 0);
        } catch (DayException d) {
            fail("DayException never wont ocurred");
        }
    }

    @Test
    public void testAddPerson2() {
        scenary2();
        String day = mm.compareDayAndId(mm.getDay(), mm.penultimateInt(p.getId()));

        try {
            if (day.equals("No")) {
                day = "It doesnt match current day expected";
                mm.addPerson(p.getId(), p.getType());
                fail("The person shouldnt be added");
            } else {
                mm.addPerson(p.getId(), p.getType());
                assertTrue(p.getId() == mm.getPeople().get(0).getId());
                assertTrue(p.getType() == mm.getPeople().get(0).getType());
            }

        } catch (AgeException a) {
            fail("This exception never wont ocurred");
        } catch (DayException d) {
            assertEquals("We waited different digite", day);
        }
    }

    @Test
    public void testAddPerson3() {
        scenary3();
        String day = mm.compareDayAndId(mm.getDay(), mm.penultimateInt(p.getId()));
        try {
            if (day.equals("No")) {
                day = "It doesnt match current day expected";
                mm.addPerson(p.getId(), p.getType());
                fail("The person shouldnt be added");
            } else {
                mm.addPerson(p.getId(), p.getType());
                assertTrue(p.getId() == mm.getPeople().get(0).getId());
                assertTrue(p.getType() == mm.getPeople().get(0).getType());
            }

        } catch (AgeException a) {
            fail("This exception never wont ocurred");
        } catch (DayException d) {
            assertEquals("We waited different digite", day);
        }
    }
}
