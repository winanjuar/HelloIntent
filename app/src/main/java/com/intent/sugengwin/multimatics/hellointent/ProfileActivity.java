package com.intent.sugengwin.multimatics.hellointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvName;
    private String receivedName = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = (TextView) findViewById(R.id.tv_name);
        receivedName = getIntent().getStringExtra("name");
        String text = "Nama yang dikirim adalah : <b>"+receivedName+"</b>";
        tvName.setText(Html.fromHtml(text));

    }
}
