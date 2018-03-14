package ali568.buckeyemail.osu.app1;

/**
 * Created by sadaqat on 3/12/18.
 */

public class Emails {

    // just declaring variables
    private String from;
    private String date;
    private String subject;
    private String preview;

    // constructor method
    public Emails(String from, String date, String subject, String preview) {
        this.from = from;
        this.date = date;
        this.subject = subject;
        this.preview = preview;
    }

    // a bunch of getter and setter methods
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
}
