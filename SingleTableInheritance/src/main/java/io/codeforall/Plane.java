package io.codeforall;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "planes")
public class Plane extends Airport {
    public String getplaneName() {
        return planeName;
    }

    public void setName(String name) {
        this.planeName = name;
    }

    private String planeName;
    private String wingType;

    public String getWingType() {
        return wingType;
    }

    public void setWingType(String wingType) {
        this.wingType = wingType;
    }
}
