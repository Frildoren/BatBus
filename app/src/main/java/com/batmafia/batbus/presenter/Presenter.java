package com.batmafia.batbus.presenter;

import android.content.Context;

import com.batmafia.batbus.view.View;

public interface Presenter<T extends View> {

    void initialize(Context context, T view);

}
