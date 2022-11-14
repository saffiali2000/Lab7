public class LifelineSite extends Site{
    private double _units;
    private double _rate;

    public LifelineSite(){
        _units = 40;
        _rate = 15;
    }

    public Double getBillableAmount(){
        double base = _units *_rate*0.5;
        double tax = base* Site.TAX_RATE*0.2;
        return base + tax;

    }
}
