package ali568.buckeyemail.osu.app1;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sadaqat on 3/12/18.
 */

public class RegisterRequest extends StringRequest {

    /**
     * STILLLL UNDER CONSTRUCTION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */
    private static final String REGISTER_REQUEST_URL = "sadaqat12.000webhostapp.com/Register2.php";
    private Map<String, String> params;

    public RegisterRequest(String firstname, String lastname, String username, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("firstname", firstname);
        params.put("lastname", lastname);
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
