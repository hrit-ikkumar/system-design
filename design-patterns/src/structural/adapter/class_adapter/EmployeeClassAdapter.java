package structural.adapter.class_adapter;

import structural.adapter.input.Employee;
import structural.adapter.output.Customer;

public class EmployeeClassAdapter extends Employee implements Customer {
    @Override
    public String getName() {
        return this.getFullName();
    }
}
