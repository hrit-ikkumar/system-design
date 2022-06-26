package structural.adapter.object_adapter;

import structural.adapter.input.Employee;
import structural.adapter.output.Customer;

public class EmployeeObjectAdapter implements Customer {
    // composition instead of inheritance
    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getPhoneNumber() {
        return employee.getPhoneNumber();
    }

    @Override
    public String getLocation() {
        return employee.getLocation();
    }
}
