package structural.adapter.output;

// Target interface required by new client code
// Output of adapter
public interface Customer {
    public String getName();
    public String getPhoneNumber();
    public String getLocation();
}
