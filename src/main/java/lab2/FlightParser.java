package lab2;

//import java.util.Optional;

public class FlightParser extends ParserUtils{
    public FlightParser(String str) {
        super(str);
    }
    public String getDelayIdAirport() {
        return getString(14);
    }
    public String getDelay() {
        return getString(18);
    }
//    public Optional<String> getDelayIdAirport() {
//        return getString(14);
//    }
//    public Optional<String> getDelay() {
//        return getString(18);
//    }
}
