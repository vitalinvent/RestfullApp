package com.vitalinvent.restfullapp.fragments.fragment_detail;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.vitalinvent.restfullapp.MainActivity;
import com.vitalinvent.restfullapp.MainApplication;
import com.vitalinvent.restfullapp.R;
import com.vitalinvent.restfullapp.common.Errors;
import com.vitalinvent.restfullapp.common.Utils;
import com.vitalinvent.restfullapp.models.DaoMaster;
import com.vitalinvent.restfullapp.models.DaoSession;
import com.vitalinvent.restfullapp.models.User;

import org.greenrobot.greendao.database.Database;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FragmentDetail extends Fragment {

    private View rootView;
    private Unbinder unbinder;
    DaoSession daoSession;

    String emailSelected;
    String nameSelected;
    String name1Selected;
    String hobbySelected;
    String surname1Selected;
    String fathername1Selected;
    String catSelected;
    String dogSelected;
    String parrotSelected;
    String cavySelected;
    String hamsterSelected;
    String squirrelSelected;
    String phoneSelected;
    String adresSelected;
    String genderSelected;
    String birthdaySelected;
    String dateSelected;
    String by_userSelected;

    @BindView(R.id.tv_label_email)
    TextView email;
    @BindView(R.id.tv_label_name)
    TextView name;
    @BindView(R.id.tv_label_name1)
    TextView name1;
    @BindView(R.id.tv_label_hobby)
    TextView hobby;
    @BindView(R.id.tv_label_surname1)
    TextView surname1;
    @BindView(R.id.tv_label_fathername)
    TextView fathername1;
    @BindView(R.id.tv_label_cat)
    TextView cat;
    @BindView(R.id.tv_label_dog)
    TextView dog;
    @BindView(R.id.tv_label_parrot)
    TextView parrot;
    @BindView(R.id.tv_label_cavy)
    TextView cavy;
    @BindView(R.id.tv_label_hamster)
    TextView hamster;
    @BindView(R.id.tv_label_squirrel)
    TextView squirrel;
    @BindView(R.id.tv_label_phone)
    TextView phone;
    @BindView(R.id.tv_label_adres)
    TextView adres;
    @BindView(R.id.tv_label_gender)
    TextView gender;
    @BindView(R.id.tv_label_birthday)
    TextView birthday;
    @BindView(R.id.tv_label_date)
    TextView date;
    @BindView(R.id.tv_label_by_user)
    TextView by_user;

    @BindView(R.id.ok_button_save)
    Button ok_button_save;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        try {
            unbinder = ButterKnife.bind(this, rootView);
            ((MainActivity) getActivity()).getSupportActionBar().setTitle(R.string.fragment_main_title);
            MainApplication.getApplication(getActivity().getApplicationContext())
                    .getComponentsHolder()
                    .getFragmentDetailComponent()
                    .inject(this);
            ((MainActivity) getActivity()).getSupportActionBar().setTitle(R.string.fragment_main_title);
        } catch (Exception ex) {
            Errors.ShowSend(ex);
        }

        nameSelected = getArguments().getString("name");
        name1Selected = getArguments().getString("name1");

        emailSelected = getArguments().getString("email");
        hobbySelected = getArguments().getString("hobby");
        surname1Selected = getArguments().getString("surname1");
        fathername1Selected = getArguments().getString("fathername1");
        catSelected = getArguments().getString("cat");
        dogSelected = getArguments().getString("dog");
        parrotSelected = getArguments().getString("parrot");
        cavySelected = getArguments().getString("cavy");
        hamsterSelected = getArguments().getString("hamster");
        squirrelSelected = getArguments().getString("squirrel");
        phoneSelected = getArguments().getString("phone");
        adresSelected = getArguments().getString("adres");
        genderSelected = getArguments().getString("gender");
        birthdaySelected = getArguments().getString("birthday");
        dateSelected = getArguments().getString("date");
        by_userSelected = getArguments().getString("by_user");


        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(Utils.getContext(), "users_info");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();

        ok_button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User user = new User();
                user.setEmail(emailSelected);
                user.setName(nameSelected);
                user.setName1(name1Selected);
                user.setSurname1(surname1Selected);
                user.setFathername1(fathername1Selected);
                user.setCat(catSelected);
                user.setDog(dogSelected);
                user.setParrot(parrotSelected);
                user.setCavy(cavySelected);
                user.setHamster(hamsterSelected);
                user.setSquirrel(squirrelSelected);
                user.setPhone(phoneSelected);
                user.setAdres(adresSelected);
                user.setGender(genderSelected);
                user.setBirthday(birthdaySelected);
                user.setDate(dateSelected);
                user.setBy_user(by_userSelected);
                daoSession.getUserDao().insert(user);
                getChildFragmentManager().popBackStack();


            }
        });

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
