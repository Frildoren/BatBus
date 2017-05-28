package com.batmafia.batbus.model;

import java.io.Serializable;

public class BusLine implements Serializable {

    private Boolean isNightLine;
    private String waitTime;
    private String source;
    private String lineNumber;
    private String lineBound;

    public Boolean getNightLine() {
        return isNightLine;
    }

    public void setNightLine(Boolean nightLine) {
        isNightLine = nightLine;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLineBound() {
        return lineBound;
    }

    public void setLineBound(String lineBound) {
        this.lineBound = lineBound;
    }
}
