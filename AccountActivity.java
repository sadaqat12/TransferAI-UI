package ali568.buckeyemail.osu.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by sadaqat on 3/09/18.
 */

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        // creates two button variables and connects them to the ones in the xml
        Button logOut = (Button) findViewById(R.id.logoutButton);
        Button newEmail = (Button) findViewById(R.id.newEmailAddButton);

        // if logout is clicked it takes you back to the login screen
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logOut = new Intent(AccountActivity.this, LoginActivity.class);
                AccountActivity.this.startActivity(logOut);
            }
        });

        // if new email is clicked it takes you to registerEmail screen
        newEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerEmail = new Intent(AccountActivity.this, RegisterEmail.class);
                AccountActivity.this.startActivity(registerEmail);
            }
        });
    }


}
