public record EmployeeRecord(String name, int employeeNumber) {
    public String nameCapitalized() {
        return name.toUpperCase();
    }
}