package ali568.buckeyemail.osu.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sadaqat on 3/09/18.
 */
public class RegisterActivity extends AppCompatActivity {

    /**
     * STILL UNDER CONSTRUCTION !!!!!!!!!!!!!!!!!!!!!!!!********************************!!!!!!!
     */
    //private String firstName;
    //private String lastName;
    //private static String emailRegistered;
    //private static String passwordRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView registration = (TextView) findViewById(R.id.trustedContactsView);
        final EditText firstNameText = (EditText) findViewById(R.id.firstName);
        final EditText lastNameText = (EditText) findViewById(R.id.lastName);
        final EditText registerPassword = (EditText) findViewById(R.id.registerPassword);
        final EditText registerEmail = (EditText) findViewById(R.id.registerEmail);
        final Button registerLoginButton = (Button) findViewById(R.id.logoutButton);



        registerLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String firstName = firstNameText.getText().toString();
                final String lastName = lastNameText.getText().toString();
                final String emailRegistered = registerEmail.getText().toString();
                final String passwordRegistered = registerPassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if(success){
                                Intent goToLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(goToLogin);
                            }
                            else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Failed")
                                        .setNegativeButton("Retry",null)
                                        .create()
                                        .show();
                            }
                        }
                        catch(JSONException e){
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(firstName,lastName,emailRegistered,passwordRegistered, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
/*
registerLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final String firstName = firstNameText.getText().toString();
                final String lastName = lastNameText.getText().toString();
                emailRegistered = registerEmail.getText().toString();
                passwordRegistered = registerPassword.getText().toString();
                if(firstName.length()>0 && lastName.length()>0 && emailRegistered.length()>0 && passwordRegistered.length()>0){
                    Intent goToLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                    RegisterActivity.this.startActivity(goToLogin);
                }
                else{
                    Toast.makeText(RegisterActivity.this, "Data Missing!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public static String returnEmail(){
        return emailRegistered;
    }
    public static String returnPassword(){
        return passwordRegistered;
    }
 */
}}
