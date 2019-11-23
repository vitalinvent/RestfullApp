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

import com.vitalinvent.restfullapp.R;
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

    @BindView(R.id.tv_email)
    TextView email;
    @BindView(R.id.tv_name)
    TextView name;
    @BindView(R.id.tv_name1)
    TextView name1;
    @BindView(R.id.tv_hobby)
    TextView hobby;
    @BindView(R.id.tv_surname1)
    TextView surname1;
    @BindView(R.id.tv_fathername)
    TextView fathername1;
    @BindView(R.id.tv_cat)
    TextView cat;
    @BindView(R.id.tv_dog)
    TextView dog;
    @BindView(R.id.tv_parrot)
    TextView parrot;
    @BindView(R.id.tv_cavy)
    TextView cavy;
    @BindView(R.id.tv_hamster)
    TextView hamster;
    @BindView(R.id.tv_squirrel)
    TextView squirrel;
    @BindView(R.id.tv_phone)
    TextView phone;
    @BindView(R.id.tv_adres)
    TextView adres;
    @BindView(R.id.tv_gender)
    TextView gender;
    @BindView(R.id.tv_birthday)
    TextView birthday;
    @BindView(R.id.tv_date)
    TextView date;
    @BindView(R.id.tv_by_user)
    TextView by_user;

    @BindView(R.id.ok_button_save)
    Button ok_button_save;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_user_detail, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        emailSelected = getArguments().getString("email");
        nameSelected = getArguments().getString("name");
        name1Selected = getArguments().getString("name1");
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

        email.setText(emailSelected);
        name.setText(nameSelected);
        name1.setText(name1Selected);
        hobby.setText(hobbySelected);
        surname1.setText(surname1Selected);
        fathername1.setText(fathername1Selected);
        cat.setText(catSelected);
        dog.setText(dogSelected);
        parrot.setText(parrotSelected);
        cavy.setText(cavySelected);
        hamster.setText(hamsterSelected);
        squirrel.setText(squirrelSelected);
        phone.setText(phoneSelected);
        adres.setText(adresSelected);
        gender.setText(genderSelected);
        birthday.setText(birthdaySelected);
        date.setText(dateSelected);
        by_user.setText(by_userSelected);
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

                getFragmentManager().popBackStack();
//                getChildFragmentManager().popBackStack();

            }
        });

        return rootView;
    }
}
