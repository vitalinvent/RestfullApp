package com.vitalinvent.restfullapp;

import android.content.Context;

import com.vitalinvent.restfullapp.components.ApplicationComponent;
import com.vitalinvent.restfullapp.components.DaggerApplicationComponent;
import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMainComponent;
import com.vitalinvent.restfullapp.modules.ContextModule;

public class ComponentsHolder {

    private final Context context;
    private ApplicationComponent applicationComponent;
    private FragmentMainComponent fragmentMainComponent;

    public ComponentsHolder(Context _context) {
        this.context = _context;
    }


    public void init(){
        applicationComponent= DaggerApplicationComponent.builder().contextModule(new ContextModule(context)).build();
    }
    public ApplicationComponent getApplicationComponent() { return applicationComponent;}
    public FragmentMainComponent getFragmentMainComponent(){
        if(fragmentMainComponent == null){
            getApplicationComponent().inject(fragmentMainComponent);//.createFragmentMainComponent();
        }
        return fragmentMainComponent;
    }

    public void releaseFragmentMainComponent() { fragmentMainComponent = null;};
}
