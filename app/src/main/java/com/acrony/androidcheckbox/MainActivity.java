package com.acrony.androidcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox cTea,cCoffee,cIce;
Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cTea=(CheckBox)findViewById(R.id.chkTea);
        cCoffee=(CheckBox)findViewById(R.id.chkCoffee);
        cIce=(CheckBox)findViewById(R.id.chkIce);

        btnClick=(Button)findViewById(R.id.button);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int finalamt=0;
                StringBuilder res=new StringBuilder();
                if(cTea.isChecked())
                {
                    res.append("\nTea Selected Rs.20");
                    finalamt+=20;
                  //  Toast.makeText(MainActivity.this, "Tea Selected", Toast.LENGTH_SHORT).show();
                }
                if(cCoffee.isChecked())
                {
                    res.append("\nCoffee Selected Rs.50");
                    finalamt+=50;
                   // Toast.makeText(MainActivity.this, "Coffee Selected", Toast.LENGTH_SHORT)
                    // .show();
                }
                if(cIce.isChecked())
                {
                    res.append("\nIce Selected Rs.40");
                    finalamt+=40;
                   // Toast.makeText(MainActivity.this, "ICe Selected", Toast.LENGTH_SHORT).show();
                }
                res.append("\nTotal Amount:"+finalamt);
                Toast.makeText(MainActivity.this, res.toString(), Toast.LENGTH_SHORT).show();
               /*else
                {
                    Toast.makeText(MainActivity.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
}
