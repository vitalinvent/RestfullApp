package com.vitalinvent.restfullapp.modules;

import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMain;

import javax.inject.Singleton;

import dagger.Subcomponent;

@Subcomponent
@Singleton
public interface NetComponent {

    void inject(NetComponent netComponent);

    void inject(FragmentMain fragmentMain);
}
