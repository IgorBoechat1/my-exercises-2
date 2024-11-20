package io.codeforall.fanstatics.Airports;

import io.codeforall.fanstatics.Pilot;
import io.codeforall.fanstatics.Plane;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "domesticAirport")
public class DomesticAirport extends Airport {

    private String airportName;

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Owning sidee
    private Pilot pilots;

    @OneToMany(mappedBy = "domesticAirport", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Plane> planes = new ArrayList<>();

    public void addPlane(Plane plane) {
        this.planes.add(new Plane());

    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
