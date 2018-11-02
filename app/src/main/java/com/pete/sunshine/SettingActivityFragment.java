package com.pete.sunshine;

/**
 * Created by Pete on 11/5/2015.
 */



import android.os.Bundle;
import android.preference.PreferenceFragment;


/**
 * A placeholder fragment containing a simple view.
 */
public class SettingActivityFragment extends PreferenceFragment {

    public SettingActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preference);

    }
}

