package lab2;

import java.util.ArrayList;
import java.util.Optional;

public class AirportParser extends ParserUtils{
    public AirportParser(String str) {
        super(str);
    }
    public Optional<Long> getIdAirport() {
        return getLong(0);
    }
    public Optional<String> getInfoAirport() {
        return getString(1);
    }
}
