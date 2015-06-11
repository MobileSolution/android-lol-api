package com.eftimoff.empty;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mobilesolutions.lolapi.LolApi;
import com.mobilesolutions.lolapi.models.league.LeagueDto;
import com.mobilesolutions.lolapi.models.league.enums.QueueEnum;
import com.mobilesolutions.lolapi.models.matchhistory.Match;
import com.mobilesolutions.lolapi.models.matchhistory.MatchSummary;

import java.util.List;

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
                LolApi.getMasterLeague(QueueEnum.RANKED_TEAM_3x3,new Callback<LeagueDto>() {
                    @Override
                    public void success(LeagueDto leagueDto, Response response) {

                    }

                    @Override
                    public void failure(RetrofitError error) {

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
