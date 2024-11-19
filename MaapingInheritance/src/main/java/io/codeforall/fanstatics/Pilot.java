package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Airports.Airport;
import io.codeforall.fanstatics.Airports.DomesticAirport;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pilots")
public class Pilot extends Airport {

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }

    private String pilotsName;

    private String licenseType;

    @OneToOne(mappedBy = "pilots", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Inverse side
    private DomesticAirport domesticAirport;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Owning side
    private List<Plane> planes = new ArrayList<>();

    public String getName() {
        return pilotsName;
    }

    public void setName(String name) {
        this.pilotsName = pilotsName;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}

