import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdministratorTest {

    private Administrator admin;

    @Before
    public void setUp() {
        admin = new Administrator();
    }

    @Test
    public void testAddReceiptType() {
        admin.addReceiptType("food");
        assertTrue(admin.getReceiptTypes().contains("food"));
    }

    @Test
    public void testRemoveReceiptType() {
        admin.addReceiptType("food");
        admin.removeReceiptType("food");
        assertFalse(admin.getReceiptTypes().contains("food"));
    }
}
