package am719.soccerinthemorning;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
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
        setTeamScreen(view, "Chicago Fire", imagePath, "Eastern", "Frank Yallop", "6-18-10", "15th");

    }

    public void colorado(View view) {
        int imagePath = R.drawable.colorado;
        setTeamScreen(view, "Colorado Rapids", imagePath, "Western", "Pablo Mastroeni", "8-18-8", "17th");
    }

    public void columbus(View view) {
        int imagePath = R.drawable.columbus;
        setTeamScreen(view, "Columbus Crew SC", imagePath, "Eastern", "Gregg Berhalter", "14-10-10", "7th");
    }

    public void dc(View view) {
        int imagePath = R.drawable.dc;
        setTeamScreen(view, "DC United", imagePath, "Eastern", "Ben Olsen", "17-9-8", "3rd");
    }

    public void dallas(View view) {
        int imagePath = R.drawable.dallas;
        setTeamScreen(view, "FC Dallas", imagePath, "Western", "Oscar Pareja", "16-12-6", "6th");
    }

    public void houston(View view) {
        int imagePath = R.drawable.houston;
        setTeamScreen(view, "Houston Dynamo", imagePath, "Western", "Owen Coyle", "11-17-6", "9th");
    }

    public void losAngeles(View view) {
        int imagePath = R.drawable.los_angeles;
        setTeamScreen(view, "L.A. Galaxy", imagePath, "Western", "Bruce Arena", "17-7-10", "2nd");
    }

    public void montreal(View view) {
        int imagePath = R.drawable.montreal;
        setTeamScreen(view, "Montreal Impact", imagePath, "Eastern", "Frank Klopas", "6-18-10", "19th");
    }

    public void newEngland(View view) {
        int imagePath = R.drawable.new_england;
        setTeamScreen(view, "New England Revolution", imagePath, "Eastern", "Jay Heaps", "17-13-4", "5th");
    }

    public void newYorkCity(View view) {
        int imagePath = R.drawable.new_york_city;
        setTeamScreen(view, "New York City FC", imagePath, "Eastern", "Jason Kreis", "N/A", "N/A");
    }

    public void newYork(View view) {
        int imagePath = R.drawable.new_york;
        setTeamScreen(view, "New York Red Bulls", imagePath, "Eastern", "Jesse Marsch", "13-10-11", "8th");
    }

    public void orlando(View view) {
        int imagePath = R.drawable.orlando;
        setTeamScreen(view, "Orlando City SC", imagePath, "Eastern", "Adrian Health", "N/A", "N/A");
    }

    public void philadelphia(View view) {
        int imagePath = R.drawable.philadelphia;
        setTeamScreen(view, "Philadelphia Union", imagePath, "Eastern", "Jim Curtin", "12-9-13", "12th");
    }

    public void portland(View view) {
        int imagePath = R.drawable.portland;
        setTeamScreen(view, "Portland Timbers", imagePath, "Western", "Caleb Porter", "12-9-13", "11th");
    }

    public void saltLake(View view) {
        int imagePath = R.drawable.salt_lake;
        setTeamScreen(view, "Real Salt Lake", imagePath, "Western", "Jeff Cassar", "15-8-11", "4th");
    }

    public void sanJose(View view) {
        int imagePath = R.drawable.san_jose;
        setTeamScreen(view, "San Jose Earthquakes", imagePath, "Western", "Dominic Kinnear", "6-16-12", "18th");
    }

    public void seattle(View view) {
        int imagePath = R.drawable.seattle;
        setTeamScreen(view, "Seattle Sounders FC", imagePath, "Western", "Sigi Schmid", "20-10-4", "1st");
    }

    public void kansasCity(View view) {
        int imagePath = R.drawable.kansas_city;
        setTeamScreen(view, "Sporting Kansas City", imagePath, "Western", "Peter Vermes", "14-13-7", "10th");
    }

    public void toronto(View view) {
        int imagePath = R.drawable.toronto;
        setTeamScreen(view, "Toronto FC", imagePath, "Eastern", "Greg Vanney", "11-15-8", "12th");
    }

    public void vancouver(View view) {
        int imagePath = R.drawable.vancouver;
        setTeamScreen(view, "Vancouver Whitecaps FC", imagePath, "Western", "Carl Robinson", "12-8-14", "9th");
    }

    public void setTeamScreen(View view, String teamName, int imagePath, String conference, String coach, String record, String standing) {
        setContentView(R.layout.team_info);

        TextView team;
        team = new TextView(this);
        team = (TextView)findViewById(R.id.teamNameView);
        team.setText(teamName);

        ImageView logo= (ImageView) findViewById(R.id.logoView);
        logo.setImageResource(imagePath);

        EditText conferenceLabel;
        conferenceLabel = new EditText(this);
        conferenceLabel = (EditText)findViewById(R.id.editText5);
        conferenceLabel.setText(conference);

        EditText coachLabel;
        coachLabel = new EditText(this);
        coachLabel = (EditText)findViewById(R.id.editText6);
        coachLabel.setText(coach);

        EditText recordLabel;
        recordLabel = new EditText(this);
        recordLabel = (EditText)findViewById(R.id.editText8);
        recordLabel.setText(record);

        EditText standingLabel;
        standingLabel = new EditText(this);
        standingLabel = (EditText)findViewById(R.id.editText7);
        standingLabel.setText(standing);

    }

    public void goBackToTournamentScreen(View view) {
        setContentView(R.layout.tournament_screen);
    }

}
