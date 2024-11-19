package io.codeforall.fanstatics.Airports;

import io.codeforall.fanstatics.Pilot;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "domestic_airports")
public class DomesticAirport extends Airport {

    private String airportName;
    private Integer numberOfDomesticGates;

    @OneToOne
    private Pilot pilots;

    public Integer getNumberOfDomesticGates() {
        return numberOfDomesticGates;
    }

    public void setNumberOfDomesticGates(int numberOfDomesticGates) {
        this.numberOfDomesticGates = numberOfDomesticGates;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
