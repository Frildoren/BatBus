package com.batmafia.batbus.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.batmafia.batbus.R;
import com.batmafia.batbus.model.BusLine;
import com.batmafia.batbus.presenter.test.TestPresenter;
import com.batmafia.batbus.presenter.test.TestPresenterImpl;
import com.batmafia.batbus.view.test.TestView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestActivity extends BaseActivity implements TestView {

    public static final String LINES_BUNDLE = "LINES_BUNDLE";


    private EditText stopNumber;
    private Button stopButton;
    private ListView stopList;

    private List<BusLine> lines;

    private TestPresenter testPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        testPresenter = new TestPresenterImpl();
        testPresenter.initialize(this, this);

        stopNumber = (EditText) findViewById(R.id.stop_number);
        stopButton = (Button) findViewById(R.id.stop_button);
        stopList = (ListView) findViewById(R.id.stop_list);

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testPresenter.onStopButtonClick(stopNumber.getText().toString());
            }
        });

        if(savedInstanceState != null){
            lines = (List<BusLine>) savedInstanceState.getSerializable(LINES_BUNDLE);
            setLines(lines);
        }
    }


    @Override
    public void setLines(final List<BusLine> lines){
        this.lines = lines;
        List<String> stringList = new ArrayList<>();

        for(BusLine busLine : lines){
            stringList.add(busLine.getLineNumber()+" "+busLine.getLineBound()+" "+busLine.getWaitTime());
        }

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stringList);
        stopList.setAdapter(stringArrayAdapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(LINES_BUNDLE, (Serializable) lines);
    }
}
