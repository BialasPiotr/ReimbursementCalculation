import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReimbursementTest {

    private Reimbursement reimbursement;

    @Before
    public void setUp() {
        reimbursement = new Reimbursement();
    }

    @Test
    public void testAddReceipt() {
        reimbursement.addReceipt("taxi", 50.0);
        double total = reimbursement.calculateTotalReimbursement(1, 0);
        assertEquals(65.0, total, 0.01);
    }

    @Test
    public void testCalculateTotalReimbursement() {
        double total = reimbursement.calculateTotalReimbursement(2, 10);
        assertEquals(36.0, total, 0.01);
    }
}
