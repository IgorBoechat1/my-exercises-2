package io.codeforall.fanstatics.Airports;


import io.codeforall.fanstatics.Pilot;
import io.codeforall.fanstatics.Plane;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "InternationalAirport")
public class InternationalAirport extends Airport {

    private String airportName;
    @OneToMany(mappedBy = "internationalAirport", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Plane> planes = new ArrayList<>();



    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
