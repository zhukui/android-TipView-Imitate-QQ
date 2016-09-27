package com.cxmscb.cxm.tipview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button0,button1,button2,button3,button4;
    private RelativeLayout rl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        rl = (RelativeLayout) findViewById(R.id.activity_main);





        button0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x = 0;int y = 0;
                if(event.getAction()==MotionEvent.ACTION_UP){
                    x= (int) event.getX();y = (int) event.getY();
                    Log.i("zz",x+"  "+y);
                    TipView share = new TipView.Builder(MainActivity.this,rl,x+v.getLeft(),y+v.getTop())
                            .addItem(new TipItem("复制复制"))
                            .addItem(new TipItem("粘贴"))
                            .addItem(new TipItem("删除"))
                            .addItem(new TipItem("收藏"))
                            .addItem(new TipItem("转发"))
                            .addItem(new TipItem("更多"))
                            .setOnItemClickListener(new TipView.OnItemClickListener() {
                                @Override
                                public void onItemClick(String str,int a) {
                                    Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void dismiss() {

                                }
                            })
                            .create();
                }
                return true;
            }
        });

        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x = 0;int y = 0;
                if(event.getAction()==MotionEvent.ACTION_UP){
                    x= (int) event.getX();y = (int) event.getY();
                    Log.i("zz",x+"  "+y);
                    TipView share = new TipView.Builder(MainActivity.this,rl,x+v.getLeft(),y+v.getTop())
                            .addItem(new TipItem("复制"))
                            .addItem(new TipItem("粘贴"))
                            .addItem(new TipItem("删除"))
                            .addItem(new TipItem("收藏"))
                            .addItem(new TipItem("转发"))
                            .addItem(new TipItem("更多更多"))
                            .setOnItemClickListener(new TipView.OnItemClickListener() {
                                @Override
                                public void onItemClick(String str,int a) {
                                    Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void dismiss() {

                                }
                            })
                            .create();
                }
                return true;
            }
        });

        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x = 0;int y = 0;
                if(event.getAction()==MotionEvent.ACTION_UP){
                    x= (int) event.getX();y = (int) event.getY();
                    Log.i("zz",x+"  "+y);
                    TipView share = new TipView.Builder(MainActivity.this,rl,x+v.getLeft(),y+v.getTop())
                            .addItem(new TipItem("复制"))
                            .addItem(new TipItem("粘贴"))
                            .addItem(new TipItem("删除删除"))
                            .addItem(new TipItem("收藏"))
                            .addItem(new TipItem("转发"))
                            .addItem(new TipItem("更多"))
                            .setOnItemClickListener(new TipView.OnItemClickListener() {
                                @Override
                                public void onItemClick(String str,int a) {
                                    Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void dismiss() {

                                }
                            })
                            .create();
                }
                return true;
            }
        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x = 0;int y = 0;
                if(event.getAction()==MotionEvent.ACTION_UP){
                    x= (int) event.getX();y = (int) event.getY();
                    Log.i("zz",x+"  "+y);
                    TipView share = new TipView.Builder(MainActivity.this,rl,x+v.getLeft(),y+v.getTop())
                            .addItem(new TipItem("复制"))
                            .addItem(new TipItem("粘贴"))
                            .addItem(new TipItem("删除"))
                            .addItem(new TipItem("收藏转发"))
                            .addItem(new TipItem("转发"))
                            .addItem(new TipItem("更多"))
                            .setOnItemClickListener(new TipView.OnItemClickListener() {
                                @Override
                                public void onItemClick(String str,int a) {
                                    Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void dismiss() {

                                }
                            })
                            .create();
                }
                return true;
            }
        });

        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x = 0;int y = 0;
                if(event.getAction()==MotionEvent.ACTION_UP){
                    x= (int) event.getX();y = (int) event.getY();
                    Log.i("zz",x+"  "+y);
                    TipView share = new TipView.Builder(MainActivity.this,rl,x+v.getLeft(),y+v.getTop())
                            .addItem(new TipItem("复制"))
                            .addItem(new TipItem("粘贴"))
                            .addItem(new TipItem("删除"))
                            .addItem(new TipItem("收藏"))
                            .addItem(new TipItem("转发"))
                            .addItem(new TipItem("更多"))
                            .setOnItemClickListener(new TipView.OnItemClickListener() {
                                @Override
                                public void onItemClick(String str,int a) {
                                    Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void dismiss() {

                                }
                            })
                            .create();
                }
                return true;
            }
        });


    }


}
