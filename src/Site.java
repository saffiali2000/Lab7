public class Site {
    protected static final double TAX_RATE = 1.13;
    public Site(){
    }
    public double getBillableAmount(){
        return getBasemount() + getTaxAmount();
    }
}
