package com.example.hello_world_1;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.MainThread;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

import java.nio.channels.SeekableByteChannel;

import static com.example.hello_world_1.R.string.*;

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

    }
}
