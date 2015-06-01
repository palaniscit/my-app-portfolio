package com.example.palaniyappan.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class AppPortfolio extends ActionBarActivity {

    private final static String TAG = "AppPortfolio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_portfolio, menu);
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

    public void openSpotifyStreamer(View view) {
        Log.i(TAG, "Spotify streamer button clicked!");
        // Display TOAST
        showToast(getString(R.string.toast_text_spotify_streamer));
    }

    public void openScoresApp(View view) {
        Log.i(TAG, "Spotify streamer button clicked!");
        // Display TOAST
        showToast(getString(R.string.toast_text_scores_app));
    }

    public void openLibraryApp(View view) {
        Log.i(TAG, "Spotify streamer button clicked!");
        // Display TOAST
        showToast(getString(R.string.toast_text_library_app));
    }

    public void openBuildItBigger(View view) {
        Log.i(TAG, "Spotify streamer button clicked!");
        // Display TOAST
        showToast(getString(R.string.toast_text_build_it_bigger));
    }

    public void openXYZReader(View view) {
        Log.i(TAG, "Spotify streamer button clicked!");
        // Display TOAST
        showToast(getString(R.string.toast_text_xyz_reader));
    }

    public void openCapstoneProject(View view) {
        Log.i(TAG, "Spotify streamer button clicked!");
        // Display TOAST
        showToast(getString(R.string.toast_text_capstone));
    }

    private void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
