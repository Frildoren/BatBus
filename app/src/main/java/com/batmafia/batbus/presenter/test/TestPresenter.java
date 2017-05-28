package com.batmafia.batbus.presenter.test;


import com.batmafia.batbus.presenter.Presenter;
import com.batmafia.batbus.view.test.TestView;

public interface TestPresenter extends Presenter<TestView> {
    void onStopButtonClick(String stopId);
}
