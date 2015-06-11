package com.eftimoff.empty;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mobilesolutions.lolapi.LolApi;
import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.ItemDto;
import com.mobilesolutions.lolapi.models.statics.ItemListDto;
import com.mobilesolutions.lolapi.models.statics.LanguageStringsDto;
import com.mobilesolutions.lolapi.models.statics.enums.ChampDataEnum;
import com.mobilesolutions.lolapi.models.statics.enums.ItemListEnum;
import com.mobilesolutions.lolapi.utls.Constants;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View viewById = findViewById(R.id.button);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LolApi.setRegion("eune");
            }
        });
    }

    private void toast(final String message) {
        log(message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void log(final String message) {
        Log.i("MAIN", message);
    }

}
