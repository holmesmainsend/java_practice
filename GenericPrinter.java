// Could also write it as <T extends SomeClass>, termed a bounded generic, if specifying which specific child classes are allowed); this would also allow thingToPrint to access SomeClass's methods. If implementing interface, must still use extends keyword instead of the usual implements. Could also add multiple bounds, e.g. <T extends SomeClass & SomeInterface>, so long as class always come first followed by interface(s).

public class GenericPrinter <T>{
    T thingToPrint;

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}