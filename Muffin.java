public class Muffin {
    private final String flavor;
    private int fiberGrams;

    public Muffin(String flavor, int fiberGrams) {
        this.flavor = flavor;
        this.fiberGrams = fiberGrams;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getFiberContent() {
        return fiberGrams;
    }

    public void setFiberContent(int fiberGrams) {
        this.fiberGrams = fiberGrams;
    }
}