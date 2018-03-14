package ali568.buckeyemail.osu.app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by sadaqat on 3/11/18.
 */

public class TrainActivity extends AppCompatActivity {

    // declaration of variables
    private ListView lvEmails;
    private EmailsAdapter adapter;
    private List<Emails> listOfEmails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        // connecting variable to xml
        lvEmails = (ListView) findViewById(R.id.recentEmailsExpandable);

        // setting up arraylist
        listOfEmails = new ArrayList<>();

        // where we can add emails
        listOfEmails.add(new Emails("ch.sadaqat1@yahoo.com", "01/01/1990",
                "Math", "Hello I love math!"));
        listOfEmails.add(new Emails("ch.sadaqat1", "01/01/1991",
                "Science", "Hello I love science!"));
        listOfEmails.add(new Emails("ch.sadaqat1@yahoo.com", "Date: 01/01/1992",
                "SS", "Hello I love SS!"));
        listOfEmails.add(new Emails("ch.sadaqat1@yahoo.com", "01/01/1993",
                "English", "Hello I hate English"));
        listOfEmails.add(new Emails("ch.sadaqat1@yahoo.com", "01/01/1994",
                "History", "Hello I love History!"));
        listOfEmails.add(new Emails("ch.sadaqat1@yahoo.com", "01/01/1995",
                "Math", "Hello this is math!"));



        // setting up of adapters
        adapter = new EmailsAdapter(TrainActivity.this, listOfEmails);
        lvEmails.setAdapter(adapter);

        // when an item  is clicked makes a toast
        /**
         * NEED TO SOMEHOW CONNECT THIS WITH LISTS ACTIVITY TO ADD NEW CONTACTS!!!!!
         */
        lvEmails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(TrainActivity.this,"Contact " + listOfEmails.get(i).getFrom() + "Added", Toast.LENGTH_SHORT).show();

            }
        });


    }

}