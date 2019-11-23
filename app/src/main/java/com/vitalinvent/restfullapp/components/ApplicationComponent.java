package com.vitalinvent.restfullapp.components;

import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMainComponent;
import com.vitalinvent.restfullapp.modules.ContextModule;
import com.vitalinvent.restfullapp.modules.DaoModule;
import com.vitalinvent.restfullapp.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {ContextModule.class, DaoModule.class, NetModule.class})
@Singleton
public interface ApplicationComponent {

    void inject(FragmentMainComponent createFragmentMainComponent);

}
