package structural.adapter.object_adapter;

import structural.adapter.input.Employee;
import structural.adapter.output.BusinessCardDesigner;

public class ObjectAdapterClient {
    public static void main(String args[]) {
        Employee employee = new Employee();
        populateEmployeeData(employee);

        EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer = new BusinessCardDesigner();

        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Hritik");
        employee.setLocation("Mumbai");
        employee.setPhoneNumber("8209062638");
    }
}
