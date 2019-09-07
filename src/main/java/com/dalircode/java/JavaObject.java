package com.dalircode.java;

import org.json.JSONArray;
import org.json.JSONObject;

public class JavaObject {
    public String creatingJsonString() {
        JSONArray pets = new JSONArray();
        pets.put("cat");
        pets.put("dog");
        JSONObject person = new JSONObject();
        person.put("pets", pets);
        person.put("name", "John Brown");
        person.put("age", 35);
        person.put("address", "stockholm");
        return person.toString(2);
    }
}
