package com.vitalinvent.restfullapp.common;

import android.app.Application;
import android.content.Context;

public class Utils {

    private static Context context;

    public  static void  init(Application context) {Utils.context = context;}

    public static Context getContext() {return context;}
}
