package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Airports.Airport;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "planes")
public class Plane extends Airport {
    private String planeName;
    private String wingType;

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
}
