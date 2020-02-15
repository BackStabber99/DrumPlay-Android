package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;



    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        m1=MediaPlayer.create(this,R.raw.one);
        m2=MediaPlayer.create(this,R.raw.two);
        m3=MediaPlayer.create(this,R.raw.three);
        m4=MediaPlayer.create(this,R.raw.four);
        m5=MediaPlayer.create(this,R.raw.fv);
        m6=MediaPlayer.create(this,R.raw.sixth);
        m7=MediaPlayer.create(this,R.raw.seventh);
        m8=MediaPlayer.create(this,R.raw.eighth);
        m9=MediaPlayer.create(this,R.raw.one);
        m10=MediaPlayer.create(this,R.raw.three);
        m11=MediaPlayer.create(this,R.raw.fv);
        m12=MediaPlayer.create(this,R.raw.seventh);

    }


//More Optimized Way
    //    public void playSound(View view) {
//
//        switch (view.getId()) {
//            case R.id.imageButton1:
//                MediaPlayer.create(getApplicationContext(), R.raw.one).start();
//                break;
//            case R.id.imageButton2:
//                MediaPlayer.create(getApplicationContext(), R.raw.two).start();
//                break;
//            case R.id.imageButton3:
//                MediaPlayer.create(getApplicationContext(), R.raw.three).start();
//                break;
//            case R.id.imageButton4:
//                MediaPlayer.create(getApplicationContext(), R.raw.four).start();
//                break;
//            case R.id.imageButton5:
//                MediaPlayer.create(getApplicationContext(), R.raw.fv).start();
//                break;
//            case R.id.imageButton6:
//                MediaPlayer.create(getApplicationContext(), R.raw.sixth).start();
//                break;
//            case R.id.imageButton7:
//                MediaPlayer.create(getApplicationContext(), R.raw.seventh).start();
//                break;
//            case R.id.imageButton8:
//                MediaPlayer.create(getApplicationContext(), R.raw.eighth).start();
//                break;
//            case R.id.imageButton9:
//                MediaPlayer.create(getApplicationContext(), R.raw.one).start();
//                break;
//            case R.id.imageButton10:
//                MediaPlayer.create(getApplicationContext(), R.raw.two).start();
//                break;
//            case R.id.imageButton11:
//                MediaPlayer.create(getApplicationContext(), R.raw.seventh).start();
//                break;
//            case R.id.imageButton12:
//                MediaPlayer.create(getApplicationContext(), R.raw.fv).start();
//                break;
//            default:
//                MediaPlayer.create(getApplicationContext(), R.raw.one).start();
//        }
//
//    }

    public void OnClickBtn(View view){
        switch (view.getId()){
            case R.id.imageButton1:
                soundPlay(view.getId());
                break;
            case R.id.imageButton2:
                soundPlay(view.getId());
                break;
            case R.id.imageButton3:
                soundPlay(view.getId());
                break;
            case R.id.imageButton4:
                soundPlay(view.getId());
                break;
            case R.id.imageButton5:
                soundPlay(view.getId());
                break;
            case R.id.imageButton6:
                soundPlay(view.getId());
                break;
            case R.id.imageButton7:
                soundPlay(view.getId());
                break;
            case R.id.imageButton8:
                soundPlay(view.getId());
                break;
            case R.id.imageButton9:
                soundPlay(view.getId());
                break;
            case R.id.imageButton10:
                soundPlay(view.getId());
                break;
            case R.id.imageButton11:
                soundPlay(view.getId());
                break;
            case R.id.imageButton12:
                soundPlay(view.getId());
                break;




        }

    }

    public void soundPlay(int id){
        switch (id){
            case R.id.imageButton1:
                m1.start();
                break;
            case R.id.imageButton2:
                m2.start();
                break;
            case R.id.imageButton3:
                m3.start();
                break;
            case R.id.imageButton4:
                m4.start();
                break;
            case R.id.imageButton5:
                m5.start();
                break;
            case R.id.imageButton6:
                m6.start();
                break;
            case R.id.imageButton7:
                m7.start();
                break;
            case R.id.imageButton8:
                m8.start();
                break;
            case R.id.imageButton9:
                m1.start();
                break;
            case R.id.imageButton10:
                m3.start();
                break;
            case R.id.imageButton11:
                m5.start();
                break;
            case R.id.imageButton12:
                m7.start();
                break;


        }

    }





}
