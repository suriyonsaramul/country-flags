package com.example.countryflags;

public class Country {
    private String name;
    private String zone;
    private int flag;

    public Country() {
    }

    public Country(String name, String zone, int flag) {
        this.name = name;
        this.zone = zone;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public String getZone() {
        return zone;
    }

    public int getFlag() {
        return flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
