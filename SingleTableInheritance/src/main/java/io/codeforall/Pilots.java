package io.codeforall;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pilots")
public class Pilots extends Airport {
    private String pilotsName;


    public String getName() {
        return pilotsName;
    }

    public void setName(String name) {
        this.pilotsName = pilotsName;
    }


}
