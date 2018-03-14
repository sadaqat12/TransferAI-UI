package ali568.buckeyemail.osu.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by sadaqat on 3/08/18.
 */
public class LoginActivity extends AppCompatActivity {

    /**
        STILL UNDER CONSTRUCTION!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText loginEmail = (EditText) findViewById(R.id.loginEmail);
        final EditText loginPassword = (EditText) findViewById(R.id.loginPassword);
        Button signInButton = (Button) findViewById(R.id.signInButton);
        Button toRegisterButton = (Button) findViewById(R.id.toRegisterButton);

//        final String emailRegistered = RegisterActivity.returnEmail();
  //      final String passwordRegistered = RegisterActivity.returnPassword();
            signInButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String enteredEmail = loginEmail.getText().toString();
                    String enteredPassword = loginPassword.getText().toString();
//enteredEmail.equals(emailRegistered) && enteredPassword.equals(passwordRegistered)
                    if(true) {
                        Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                        LoginActivity.this.startActivity(loginIntent);
                    }
                    else{
                        Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            });


        toRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
