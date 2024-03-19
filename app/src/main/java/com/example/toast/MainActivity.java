package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    TextView tV1,tV2,tV3,tV4,tV5,tV6;
    EditText eT1,eT2,eT3;
    Button btn_eT1,btn_eT2,btn_eT3,reset;
    ImageView iV1,iV2,iV3;
    Random rnd = new Random();
    int rnd1,rnd2,rnd3,rnd4,correctAns = 0;
    String ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);
        tV5 = findViewById(R.id.tV5);
        tV6 = findViewById(R.id.tV6);

        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);

        btn_eT1 = findViewById(R.id.btn_eT1);
        btn_eT2 = findViewById(R.id.btn_eT2);
        btn_eT3 = findViewById(R.id.btn_eT3);

        iV1 = findViewById(R.id.iV1);
        iV2 = findViewById(R.id.iV2);
        iV3 = findViewById(R.id.iV3);

        reset = findViewById(R.id.reset);

        rnd1 = rnd.nextInt(90)+10;
        rnd2 = rnd.nextInt(90)+10;
        rnd3 = rnd.nextInt(90)+10;
        rnd4 = rnd.nextInt(90)+10;
        tV1.setText(""+rnd1);
        tV2.setText(""+rnd2);

    }


    public void pressed1(View view) {
        ans = eT1.getText().toString();
        if(!ans.isEmpty()){
            btn_eT1.setClickable(false);
            int ans1 = Integer.parseInt(ans);
            iV1.setVisibility(view.VISIBLE);
            if(rnd1 + rnd2 == ans1) {
                iV1.setImageResource(R.drawable.goodmark);
                correctAns++;
            }
            else
                iV1.setImageResource(R.drawable.badmark);
            tV3.setText(""+(rnd1 + rnd2));
            tV4.setText(""+rnd3);

            tV3.setVisibility(View.VISIBLE);
            tV4.setVisibility(View.VISIBLE);
            eT2.setVisibility(View.VISIBLE);
            btn_eT2.setVisibility(view.VISIBLE);

        }
    }

    public void pressed2(View view) {
        ans = eT2.getText().toString();
        if(!ans.isEmpty()){
            btn_eT2.setClickable(false);
            int ans2 = Integer.parseInt(ans);
            iV2.setVisibility(view.VISIBLE);
            if(rnd1 + rnd2 + rnd3 == ans2){
                iV2.setImageResource(R.drawable.goodmark);
                correctAns ++;
            }
            else
                iV2.setImageResource(R.drawable.badmark);
            tV5.setText(""+(rnd1 + rnd2 + rnd3));
            tV6.setText(""+rnd4);

            tV5.setVisibility(View.VISIBLE);
            tV6.setVisibility(View.VISIBLE);
            eT3.setVisibility(View.VISIBLE);
            btn_eT3.setVisibility(view.VISIBLE);
        }
    }

    public void pressed3(View view) {
        ans = eT3.getText().toString();
        if(!ans.isEmpty()){
            btn_eT3.setClickable(false);
            int ans3 = Integer.parseInt(ans);
            iV3.setVisibility(view.VISIBLE);
            if(rnd1 + rnd2 + rnd3 + rnd4 == ans3) {
                iV3.setImageResource(R.drawable.goodmark);
                correctAns ++;
            }
            else
                iV3.setImageResource(R.drawable.badmark);

            reset.setVisibility(view.VISIBLE);
        }
    }

    public void resetAction(View view) {
        reset.setVisibility(view.INVISIBLE);
        correctAns = 0;
        eT1.setText("");
        eT2.setText("");
        eT3.setText("");

        rnd1 = rnd.nextInt(90)+10;
        rnd2 = rnd.nextInt(90)+10;
        rnd3 = rnd.nextInt(90)+10;
        rnd4 = rnd.nextInt(90)+10;
        tV1.setText(""+rnd1);
        tV2.setText(""+rnd2);
        iV1.setVisibility(view.INVISIBLE);
        btn_eT1.setClickable(true);

        tV3.setVisibility(View.INVISIBLE);
        tV4.setVisibility(View.INVISIBLE);
        eT2.setVisibility(View.INVISIBLE);
        iV2.setVisibility(view.INVISIBLE);
        btn_eT2.setVisibility(view.INVISIBLE);
        btn_eT2.setClickable(true);

        tV5.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);
        iV3.setVisibility(view.INVISIBLE);
        btn_eT3.setVisibility(view.INVISIBLE);
        btn_eT3.setClickable(true);

    }
}