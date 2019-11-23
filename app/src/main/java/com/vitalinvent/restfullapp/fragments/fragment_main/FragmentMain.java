package com.vitalinvent.restfullapp.fragments.fragment_main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vitalinvent.restfullapp.MainActivity;
import com.vitalinvent.restfullapp.MainApplication;
import com.vitalinvent.restfullapp.R;
import com.vitalinvent.restfullapp.adapters.UserAdapter;
import com.vitalinvent.restfullapp.api.Api;
import com.vitalinvent.restfullapp.common.Errors;
import com.vitalinvent.restfullapp.models.DaoSession;
import com.vitalinvent.restfullapp.models.ResultUsers;
import com.vitalinvent.restfullapp.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Response;

//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;

public class FragmentMain extends Fragment implements UserAdapter.ClickListener {

    private View rootView;
    private Unbinder unbinder;
    DaoSession daoSession;
    UserAdapter userAdapter;
    List<User> users = new ArrayList<>();
    @Inject
    Api api;
    @BindView(R.id.recycle_list__users)
    RecyclerView recyclerView;

    public FragmentMain() {
        super();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

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
        } catch (Exception ex) {
            Errors.ShowSend(ex);
        }
//        MainApplication.getApplication(getActivity().getApplicationContext())
//                .getComponentsHolder()
//                .getNetComponent()
//                .inject(this);


//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(Utils.getContext(), "users_info");
//        Database db = helper.getWritableDb();
//        daoSession = new DaoMaster(db).newSession();
//        users = daoSession.getUserDao().loadAll();
//        userAdapter = new UserAdapter(users);
//        recyclerView.setAdapter(userAdapter);


//        ((MyApp)getActivity().getApplication()).getNetComponent().inject(this);
        ((MainApplication) getActivity().getApplication()).getNetComponent().inject(this);


        HashMap<String, String> requestBody = new HashMap<>();
        requestBody.put("query", "ш");
        api.getApiService().data(requestBody).enqueue(new retrofit2.Callback<ResultUsers>() {
            @Override
            public void onResponse(Call<ResultUsers> call, Response<ResultUsers> response) {
                if (response.errorBody() != null) {
                } else if (response.body() != null) {
                    try {
                        for (User user : response.body().results) {
                            users.add(user);
                        }
                    } catch (Exception e) {
                    }
                }
            }

            @Override
            public void onFailure(Call<ResultUsers> call, Throwable t) {
            }
        });
        userAdapter = new UserAdapter(this, users);
        userAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(userAdapter);


        //users = (List<User>) api.getApiService().getUsers();
        users.add(new User("asda", "sdasd", "werew", "sdfsd", "zxczx", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda"));
        users.add(new User("asda", "sdasd", "werew", "sdfsd", "zxczx", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda", "asda"));
        userAdapter = new UserAdapter(this, users);
        userAdapter.notifyDataSetChanged();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(userAdapter);


        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(int position) {
    }
}
