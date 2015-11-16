package net.basalamah.malik.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView title;
    Button spotifyStreamer;
    Button scoresApp;
    Button libraryApp;
    Button buildItBigger;
    Button xyzReader;
    Button capstone;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        context = getApplicationContext();
        title = (TextView)findViewById(R.id.textView);
        spotifyStreamer = (Button)findViewById(R.id.button);
        spotifyStreamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This Button will Launch My Spotify Streamer App", Toast.LENGTH_SHORT).show();
            }
        });
        scoresApp = (Button)findViewById(R.id.button2);
        scoresApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This Button will Launch My Scores App", Toast.LENGTH_SHORT).show();

            }
        });
        libraryApp = (Button)findViewById(R.id.button3);
        libraryApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This Button will Launch My Library App", Toast.LENGTH_SHORT).show();

            }
        });
        buildItBigger = (Button)findViewById(R.id.button4);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This Button will Launch My Build It Bigger App", Toast.LENGTH_SHORT).show();

            }
        });
        xyzReader = (Button)findViewById(R.id.button5);
        xyzReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This Button will Launch My XYZ Reader App", Toast.LENGTH_SHORT).show();

            }
        });
        capstone = (Button)findViewById(R.id.button6);
        capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This Button will Launch My own App", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
