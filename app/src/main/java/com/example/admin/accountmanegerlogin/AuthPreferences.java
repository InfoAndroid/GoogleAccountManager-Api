package com.example.admin.accountmanegerlogin;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by admin on 31-01-2017.
 */

public class AuthPreferences {
    private static final String KEY_USER = "user";
    private static final String KEY_TOKEN = "token";

    private SharedPreferences preferences;

    public AuthPreferences(Context context) {
        preferences = context
                .getSharedPreferences("auth", Context.MODE_PRIVATE);
    }

    public String getUser() {
        return preferences.getString(KEY_USER, null);
    }

    public void setUser(String user) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_USER, user);
        editor.commit();
    }

    public String getToken() {
        return preferences.getString(KEY_TOKEN, null);
    }

    public void setToken(String password) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_TOKEN, password);
        editor.commit();
    }
}
