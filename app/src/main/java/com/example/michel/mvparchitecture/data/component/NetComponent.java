package com.example.michel.mvparchitecture.data.component;

import com.example.michel.mvparchitecture.data.module.AppModule;
import com.example.michel.mvparchitecture.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by michel on 26/09/16.
 */
@Singleton
@Component(modules = {
        AppModule.class, NetModule.class
})
public interface NetComponent {
    Retrofit retrofit();
}
