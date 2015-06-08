package com.eftimoff.empty;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mobilesolutions.lolapi.LolApi;
import com.mobilesolutions.lolapi.models.Champion;
import com.mobilesolutions.lolapi.models.Champions;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rx.Observable;


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
                LolApi.getChampionById(104, new Callback<Champion>() {
                    @Override
                    public void success(Champion champion, Response response) {
                        toast("SIZE : " + champion.isFreeToPlay());
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        toast("ERROR : " + error.getMessage());
                    }
                });
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
