package structural.adapter.output;

// Client code which requires Customer interface
public class BusinessCardDesigner {
    public String designCard(Customer customer) {
        String card = "";
        card = customer.getName() + "\n" +
                customer.getPhoneNumber() + "\n" +
                customer.getLocation();
        return card;
    }
}
