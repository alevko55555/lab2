package lab2;

public class FlightParser extends ParserUtils{
    private static final int DELAY_COL = 14;
    private static final int DELAY_NEW_COL = 18;

    public FlightParser(String str) {
        super(str);
    }
    public String getDelayIdAirport() {
        return getString(DELAY_COL);
    }
    public String getDelay() {
        String delay = getString(DELAY_NEW_COL);
        return delay.isEmpty() ? "0.0" : delay;
    }
}
