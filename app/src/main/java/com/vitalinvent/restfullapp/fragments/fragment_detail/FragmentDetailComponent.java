package com.vitalinvent.restfullapp.fragments.fragment_detail;

import javax.inject.Singleton;

import dagger.Subcomponent;

@Subcomponent
@Singleton
public interface FragmentDetailComponent {
    void inject(FragmentDetail fragmentDetail);
}
