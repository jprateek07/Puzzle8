package com.example.gaurav.puzzle;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends PreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener {

    public TextView t;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screen);
       // t=(TextView)findViewById(R.id.hello11);
       // SharedPreferences s= PreferenceManager.getDefaultSharedPreferences(this);
//
//        Fragment fragment=new SettingScreen();
//        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();

    }


    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if(key.equals("switch"))
        {
            t.setVisibility(View.GONE);

        }
    }
}
