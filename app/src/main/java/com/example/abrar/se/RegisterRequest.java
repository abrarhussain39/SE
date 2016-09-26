package com.example.abrar.se;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by abrar on 22/09/16.
 */

public class RegisterRequest extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "http://se1.comlu.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, String password,int age, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("age", age + "");
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
