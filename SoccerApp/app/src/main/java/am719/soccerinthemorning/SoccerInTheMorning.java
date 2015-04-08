package am719.soccerinthemorning;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


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
        setTeamScreen(view, "Chicago Fire");
    }

    public void colorado(View view) {
        setTeamScreen(view, "Colorado Rapids");
    }

    public void columbus(View view) {
        setTeamScreen(view, "Columbus Crew SC");
    }

    public void dc(View view) {
        setTeamScreen(view, "DC United");
    }

    public void dallas(View view) {
        setTeamScreen(view, "FC Dallas");
    }

    public void houston(View view) {
        setTeamScreen(view, "Houston Dynamo");
    }

    public void losAngeles(View view) {
        setTeamScreen(view, "L.A. Galaxy");
    }

    public void montreal(View view) {
        setTeamScreen(view, "Montreal Impact");
    }

    public void newEngland(View view) {
        setTeamScreen(view, "New England Revolution");
    }

    public void newYorkCity(View view) {
        setTeamScreen(view, "New York City FC");
    }

    public void newYork(View view) {
        setTeamScreen(view, "New York Red Bulls");
    }

    public void orlando(View view) {
        setTeamScreen(view, "Orlando City SC");
    }

    public void philadelphia(View view) {
        setTeamScreen(view, "Philadelphia Union");
    }

    public void portland(View view) {
        setTeamScreen(view, "Portland Timbers");
    }

    public void saltLake(View view) {
        setTeamScreen(view, "Real Salt Lake");
    }

    public void sanJose(View view) {
        setTeamScreen(view, "San Jose Earthquakes");
    }

    public void seattle(View view) {
        setTeamScreen(view, "Seattle Sounders FC");
    }

    public void kansasCity(View view) {
        setTeamScreen(view, "Sporting Kansas City");
    }

    public void toronto(View view) {
        setTeamScreen(view, "Toronto FC");
    }

    public void vancouver(View view) {
        setTeamScreen(view, "Vancouver Whitecaps FC");
    }

    public void setTeamScreen(View view, String teamName) {
        setContentView(R.layout.team_info);
        TextView team;
        team = new TextView(this);
        team = (TextView)findViewById(R.id.teamNameView);
        team.setText(teamName);
    }

}
