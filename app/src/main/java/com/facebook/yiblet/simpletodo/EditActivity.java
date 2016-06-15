package com.facebook.yiblet.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {
    String text;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        text = getIntent().getExtras().getString("text");
        position = getIntent().getExtras().getInt("position");
        EditText changeText = (EditText) findViewById(R.id.changeText);
        changeText.setHint(text);
    }

    protected void onSubmit(View v){
        EditText changeText = (EditText) findViewById(R.id.changeText);
        text = changeText.getText().toString();
        Intent data = new Intent();
        data.putExtra("text", text);
        data.putExtra("position", position);
        setResult(200, data);
        finish();
    }
}
