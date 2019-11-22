package com.vitalinvent.restfullapp;

import android.content.Context;

import com.vitalinvent.restfullapp.components.ApplicationComponent;
import com.vitalinvent.restfullapp.components.DaggerApplicationComponent;
import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMainComponent;

public class ComponentsHolder {

    private final Context context;
    private ApplicationComponent applicationComponent;
    private FragmentMainComponent fragmentMainComponent;
    private NetComponent netComponent;

    public ComponentsHolder(Context _context) {
        this.context = _context;
    }


    public void init(){
        applicationComponent= DaggerApplicationComponent
                .builder()
                .contextModule(new ContextModule(context))
//                .netModule(new NetModule( context.getString(R.string.server_url)))
                .build();
    }
    public ApplicationComponent getApplicationComponent() { return applicationComponent;}

    public FragmentMainComponent getFragmentMainComponent(){
        if(fragmentMainComponent == null){
            getApplicationComponent().inject(fragmentMainComponent);
        }
        return fragmentMainComponent;
    }

    public NetComponent getNetComponent(){
        if(netComponent == null){
            getApplicationComponent().inject(netComponent);
        }
        return netComponent;
    }

    public void releaseFragmentMainComponent() { fragmentMainComponent = null;};
    public void releaseNetComponent() { netComponent = null;};

}
