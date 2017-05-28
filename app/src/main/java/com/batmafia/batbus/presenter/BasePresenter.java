package com.batmafia.batbus.presenter;

import android.content.Context;

import com.batmafia.batbus.view.View;

public class BasePresenter<T extends View> implements Presenter<T> {

    private T view;
    private Context context;

    public void initialize(Context context, T view){
        this.view = view;
        this.context = context;
    }

    public T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
