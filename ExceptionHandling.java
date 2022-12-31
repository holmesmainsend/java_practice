public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int intOne = Integer.parseInt("umbrella");
            System.out.println("After parsing the string above");
        }
        // multi-catch statement would look like catch(Exception1 | Exception2 |... e) {}
        catch(NumberFormatException nfe) {
            System.out.println("Number format invalid");
        }
        catch(NullPointerException npe) {
            System.out.println("Pointer is null");
        }
        catch(Exception e) {
            System.out.println("All other exceptions");
        }
        finally {
            System.out.println("Finally block here, which always executes even if return statement in try (if return statements in both try and finally blocks, the latter will override the former");
        }
        System.out.println("This is the end of the program");
    }
}