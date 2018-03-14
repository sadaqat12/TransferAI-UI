package ali568.buckeyemail.osu.app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sadaqat on 3/09/18.
 */

public class ListsActivity extends AppCompatActivity {

    // declaring variables
    private ListView lvContacts;
    private ContactAdapter adapter;
    private static List<Contact> listOfContacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        // creates a list view variable and connects it to the listview in the xml
        lvContacts = (ListView) findViewById(R.id.listsContacts);
        listOfContacts = new ArrayList<>();

        // this is where you can add a new contact
        addContact("ch.sadaqat1@yahoo.com");

        // setting the adapter
        adapter = new ContactAdapter(ListsActivity.this, listOfContacts);
        lvContacts.setAdapter(adapter);


    }

    public static void addContact(String contact) {
        listOfContacts.add(new Contact(contact));
    }

}
