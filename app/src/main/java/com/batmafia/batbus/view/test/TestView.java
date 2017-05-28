package com.batmafia.batbus.view.test;


import com.batmafia.batbus.model.BusLine;
import com.batmafia.batbus.view.View;

import java.util.List;

public interface TestView extends View {


    void setLines(List<BusLine> lines);
}
