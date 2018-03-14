package ali568.buckeyemail.osu.app1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sadaqat on 3/12/18.
 */

public class EmailsAdapter extends BaseAdapter {

    // declaring variables
    private Context mContext;
    private List<Emails> listOfEmails;

    // constructor method
    public EmailsAdapter(Context mContext, List<Emails> listOfEmails) {
        this.mContext = mContext;
        this.listOfEmails = listOfEmails;
    }

    // getter and setter methods
    @Override
    public int getCount() {
        return listOfEmails.size();
    }

    @Override
    public Object getItem(int i) {
        return listOfEmails.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // this is the part that connects the view to the data, creates a view using the layout,
    // and then populates the textview with the email at that position
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.emaillayout, null);
        TextView from = (TextView)v.findViewById(R.id.from);
        TextView date = (TextView)v.findViewById(R.id.date);
        TextView subject = (TextView)v.findViewById(R.id.subject);
        TextView preview = (TextView)v.findViewById(R.id.preview);

        from.setText("From: "+ listOfEmails.get(i).getFrom());
        date.setText("Date: " + listOfEmails.get(i).getDate());
        subject.setText("Subject: " + listOfEmails.get(i).getSubject());
        preview.setText("Preview: " + listOfEmails.get(i).getPreview());

        v.setTag(listOfEmails.get(i).getFrom());
        return v;
    }
}
