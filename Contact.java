package ali568.buckeyemail.osu.app1;

/**
 * Created by sadaqat on 3/13/18.
 */

public class Contact {
    private String contact;

    // contructor class sets local contact variable to the one passed in
    public Contact(String contactEmail){
        this.contact = contactEmail;
    }

    // a getter method to allow you to get the contact value back
    public String getContact() {
        return contact;
    }

    // a setter method to allow you to set the contact value to a new value
    public void setContact(String contact) {
        this.contact = contact;
    }
}
