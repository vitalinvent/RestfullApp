package com.vitalinvent.restfullapp.models;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "orders".
*/
public class UserDao extends AbstractDao<User, Void> {

    public static final String TABLENAME = "orders";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Email = new Property(0, String.class, "email", false, "EMAIL");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Name1 = new Property(2, String.class, "name1", false, "NAME1");
        public final static Property Hobby = new Property(3, String.class, "hobby", false, "HOBBY");
        public final static Property Surname1 = new Property(4, String.class, "surname1", false, "SURNAME1");
        public final static Property Fathername1 = new Property(5, String.class, "fathername1", false, "FATHERNAME1");
        public final static Property Cat = new Property(6, String.class, "cat", false, "CAT");
        public final static Property Dog = new Property(7, String.class, "dog", false, "DOG");
        public final static Property Parrot = new Property(8, String.class, "parrot", false, "PARROT");
        public final static Property Cavy = new Property(9, String.class, "cavy", false, "CAVY");
        public final static Property Hamster = new Property(10, String.class, "hamster", false, "HAMSTER");
        public final static Property Squirrel = new Property(11, String.class, "squirrel", false, "SQUIRREL");
        public final static Property Phone = new Property(12, String.class, "phone", false, "PHONE");
        public final static Property Adres = new Property(13, String.class, "adres", false, "ADRES");
        public final static Property Gender = new Property(14, String.class, "gender", false, "GENDER");
        public final static Property Birthday = new Property(15, String.class, "birthday", false, "BIRTHDAY");
        public final static Property Date = new Property(16, String.class, "date", false, "DATE");
        public final static Property By_user = new Property(17, String.class, "by_user", false, "BY_USER");
    };


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"orders\" (" + //
                "\"EMAIL\" TEXT," + // 0: email
                "\"NAME\" TEXT," + // 1: name
                "\"NAME1\" TEXT," + // 2: name1
                "\"HOBBY\" TEXT," + // 3: hobby
                "\"SURNAME1\" TEXT," + // 4: surname1
                "\"FATHERNAME1\" TEXT," + // 5: fathername1
                "\"CAT\" TEXT," + // 6: cat
                "\"DOG\" TEXT," + // 7: dog
                "\"PARROT\" TEXT," + // 8: parrot
                "\"CAVY\" TEXT," + // 9: cavy
                "\"HAMSTER\" TEXT," + // 10: hamster
                "\"SQUIRREL\" TEXT," + // 11: squirrel
                "\"PHONE\" TEXT," + // 12: phone
                "\"ADRES\" TEXT," + // 13: adres
                "\"GENDER\" TEXT," + // 14: gender
                "\"BIRTHDAY\" TEXT," + // 15: birthday
                "\"DATE\" TEXT," + // 16: date
                "\"BY_USER\" TEXT);"); // 17: by_user
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"orders\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(1, email);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String name1 = entity.getName1();
        if (name1 != null) {
            stmt.bindString(3, name1);
        }
 
        String hobby = entity.getHobby();
        if (hobby != null) {
            stmt.bindString(4, hobby);
        }
 
        String surname1 = entity.getSurname1();
        if (surname1 != null) {
            stmt.bindString(5, surname1);
        }
 
        String fathername1 = entity.getFathername1();
        if (fathername1 != null) {
            stmt.bindString(6, fathername1);
        }
 
        String cat = entity.getCat();
        if (cat != null) {
            stmt.bindString(7, cat);
        }
 
        String dog = entity.getDog();
        if (dog != null) {
            stmt.bindString(8, dog);
        }
 
        String parrot = entity.getParrot();
        if (parrot != null) {
            stmt.bindString(9, parrot);
        }
 
        String cavy = entity.getCavy();
        if (cavy != null) {
            stmt.bindString(10, cavy);
        }
 
        String hamster = entity.getHamster();
        if (hamster != null) {
            stmt.bindString(11, hamster);
        }
 
        String squirrel = entity.getSquirrel();
        if (squirrel != null) {
            stmt.bindString(12, squirrel);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(13, phone);
        }
 
        String adres = entity.getAdres();
        if (adres != null) {
            stmt.bindString(14, adres);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(15, gender);
        }
 
        String birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindString(16, birthday);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(17, date);
        }
 
        String by_user = entity.getBy_user();
        if (by_user != null) {
            stmt.bindString(18, by_user);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(1, email);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String name1 = entity.getName1();
        if (name1 != null) {
            stmt.bindString(3, name1);
        }
 
        String hobby = entity.getHobby();
        if (hobby != null) {
            stmt.bindString(4, hobby);
        }
 
        String surname1 = entity.getSurname1();
        if (surname1 != null) {
            stmt.bindString(5, surname1);
        }
 
        String fathername1 = entity.getFathername1();
        if (fathername1 != null) {
            stmt.bindString(6, fathername1);
        }
 
        String cat = entity.getCat();
        if (cat != null) {
            stmt.bindString(7, cat);
        }
 
        String dog = entity.getDog();
        if (dog != null) {
            stmt.bindString(8, dog);
        }
 
        String parrot = entity.getParrot();
        if (parrot != null) {
            stmt.bindString(9, parrot);
        }
 
        String cavy = entity.getCavy();
        if (cavy != null) {
            stmt.bindString(10, cavy);
        }
 
        String hamster = entity.getHamster();
        if (hamster != null) {
            stmt.bindString(11, hamster);
        }
 
        String squirrel = entity.getSquirrel();
        if (squirrel != null) {
            stmt.bindString(12, squirrel);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(13, phone);
        }
 
        String adres = entity.getAdres();
        if (adres != null) {
            stmt.bindString(14, adres);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(15, gender);
        }
 
        String birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindString(16, birthday);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(17, date);
        }
 
        String by_user = entity.getBy_user();
        if (by_user != null) {
            stmt.bindString(18, by_user);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // email
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name1
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // hobby
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // surname1
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fathername1
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cat
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // dog
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // parrot
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // cavy
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // hamster
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // squirrel
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // phone
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // adres
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // gender
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // birthday
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // date
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17) // by_user
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setEmail(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName1(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setHobby(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSurname1(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFathername1(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCat(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDog(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setParrot(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setCavy(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setHamster(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSquirrel(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setPhone(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setAdres(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setGender(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setBirthday(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setDate(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setBy_user(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(User entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(User entity) {
        return null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
