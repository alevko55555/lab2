package lab2;

import java.util.ArrayList;
import java.util.Optional;

public class AirportParser extends ParserUtils{
    public AirportParser(String str) {
        super(str);
    }
    public Optional<String> getIdAirport() {
        return getString(0);
    }
    public Optional<String> getInfoAirport() {
        return getString(0);
    }
}
