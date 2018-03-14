package ali568.buckeyemail.osu.app1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sadaqat on 3/13/18.
 */

public class ContactAdapter extends BaseAdapter {

    // creates two local variables context and a list
    private Context mContext;
    private List<Contact> listOfContacts;

    // constructor method
    public ContactAdapter(Context mContext, List<Contact> listOfContacts){
        this.mContext = mContext;
        this.listOfContacts = listOfContacts;
    }

    // returns the size or length of the list
    @Override
    public int getCount() {
        return listOfContacts.size();
    }

    // returns the specific contact at the specified integer
    @Override
    public Object getItem(int i) {
        return listOfContacts.get(i);
    }

    // returns the id
    @Override
    public long getItemId(int i) {
        return i;
    }

    // this is the part that connects the view to the data, creates a view using the layout,
    // and then populates the textview with the contact at that position
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.contactlayout,null);
        TextView contact = (TextView)v.findViewById(R.id.contact);
        contact.setText(listOfContacts.get(i).getContact());
        v.setTag(listOfContacts.get(i).getContact());
        return v;
    }
}
