package com.vitalinvent.restfullapp.fragments.fragment_main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.vitalinvent.restfullapp.MainActivity;
import com.vitalinvent.restfullapp.MainApplication;
import com.vitalinvent.restfullapp.R;
import com.vitalinvent.restfullapp.common.Errors;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FragmentMain extends Fragment {

    private View rootView;
    private Unbinder unbinder;

    public FragmentMain() { super();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        try {
            unbinder = ButterKnife.bind(this, rootView);
            ((MainActivity) getActivity()).getSupportActionBar().setTitle(R.string.fragment_main_title);
            MainApplication.getApplication(getActivity().getApplicationContext())
                    .getComponentsHolder()
                    .getFragmentMainComponent()
                    .inject(this);
            ((MainActivity) getActivity()).getSupportActionBar().setTitle(R.string.fragment_main_title);
        } catch (Exception ex) { Errors.ShowSend(ex); }
        return rootView;
    }

}
