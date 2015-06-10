package com.eftimoff.empty;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mobilesolutions.lolapi.LolApi;
import com.mobilesolutions.lolapi.models.summoner.MasteryPagesDto;
import com.mobilesolutions.lolapi.models.summoner.RunePagesDto;
import com.mobilesolutions.lolapi.models.summoner.SummonerDto;
import com.mobilesolutions.lolapi.models.team.TeamDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View viewById = findViewById(R.id.button);
        final List<String> list = new ArrayList<>();
        list.add("TEAM-2b1cb220-c6a2-11e4-9c2b-782bcb46f3e4");
        list.add("TEAM-6f84de70-f194-11e4-9c2b-782bcb46f3e4");
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LolApi.setRegion("eune");
                LolApi.getTeamsByTeamIds(list, new Callback<Map<String, TeamDto>>() {
                    @Override
                    public void success(Map<String, TeamDto> stringSummonerDtoMap, Response response) {

                    }

                    @Override
                    public void failure(RetrofitError error) {

                    }
                });
            }
        });
        //summoner ids - 49592987 ,29068821
//Teaam ids  = TEAM-2b1cb220-c6a2-11e4-9c2b-782bcb46f3e4 ,TEAM-6f84de70-f194-11e4-9c2b-782bcb46f3e4
    }

    private void toast(final String message) {
        log(message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void log(final String message) {
        Log.i("MAIN", message);
    }

}
