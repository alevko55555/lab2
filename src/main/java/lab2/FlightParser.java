package lab2;

import java.util.Optional;

public class FlightParser extends ParserUtils{
    public FlightParser(String str) {
        super(str);
    }
    public Optional<Long> getDelayIdAirport() {
        return getLong(14);
    }
    public Optional<Long> getDelay() {
        return getLong(18);
    }
}
