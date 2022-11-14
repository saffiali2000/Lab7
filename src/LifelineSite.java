public class LifelineSite extends Site{
    private double _units;
    private double _rate;

    public LifelineSite(){
        _units = 40;
        _rate = 15;
    }

    private double getBaseAmount() {
        double base = _units *_rate*0.5;
        return base;
    }

    private double getTaxAmount() {
        double base = getBaseAmount();
        double tax = base* Site.TAX_RATE*0.2;
        return tax;
    }
}
