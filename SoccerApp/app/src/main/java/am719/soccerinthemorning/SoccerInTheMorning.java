package am719.soccerinthemorning;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;


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
        int imagePath = R.drawable.chicago;
        setTeamScreen(view, "Chicago Fire", imagePath);

    }

    public void colorado(View view) {
        int imagePath = R.drawable.colorado;
        setTeamScreen(view, "Colorado Rapids", imagePath);
    }

    public void columbus(View view) {
        int imagePath = R.drawable.columbus;
        setTeamScreen(view, "Columbus Crew SC", imagePath);
    }

    public void dc(View view) {
        int imagePath = R.drawable.dc;
        setTeamScreen(view, "DC United", imagePath);
    }

    public void dallas(View view) {
        int imagePath = R.drawable.dallas;
        setTeamScreen(view, "FC Dallas", imagePath);
    }

    public void houston(View view) {
        int imagePath = R.drawable.houston;
        setTeamScreen(view, "Houston Dynamo", imagePath);
    }

    public void losAngeles(View view) {
        int imagePath = R.drawable.los_angeles;
        setTeamScreen(view, "L.A. Galaxy", imagePath);
    }

    public void montreal(View view) {
        int imagePath = R.drawable.montreal;
        setTeamScreen(view, "Montreal Impact", imagePath);
    }

    public void newEngland(View view) {
        int imagePath = R.drawable.new_england;
        setTeamScreen(view, "New England Revolution", imagePath);
    }

    public void newYorkCity(View view) {
        int imagePath = R.drawable.new_york_city;
        setTeamScreen(view, "New York City FC", imagePath);
    }

    public void newYork(View view) {
        int imagePath = R.drawable.new_york;
        setTeamScreen(view, "New York Red Bulls", imagePath);
    }

    public void orlando(View view) {
        int imagePath = R.drawable.orlando;
        setTeamScreen(view, "Orlando City SC", imagePath);
    }

    public void philadelphia(View view) {
        int imagePath = R.drawable.philadelphia;
        setTeamScreen(view, "Philadelphia Union", imagePath);
    }

    public void portland(View view) {
        int imagePath = R.drawable.portland;
        setTeamScreen(view, "Portland Timbers", imagePath);
    }

    public void saltLake(View view) {
        int imagePath = R.drawable.salt_lake;
        setTeamScreen(view, "Real Salt Lake", imagePath);
    }

    public void sanJose(View view) {
        int imagePath = R.drawable.san_jose;
        setTeamScreen(view, "San Jose Earthquakes", imagePath);
    }

    public void seattle(View view) {
        int imagePath = R.drawable.seattle;
        setTeamScreen(view, "Seattle Sounders FC", imagePath);
    }

    public void kansasCity(View view) {
        int imagePath = R.drawable.kansas_city;
        setTeamScreen(view, "Sporting Kansas City", imagePath);
    }

    public void toronto(View view) {
        int imagePath = R.drawable.toronto;
        setTeamScreen(view, "Toronto FC", imagePath);
    }

    public void vancouver(View view) {
        int imagePath = R.drawable.vancouver;
        setTeamScreen(view, "Vancouver Whitecaps FC", imagePath);
    }

    public void setTeamScreen(View view, String teamName, int imagePath) {
        setContentView(R.layout.team_info);
        TextView team;
        team = new TextView(this);
        team = (TextView)findViewById(R.id.teamNameView);
        team.setText(teamName);
        ImageView logo= (ImageView) findViewById(R.id.logoView);
        logo.setImageResource(imagePath);
    }

    ////////////////////////////////////////////////////////
    //DO YOUR WORK HERE







    ////////////////////////////////////////////////////////

}
