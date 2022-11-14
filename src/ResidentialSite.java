public class ResidentialSite extends Site{
    private double _units;
    private double _rate;

    public ResidentialSite(){
        _units = 50;
        _rate = 20;
    }
@Override
    public double getTaxAmount() {
        double base = getBaseAmount();
        double tax = base* Site.TAX_RATE;
        return tax;
    }
@Override
    public double getBaseAmount() {
        double base = _units *_rate;
        return base;
    }
}
