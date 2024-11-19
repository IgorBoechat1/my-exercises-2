package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Airports.Airport;
import io.codeforall.fanstatics.Airports.DomesticAirport;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "planes")
public class Plane {
    private String planeName;
    private String wingType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Owning side
    private List<Pilot> pilots = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // Owning side
    private DomesticAirport airport;

    public String getplaneName() {
        return planeName;
    }

    public void setName(String name) {
        this.planeName = name;
    }


    public String getWingType() {
        return wingType;
    }

    public void setWingType(String wingType) {
        this.wingType = wingType;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }
}
