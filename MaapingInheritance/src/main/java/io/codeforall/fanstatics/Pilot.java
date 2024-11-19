package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Airports.Airport;

import javax.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilot extends Airport {

    private String pilotsName;

    private String licenseType;



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

