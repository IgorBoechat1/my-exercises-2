package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Airports.Airport;
import io.codeforall.fanstatics.Airports.DomesticAirport;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pilots")
public class Pilot extends Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pilotsName;

    private String licenseType;

    @OneToOne(mappedBy = "pilot", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Inverse side
    private DomesticAirport domesticAirport;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Owning side
    private List<Plane> planes = new ArrayList<>();

    public String getName() {
        return pilotsName;
    }

    public void setName(String name) {
        this.pilotsName = pilotsName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}

