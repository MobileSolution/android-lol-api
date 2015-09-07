package com.eftimoff.empty;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mobilesolutions.lolapi.LolApi;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.matchhistory.MatchSummary;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellListDto;
import com.mobilesolutions.lolapi.models.statics.enums.SeasonEnum;
import com.mobilesolutions.lolapi.models.stats.PlayerStatsSummaryDto;
import com.mobilesolutions.lolapi.models.stats.PlayerStatsSummaryListDto;
import com.mobilesolutions.lolapi.models.stats.RankedStatsDto;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends ActionBarActivity {
    MatchSummary matchHistory = new MatchSummary();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View viewById = findViewById(R.id.button);

        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LolApi.setRegion("eune");
                LolApi.getVersions(new Callback<String[]>() {
                    @Override
                    public void success(String[] summonerSpellListDto, Response response) {
                        Log.d("SPELL LIST SIZE ", "" + summonerSpellListDto.length);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d("ERROR ", "" + error);
                    }
                });

                LolApi.getChampions(new Callback<ChampionListDto>() {
                    @Override
                    public void success(ChampionListDto championListDto, Response response) {
                        Log.d("Champions LIST SIZE ", "" + championListDto.getChampions().size());
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d("ERROR ", "" + error);
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
