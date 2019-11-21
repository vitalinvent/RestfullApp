package com.vitalinvent.restfullapp.fragments.fragment_main;

import javax.inject.Singleton;

import dagger.Subcomponent;

@Subcomponent
@Singleton
public interface FragmentMainComponent {
    void inject(FragmentMain fragmentMain);
}
