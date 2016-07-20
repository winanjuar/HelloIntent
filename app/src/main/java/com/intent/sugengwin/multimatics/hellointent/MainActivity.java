package com.intent.sugengwin.multimatics.hellointent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnMoveNoData, btnMoveWithData, btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveNoData = (Button) findViewById(R.id.btn_move_with_no_data);
        if (btnMoveNoData != null) {
            btnMoveNoData.setOnClickListener(this);
        }
        btnMoveWithData = (Button) findViewById(R.id.btn_move_with_data);
        if (btnMoveWithData != null) {
            btnMoveWithData.setOnClickListener(this);
        }
        btnDial = (Button) findViewById(R.id.btn_dial);
        if (btnDial != null) {
            btnDial.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_move_with_no_data :
                intent = new Intent(MainActivity.this, HomeActivity.class);
                break;
            case R.id.btn_move_with_data :
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("name", "Sugeng D. Winanjuar");
                break;
            case R.id.btn_dial :
                String noTelp = "0811310094";
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+noTelp));
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
