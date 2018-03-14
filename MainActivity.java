package ali568.buckeyemail.osu.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by sadaqat on 3/08/18.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connects variables to buttons in xml
        Button accountButton  = (Button) findViewById(R.id.logoutButton);
        Button listsButton = (Button) findViewById(R.id.listsButton);
        Button trainButton = (Button) findViewById(R.id.trainButton);


        // sets all the buttons up as listeners, that will start said activity when clicked
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openAccount = new Intent(MainActivity.this, AccountActivity.class);
                MainActivity.this.startActivity(openAccount);
            }
        });

        listsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openLists = new Intent(MainActivity.this, ListsActivity.class);
                MainActivity.this.startActivity(openLists);
            }
        });

        trainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openTrain = new Intent(MainActivity.this, TrainActivity.class);
                MainActivity.this.startActivity(openTrain);
            }
        });
    }
}
