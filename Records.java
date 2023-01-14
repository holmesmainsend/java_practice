// Records are immutable by default, so no setters. Records cannot extend other classes, since they implicitly already extend the record class. Implicitly final, so cannot be extended by other classes either. Interfaces are allowed, however.
public class Records {
    public static void main(String[] args) {
        EmployeeRecord employeeData = new EmployeeRecord("Bob", 994);
        // System.out.println(employeeData.name());
        // System.out.println(employeeData);
        System.out.println(employeeData.nameCapitalized());

    }   
}