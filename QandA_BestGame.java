package com.ARashad96.androidbeginnerdeveloperkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QandA_BestGame extends AppCompatActivity {
    Button github;
    Button info;
    Button check;
    RadioGroup radiogroup;
    RadioButton choosengame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_qand_a__game);

        radiogroup = findViewById(R.id.radiogroup);
        check = findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected = radiogroup.getCheckedRadioButtonId();
                choosengame = findViewById(selected);
                String game = "";
                try {
                    game = choosengame.getText().toString();
                }catch (Exception e){
                }
                Log.i("check", game);
                if (game.equals("Apex Legends")) {
                    Toast.makeText(QandA_BestGame.this, "Its a good game TBH but not yet the best", Toast.LENGTH_SHORT).show();
                }else if (game.equals("Fortnite")){
                    Toast.makeText(QandA_BestGame.this, "No way", Toast.LENGTH_SHORT).show();
                }else if (game.equals("PUBG")){
                    Toast.makeText(QandA_BestGame.this, "It did had a good run in the past", Toast.LENGTH_SHORT).show();
                }else if (game.equals("Minecraft")){
                    Toast.makeText(QandA_BestGame.this, "Took you so long OF COURSE this is the best game ever", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(QandA_BestGame.this, "You need to choose an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
        github = findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ARashad96/Q-A-using-radiobuttons"));
                startActivity(intent);
            }
        });
        info = findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(QandA_BestGame.this)
                        .setIcon(R.drawable.profile)
                        .setTitle("App info")
                        .setMessage("This app is showing how to create a multiple choice questions using radiobuttons, textview, toast, buttons, and linearlayout.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .show();
            }
        });
    }
}
