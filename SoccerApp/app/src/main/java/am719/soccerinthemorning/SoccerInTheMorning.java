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
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Chicago Fire");
    }

    public void colorado(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Colorado Rapids");
    }

    public void columbus(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Columbus Crew SC");

    }

    public void dc(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("DC United");
    }

    public void dallas(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("FC Dallas");
    }

    public void houston(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Houston Dynamo");
    }

    public void losAngeles(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("L.A. Galaxy");
    }

    public void montreal(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Montreal Impact");
    }

    public void newEngland(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("New England Revolution");
    }

    public void newYorkCity(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("New York City FC");
    }

    public void newYork(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("New York Red Bulls");
    }

    public void orlando(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Orlando City SC");
    }

    public void philadelphia(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Philadelphia Union");
    }

    public void portland(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Portland Timbers");
    }

    public void saltLake(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Real Salt Lake");
    }

    public void sanJose(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("San Jose Earthquakes");
    }

    public void seattle(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Seattle Sounders FC");
    }

    public void kansasCity(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Sporting Kansas City");
    }

    public void toronto(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Toronto FC");
    }

    public void vancouver(View view) {
        setContentView(R.layout.team_info);
        TextView team;
        team=new TextView(this);
        team=(TextView)findViewById(R.id.teamNameView);
        team.setText("Vancouver Whitecaps FC");
    }
}
