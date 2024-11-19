package io.codeforall.fanstatics.Airports;


import io.codeforall.fanstatics.Pilot;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "InternationalAirport")
public class InternationalAirport extends Airport {

    private String airportName;

    @OneToOne
    private Pilot pilots;

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
