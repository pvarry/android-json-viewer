package com.paulvarry.jsonviewer;

import android.os.Bundle;
import android.view.View;

import com.paulvarry.jsonviewer.JsonViewer;

import org.json.JSONException;
import org.json.JSONObject;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private JsonViewer jsonViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = "{\"id\":1,\"name\":\"Title\",\"is\":true,\"value\":null,\"array\":[{\"item\":1,\"name\":\"One\"},{\"item\":2,\"name\":\"Two\"}],\"object\":{\"id\":1,\"name\":\"Title\"},\"simple_array\":[1,2,3]}";


        jsonViewer = findViewById(R.id.jsonViewer);
        try {
            jsonViewer.setJson(new JSONObject(json));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void onClickCollapse(View view) {
        jsonViewer.collapseJson();
    }

    public void onClickExpend(View view) {
        jsonViewer.expandJson();
    }
}
