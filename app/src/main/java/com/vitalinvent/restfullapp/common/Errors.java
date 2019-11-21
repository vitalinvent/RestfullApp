package com.vitalinvent.restfullapp.common;

import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Errors extends AppCompatActivity {

    public static void ShowSend(Exception ex) {
        try {
            String message = "";
            message += ex.getMessage().toUpperCase()+"\n\n";
            int idx =0;
            for (StackTraceElement trase:ex.getStackTrace())
            {
                String[] tracers=trase.toString().split("\\(");
                if (tracers.length>0)
                    message+=tracers[1].replace(")","").replace(";","")+";\n";
                idx ++;
                if (idx >5) break;
            }
            Log.d(Variables.PACKAGE_NAME,ex.getStackTrace().toString());
            ShowToast(message);
        } catch (Exception exception) {}
    }

    public static void ShowSend(Exception ex,String message) {
        try {
            Log.d(Variables.PACKAGE_NAME,ex.getStackTrace().toString());
            Log.d(Variables.PACKAGE_NAME,message);
            ShowToast(message);
        } catch (Exception exception) {}
    }

    public static void ShowToast(String message){
        Toast.makeText(Utils.getContext(),message,Toast.LENGTH_LONG).show();
    }
}
