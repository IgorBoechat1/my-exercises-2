package io.codeforall.fanstatics.Airports;

import io.codeforall.fanstatics.Pilot;
import io.codeforall.fanstatics.Plane;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "domestic_airports")
public class DomesticAirport extends Airport {

    private String airportName;



    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Owning sidee
    private Pilot pilots;

    @OneToMany(mappedBy = "airport", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Plane> planes = new ArrayList<>();



    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
