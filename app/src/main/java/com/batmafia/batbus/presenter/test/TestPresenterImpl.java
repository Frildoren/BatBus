package com.batmafia.batbus.presenter.test;

import com.batmafia.batbus.api.BusApi;
import com.batmafia.batbus.model.BusStop;
import com.batmafia.batbus.presenter.BasePresenter;
import com.batmafia.batbus.view.test.TestView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestPresenterImpl extends BasePresenter<TestView> implements TestPresenter {

    @Override
    public void onStopButtonClick(String stopId) {
        Call<BusStop> stops = BusApi.getClient(getContext()).getStops(stopId);
        stops.enqueue(new Callback<BusStop>() {
            @Override
            public void onResponse(Call<BusStop> call, Response<BusStop> response) {
                BusStop body = response.body();
                getView().setLines(body.getLines());
            }

            @Override
            public void onFailure(Call<BusStop> call, Throwable t) {
                getView().showMessage(t.getMessage());
            }
        });
    }

}
