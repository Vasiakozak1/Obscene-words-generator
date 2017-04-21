package com.example.stupidexpressiongenerator;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton radBtnNoun;
    private RadioButton radBtnVerb;
    private RadioButton radBtnAdj;
    private Switch IsComplicated;
    private  Button BtnExit;
    private Button BtnToCreate;
    private Button AddWord;
    private List<String> Nouns;
    private List<String> Verbs;
    private List<String> Adjectives;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       InitializeVars();

    }
    public void onClick(View v)
    {

    }

    private void InitializeVars()
    {
        View.OnClickListener clicklistner = new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                RadioButton choseRadbtn = (RadioButton)v;
                int idOFchoseRandbtn = choseRadbtn.getId();
                int switchNumber=0;
                int radBtnId1 = findViewById(R.id.radBtnAdj).getId();
                int radBtnId2 = findViewById(R.id.radBtnVerb).getId();
                int radBtnId3 = findViewById(R.id.radBtnNoun).getId();
                if(radBtnId1 == idOFchoseRandbtn)
                    switchNumber = 1;
                else if(radBtnId2 == idOFchoseRandbtn)
                    switchNumber =2;
                else
                    switchNumber =3;
                switch(switchNumber)
                {
                    case 1:
                        ((RadioButton) findViewById(R.id.radBtnVerb)).setChecked(false);
                        ((RadioButton) findViewById(R.id.radBtnNoun)).setChecked(false);
                        break;
                    case 2:
                        ((RadioButton) findViewById(R.id.radBtnAdj)).setChecked(false);
                        ((RadioButton) findViewById(R.id.radBtnNoun)).setChecked(false);
                        break;
                    case 3:
                        ((RadioButton) findViewById(R.id.radBtnAdj)).setChecked(false);
                        ((RadioButton) findViewById(R.id.radBtnVerb)).setChecked(false);
                        break;
                }
            }
        };


        this.Nouns = new ArrayList<String>();
        this.Verbs = new ArrayList<String>();
        this.Adjectives = new ArrayList<String>();

        this.BtnToCreate = (Button)findViewById(R.id.buttonGenerate);
        this.BtnToCreate.setBackgroundColor(0xff7ebf7c);

        this.BtnExit = (Button) findViewById(R.id.buttonExit);
        this.BtnExit.setBackgroundColor(0xff000000);
        this.BtnExit.setTextColor(0xffffffff);

        this.IsComplicated = (Switch)findViewById(R.id.isComplicated);
        this.IsComplicated.setTextColor(0xff000000);

        this.radBtnNoun = (RadioButton)findViewById(R.id.radBtnNoun);
        this.radBtnVerb = (RadioButton)findViewById(R.id.radBtnVerb);
        this.radBtnAdj = (RadioButton)findViewById(R.id.radBtnAdj);

        this.radBtnAdj.setOnClickListener(clicklistner);
        this.radBtnVerb.setOnClickListener(clicklistner);
        this.radBtnNoun.setOnClickListener(clicklistner);

    }
}
