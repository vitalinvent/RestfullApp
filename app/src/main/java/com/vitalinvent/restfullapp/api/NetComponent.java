package com.vitalinvent.restfullapp.api;

import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMain;
import com.vitalinvent.restfullapp.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    void inject(FragmentMain fragmentMain);

}