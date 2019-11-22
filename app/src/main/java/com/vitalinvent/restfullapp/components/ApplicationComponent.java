package com.vitalinvent.restfullapp.components;

import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMainComponent;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {ContextModule.class, DaoModule.class, NetModule.class})
@Singleton
public interface ApplicationComponent {

    void inject(FragmentMainComponent createFragmentMainComponent);

    void inject(NetComponent netComponent);

}
