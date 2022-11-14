public abstract class Site {
    protected static final double TAX_RATE = 1.13;
    public Site(){
    }
    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();
}
