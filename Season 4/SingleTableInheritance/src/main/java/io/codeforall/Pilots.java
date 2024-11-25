package io.codeforall;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pilots")
public class Pilots extends Airport {
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
