package com.vitalinvent.restfullapp.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

import java.util.Objects;
import java.util.UUID;

import dagger.Provides;

@Entity(nameInDb = "orders")
public class User {
    String email;
    String name;
    String name1;
    String hobby;
    String surname1;
    String fathername1;
    String cat;
    String dog;
    String parrot;
    String cavy;
    String hamster;
    String squirrel;
    String phone;
    String adres;
    String gender;
    String birthday;
    String date;
    String by_user;
    public String getBy_user() {
        return this.by_user;
    }
    public void setBy_user(String by_user) {
        this.by_user = by_user;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getBirthday() {
        return this.birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAdres() {
        return this.adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getSquirrel() {
        return this.squirrel;
    }
    public void setSquirrel(String squirrel) {
        this.squirrel = squirrel;
    }
    public String getHamster() {
        return this.hamster;
    }
    public void setHamster(String hamster) {
        this.hamster = hamster;
    }
    public String getCavy() {
        return this.cavy;
    }
    public void setCavy(String cavy) {
        this.cavy = cavy;
    }
    public String getParrot() {
        return this.parrot;
    }
    public void setParrot(String parrot) {
        this.parrot = parrot;
    }
    public String getDog() {
        return this.dog;
    }
    public void setDog(String dog) {
        this.dog = dog;
    }
    public String getCat() {
        return this.cat;
    }
    public void setCat(String cat) {
        this.cat = cat;
    }
    public String getFathername1() {
        return this.fathername1;
    }
    public void setFathername1(String fathername1) {
        this.fathername1 = fathername1;
    }
    public String getSurname1() {
        return this.surname1;
    }
    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }
    public String getHobby() {
        return this.hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getName1() {
        return this.name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Generated(hash = 821861600)
    public User(String email, String name, String name1, String hobby,
            String surname1, String fathername1, String cat, String dog,
            String parrot, String cavy, String hamster, String squirrel,
            String phone, String adres, String gender, String birthday,
            String date, String by_user) {
        this.email = email;
        this.name = name;
        this.name1 = name1;
        this.hobby = hobby;
        this.surname1 = surname1;
        this.fathername1 = fathername1;
        this.cat = cat;
        this.dog = dog;
        this.parrot = parrot;
        this.cavy = cavy;
        this.hamster = hamster;
        this.squirrel = squirrel;
        this.phone = phone;
        this.adres = adres;
        this.gender = gender;
        this.birthday = birthday;
        this.date = date;
        this.by_user = by_user;
    }
    @Generated(hash = 586692638)
    public User() {
    }
}
