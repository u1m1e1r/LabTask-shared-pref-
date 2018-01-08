package com.example.hp.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    EditText editText;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view){
        editText = (EditText) findViewById(R.id.editText);
        sp = getSharedPreferences("file",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString("key",editText.getText().toString());
        edit.commit();
    }

    public void retrieve(View view){
        editText = (EditText) findViewById(R.id.editText);
        sp = getSharedPreferences("file",Context.MODE_PRIVATE);
        editText.setText(sp.getString("key",""));
    }

    public void clear(View view){
        editText = (EditText) findViewById(R.id.editText);
        editText.setText("");
    }


}
