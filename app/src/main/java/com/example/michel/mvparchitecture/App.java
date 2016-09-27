package com.example.michel.mvparchitecture;

import android.app.Application;

import com.example.michel.mvparchitecture.data.component.DaggerNetComponent;
import com.example.michel.mvparchitecture.data.component.NetComponent;
import com.example.michel.mvparchitecture.data.module.AppModule;
import com.example.michel.mvparchitecture.data.module.NetModule;

/**
 * Created by michel on 26/09/16.
 */

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }
}
