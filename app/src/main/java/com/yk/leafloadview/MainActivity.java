package com.yk.leafloadview;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private int totalPro=100;
    private int progress=0;
    private LeafLoadView mLeafLoadView;
    private LeafLoadView mLeafLoadView1;
    private LeafLoadView mLeafLoadView2;
    private LeafLoadView mLeafLoadView3;
    private LeafLoadView mLeafLoadView4;
    private boolean isTouch=false;
    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    progress = progress + 1;
                    mLeafLoadView.setPrograss(progress);
                    mLeafLoadView1.setPrograss(progress);
                    mLeafLoadView2.setPrograss(progress);
                    mLeafLoadView3.setPrograss(progress);
                    if(!isTouch){
                        mLeafLoadView4.setPrograss(progress);
                    }
                    mHandler.sendEmptyMessageDelayed(1,800); //800ms发送一次
                    break;
                default:
                    break;
            }
        }
    };
    private SeekBar mSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mSeekBar = (SeekBar) findViewById(R.id.seekbar);
        mSeekBar.setOnSeekBarChangeListener(this);
        mSeekBar.setMax(100);

        mLeafLoadView = (LeafLoadView) findViewById(R.id.leafview);
        ImageView imageView= (ImageView) findViewById(R.id.fan_p);
        mLeafLoadView1 = (LeafLoadView) findViewById(R.id.leafview_1);
        ImageView imageView1= (ImageView) findViewById(R.id.fan_p1);
        mLeafLoadView2 = (LeafLoadView) findViewById(R.id.leafview_2);
        ImageView imageView2= (ImageView) findViewById(R.id.fan_p2);
        mLeafLoadView3 = (LeafLoadView) findViewById(R.id.leafview_3);
        ImageView imageView3= (ImageView) findViewById(R.id.fan_p3);
        mLeafLoadView4 = (LeafLoadView) findViewById(R.id.leafview_4);
        ImageView imageView4= (ImageView) findViewById(R.id.fan_p4);

        mLeafLoadView.setTotalProgress(totalPro);
        mLeafLoadView1.setTotalProgress(totalPro);
        mLeafLoadView2.setTotalProgress(totalPro);
        mLeafLoadView3.setTotalProgress(totalPro);
        mLeafLoadView4.setTotalProgress(totalPro);
        mLeafLoadView.rotationView(imageView);
        mLeafLoadView1.rotationView(imageView1);
        mLeafLoadView2.rotationView(imageView2);
        mLeafLoadView3.rotationView(imageView3);
        mLeafLoadView4.rotationView(imageView4);
        mHandler.sendEmptyMessageDelayed(1,0);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(fromUser){
            mSeekBar.setProgress(progress);
            mLeafLoadView4.setPrograss(progress);
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        isTouch=true;
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
