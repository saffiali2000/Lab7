public class ResidentialSite extends Site{
    private double _units;
    private double _rate;

    public ResidentialSite(){
        _units = 50;
        _rate = 20;
    }

    private double getTax() {
        double base = getBase();
        double tax = base* Site.TAX_RATE;
        return tax;
    }

    private double getBase() {
        double base = _units *_rate;
        return base;
    }
}
