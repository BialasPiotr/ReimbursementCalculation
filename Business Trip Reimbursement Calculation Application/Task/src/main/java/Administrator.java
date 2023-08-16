import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private List<String> receiptTypes = new ArrayList<>();

    public void addReceiptType(String type) {
        receiptTypes.add(type);
    }

    public void removeReceiptType(String type) {
        receiptTypes.remove(type);
    }

    public List<String> getReceiptTypes() {
        return receiptTypes;
    }
}
