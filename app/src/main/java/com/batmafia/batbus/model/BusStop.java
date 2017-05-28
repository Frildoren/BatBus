package com.batmafia.batbus.model;

import java.util.List;

public class BusStop {

    private String stopName;
    private String stopType;
    private List<BusLine> lines;

    private String notAvailableLines;
    private String stopNumber;

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }

    public List<BusLine> getLines() {
        return lines;
    }

    public void setLines(List<BusLine> lines) {
        this.lines = lines;
    }

    public String getNotAvailableLines() {
        return notAvailableLines;
    }

    public void setNotAvailableLines(String notAvailableLines) {
        this.notAvailableLines = notAvailableLines;
    }

    public String getStopNumber() {
        return stopNumber;
    }

    public void setStopNumber(String stopNumber) {
        this.stopNumber = stopNumber;
    }
}
