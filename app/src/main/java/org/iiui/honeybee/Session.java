package org.iiui.honeybee;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Session
{
    private SharedPreferences prefs;

    public Session(Context c)
    {
        prefs = PreferenceManager.getDefaultSharedPreferences(c);
    }

    public void setUserEmail(String userEmail){
        prefs.edit().putString("useremail",userEmail).commit();
    }

    public String getUserEmail(){
        String useremail = prefs.getString("useremail","");
        return useremail;
    }

    public void setName(String name){
        prefs.edit().putString("name",name).commit();
    }

    public String getName(){
        String name = prefs.getString("name","");
        return name;
    }




}

