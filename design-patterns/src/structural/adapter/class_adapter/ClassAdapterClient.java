package structural.adapter.class_adapter;

import structural.adapter.output.BusinessCardDesigner;

public class ClassAdapterClient {
    public static void main(String args[]) {
        // Using Class/Two-way adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();

        populateEmployeeData(adapter); // Using an Employee
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
    }

    // Here we end up with an object that has publicly available methods from both adaptee and target interface
    // Mostly we should avoid class adapters!!!
    private static void populateEmployeeData(EmployeeClassAdapter adapter) {
        adapter.setFullName("Hritik");
        adapter.setLocation("Mumbai");
        adapter.setPhoneNumber("8209062638");
    }
}
