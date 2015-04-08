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
        setTeamScreen(view, "Chicago Fire", imagePath, "Eastern", "Frank Yallop", "Record", "15th");

    }

    public void colorado(View view) {
        int imagePath = R.drawable.colorado;
        setTeamScreen(view, "Colorado Rapids", imagePath, "Western", "Pablo Mastroeni", "Record", "17th");
    }

    public void columbus(View view) {
        int imagePath = R.drawable.columbus;
        setTeamScreen(view, "Columbus Crew SC", imagePath, "Eastern", "Gregg Berhalter", "Record", "7th");
    }

    public void dc(View view) {
        int imagePath = R.drawable.dc;
        setTeamScreen(view, "DC United", imagePath, "Eastern", "Ben Olsen", "Record", "3rd");
    }

    public void dallas(View view) {
        int imagePath = R.drawable.dallas;
        setTeamScreen(view, "FC Dallas", imagePath, "Western", "Oscar Pareja", "Record", "6th");
    }

    public void houston(View view) {
        int imagePath = R.drawable.houston;
        setTeamScreen(view, "Houston Dynamo", imagePath, "Western", "Owen Coyle", "Record", "9th");
    }

    public void losAngeles(View view) {
        int imagePath = R.drawable.los_angeles;
        setTeamScreen(view, "L.A. Galaxy", imagePath, "Western", "Bruce Arena", "Record", "2nd");
    }

    public void montreal(View view) {
        int imagePath = R.drawable.montreal;
        setTeamScreen(view, "Montreal Impact", imagePath, "Eastern", "Frank Klopas", "Record", "19th");
    }

    public void newEngland(View view) {
        int imagePath = R.drawable.new_england;
        setTeamScreen(view, "New England Revolution", imagePath, "Eastern", "Jay Heaps", "Record", "5th");
    }

    public void newYorkCity(View view) {
        int imagePath = R.drawable.new_york_city;
        setTeamScreen(view, "New York City FC", imagePath, "Eastern", "Jason Kreis", "Record", "N/A");
    }

    public void newYork(View view) {
        int imagePath = R.drawable.new_york;
        setTeamScreen(view, "New York Red Bulls", imagePath, "Eastern", "Jesse Marsch", "Record", "8th");
    }

    public void orlando(View view) {
        int imagePath = R.drawable.orlando;
        setTeamScreen(view, "Orlando City SC", imagePath, "Eastern", "Adrian Health", "Record", "N/A");
    }

    public void philadelphia(View view) {
        int imagePath = R.drawable.philadelphia;
        setTeamScreen(view, "Philadelphia Union", imagePath, "Eastern", "Jim Curtin", "Record", "12th");
    }

    public void portland(View view) {
        int imagePath = R.drawable.portland;
        setTeamScreen(view, "Portland Timbers", imagePath, "Western", "Caleb Porter", "Record", "11th");
    }

    public void saltLake(View view) {
        int imagePath = R.drawable.salt_lake;
        setTeamScreen(view, "Real Salt Lake", imagePath, "Western", "Jeff Cassar", "Record", "4th");
    }

    public void sanJose(View view) {
        int imagePath = R.drawable.san_jose;
        setTeamScreen(view, "San Jose Earthquakes", imagePath, "Western", "Dominic Kinnear", "Record", "18th");
    }

    public void seattle(View view) {
        int imagePath = R.drawable.seattle;
        setTeamScreen(view, "Seattle Sounders FC", imagePath, "Western", "Sigi Schmid", "Record", "1st");
    }

    public void kansasCity(View view) {
        int imagePath = R.drawable.kansas_city;
        setTeamScreen(view, "Sporting Kansas City", imagePath, "Western", "Peter Vermes", "Record", "10th");
    }

    public void toronto(View view) {
        int imagePath = R.drawable.toronto;
        setTeamScreen(view, "Toronto FC", imagePath, "Eastern", "Greg Vanney", "Record", "12th");
    }

    public void vancouver(View view) {
        int imagePath = R.drawable.vancouver;
        setTeamScreen(view, "Vancouver Whitecaps FC", imagePath, "Western", "Carl Robinson", "Record", "9th");
    }

    public void setTeamScreen(View view, String teamName, int imagePath, String division, String coach, String record, String standing) {
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
