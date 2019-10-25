package lab2;

public class AirportParser extends ParserUtils{
    public AirportParser(String str) {
        super(str);
    }
    public String getIdAirport() {
        return getString(0);
    }
    public String getInfoAirport() {
        return getString(1);
    }
}
