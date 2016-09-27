package com.example.michel.mvparchitecture.mainscreen;

import com.example.michel.mvparchitecture.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by michel on 27/09/16.
 */
@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;

    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
