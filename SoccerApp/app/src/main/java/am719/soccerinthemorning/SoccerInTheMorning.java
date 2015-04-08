package am719.soccerinthemorning;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SoccerInTheMorning extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soccer_in_the_morning, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openTournamentScreen(View view) {
        setContentView(R.layout.tournament_screen);
    }

    public void chicago(View view) {
        setContentView(R.layout.team_info);
    }

    public void colorado(View view) {
        setContentView(R.layout.team_info);
    }

    public void columbus(View view) {
        setContentView(R.layout.team_info);
    }

    public void dc(View view) {
        setContentView(R.layout.team_info);
    }

    public void dallas(View view) {
        setContentView(R.layout.team_info);
    }

    public void houston(View view) {
        setContentView(R.layout.team_info);
    }

    public void losAngeles(View view) {
        setContentView(R.layout.team_info);
    }

    public void montreal(View view) {
        setContentView(R.layout.team_info);
    }

    public void newEngland(View view) {
        setContentView(R.layout.team_info);
    }

    public void newYorkCity(View view) {
        setContentView(R.layout.team_info);
    }

    public void newYork(View view) {
        setContentView(R.layout.team_info);
    }

    public void orlando(View view) {
        setContentView(R.layout.team_info);
    }

    public void philadelphia(View view) {
        setContentView(R.layout.team_info);
    }

    public void portland(View view) {
        setContentView(R.layout.team_info);
    }

    public void saltLake(View view) {
        setContentView(R.layout.team_info);
    }

    public void sanJose(View view) {
        setContentView(R.layout.team_info);
    }

    public void seattle(View view) {
        setContentView(R.layout.team_info);
    }

    public void kansasCity(View view) {
        setContentView(R.layout.team_info);
    }

    public void toronto(View view) {
        setContentView(R.layout.team_info);
    }

    public void vancouver(View view) {
        setContentView(R.layout.team_info);
    }
}
