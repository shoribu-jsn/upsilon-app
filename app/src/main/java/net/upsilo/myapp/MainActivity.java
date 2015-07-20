package net.upsilo.myapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import java.util.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initializeGame();
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

    private int clickCount = 0;

    public void onClickButton(View view) {
        this.clickCount++;
        Button button = (Button)this.findViewById(R.id.button);
        button.setText("Click!! (" + this.clickCount + ")");
    }
    // Hello
    private List<String> gameText = new ArrayList<String>();
    private int[] gameButtonIds = { R.id.toggleButton1, R.id.toggleButton2, R.id.toggleButton3,
        R.id.toggleButton4, R.id.toggleButton5, R.id.toggleButton6, R.id.toggleButton7,
        R.id.toggleButton8, R.id.toggleButton9, R.id.toggleButton10, R.id.toggleButton11,
        R.id.toggleButton12, R.id.toggleButton13, R.id.toggleButton14, R.id.toggleButton15,
        R.id.toggleButton16
    };

    private void initializeGame() {
        this.gameText = Arrays.asList(new String[] { "1", "1", "2", "2", "3", "3", "4", "4",
            "5", "5", "6", "6", "7", "7", "8", "8"});
        Collections.shuffle(this.gameText);

        int index = 0;
        for (String text : this.gameText) {
            ToggleButton button = (ToggleButton)this.findViewById(this.gameButtonIds[index]);
            button.setTextOn(text);
            index++;
        }
    }
}
