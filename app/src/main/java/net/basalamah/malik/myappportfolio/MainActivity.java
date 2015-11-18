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
    private Toast mAppToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        context = getApplicationContext();
        title = (TextView)findViewById(R.id.text_view_title);
        spotifyStreamer = (Button)findViewById(R.id.first_app_button);
        scoresApp = (Button)findViewById(R.id.second_app_button);
        libraryApp = (Button)findViewById(R.id.third_app_button);
        buildItBigger = (Button)findViewById(R.id.forth_app_button);
        xyzReader = (Button)findViewById(R.id.fifth_app_button);
        capstone = (Button)findViewById(R.id.sixth_app_button);
    }

    public void buttonOnClick(View view)
    {
        switch(view.getId())
        {
            case R.id.first_app_button:
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this,context.getResources().getString(R.string.string_on_toast)+context.getResources().getString(R.string.first_app),Toast.LENGTH_SHORT);
                mAppToast.show();
                break;

            case R.id.second_app_button:
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this,context.getResources().getString(R.string.string_on_toast)+context.getResources().getString(R.string.second_app),Toast.LENGTH_SHORT);
                mAppToast.show();
                break;

            case R.id.third_app_button:
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this,context.getResources().getString(R.string.string_on_toast)+context.getResources().getString(R.string.third_app),Toast.LENGTH_SHORT);
                mAppToast.show();
                break;

            case R.id.forth_app_button:
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this,context.getResources().getString(R.string.string_on_toast)+context.getResources().getString(R.string.forth_app),Toast.LENGTH_SHORT);
                mAppToast.show();
                break;

            case R.id.fifth_app_button:
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this,context.getResources().getString(R.string.string_on_toast)+context.getResources().getString(R.string.fifth_app),Toast.LENGTH_SHORT);
                mAppToast.show();
                break;

            case R.id.sixth_app_button:
                if(mAppToast !=null){
                    mAppToast.cancel();
                }
                mAppToast = Toast.makeText(this,context.getResources().getString(R.string.string_on_toast)+context.getResources().getString(R.string.sixth_app),Toast.LENGTH_SHORT);
                mAppToast.show();
                break;
        }
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
