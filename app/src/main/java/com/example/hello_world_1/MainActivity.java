package com.example.hello_world_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ImBtn = findViewById(R.id.ImBtn);
        final TextView tvl = findViewById(R.id.tvl);
        final TextView TextView_seekbar = findViewById(R.id.TextView_seekbar);
        ImBtn.setOnClickListener(new View.OnClickListener()
        {
            int cnt=0;
            @Override
            public void onClick(View v)
            {
                if(cnt == 0)
                    tvl.setText("He is so cool!");
                else
                    tvl.setText("");
                Log.d("MainActivity","Clicked.");
                cnt++;
                cnt = cnt % 2;
            }
        });



        SeekBar SBar = findViewById(R.id.SBar);
        SBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextView_seekbar.setText(progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("MainActivity","Giving Mark");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("MainActivity","Mark Given");
            }
        });

        final ImageButton ImBtn_good = findViewById(R.id.ImBtn_good);
        ImBtn_good.setOnClickListener(new View.OnClickListener() {
            int flag=0;
            @Override
            public void onClick(View v) {
                if (flag == 0)
                {
                    ImBtn_good.setBackgroundResource(R.drawable.well_done);
                    flag = 1;
                }
                else
                {
                    ImBtn_good.setBackgroundResource(R.drawable.good_job);
                    flag = 0;
                }
            }
        });

        final TextView information = findViewById(R.id.Information);
        final EditText E_main_address = findViewById(R.id.E_main_address);
        final EditText Phone = findViewById(R.id.Phone);
        information.setTextColor(Color.argb(0,0,255,0));
        E_main_address.setTextColor(Color.argb(0,0,255,0));
        E_main_address.setBackgroundColor(Color.argb(0,0,255,0));
        E_main_address.setEnabled(false);
        Phone.setTextColor(Color.argb(0,0,255,0));
        Phone.setBackgroundColor(Color.argb(0,0,255,0));
        Phone.setEnabled(false);
        Switch switch_1 = findViewById(R.id.Swith_1);
        switch_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    information.setTextColor(Color.argb(255,0,255,0));
                    E_main_address.setTextColor(Color.argb(255,255,0,0));
                    E_main_address.setBackgroundColor(Color.argb(255,255,255,255));
                    E_main_address.setEnabled(true);
                    Phone.setTextColor(Color.argb(255,255,0,0));
                    Phone.setBackgroundColor(Color.argb(255,255,255,255));
                    Phone.setEnabled(true);
                }
                else
                {
                    information.setTextColor(Color.argb(0,0,255,0));
                    E_main_address.setTextColor(Color.argb(0,0,255,0));
                    E_main_address.setBackgroundColor(Color.argb(0,0,255,0));
                    E_main_address.setEnabled(false);
                    Phone.setTextColor(Color.argb(0,0,255,0));
                    Phone.setBackgroundColor(Color.argb(0,0,255,0));
                    Phone.setEnabled(false);
                }
            }
        });
    }
}
