package com.example.michel.mvparchitecture.mainscreen;

import com.example.michel.mvparchitecture.data.component.NetComponent;
import com.example.michel.mvparchitecture.util.CustomScope;

import dagger.Component;

/**
 * Created by michel on 27/09/16.
 */
@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
