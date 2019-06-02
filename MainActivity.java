package com.example.bhatia.feelbruh;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

ImageView hiphop,rock,trending,imgprada,kids,old,workout,sports,tomorrowland;
MediaPlayer mp;
int i;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();


         if(id==R.id.brock){

             Intent i = new Intent(MainActivity.this, Main3Activity.class);
             startActivity(i);
             return true;
         }
        if(id==R.id.bhiphop){

            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);
            return true;
        }
        if(id==R.id.bworkout){

            Intent j = new Intent(MainActivity.this,workoutt.class);
            startActivity(j);

            return true;
        }
        if(id==R.id.btomorrowland){

            Intent j = new Intent(MainActivity.this,tomorrow.class);
            startActivity(j);

            return true;
        }
        if(id==R.id.bold){

            Intent j = new Intent(MainActivity.this,oldd.class);
            startActivity(j);
            return true;
        }
        if(id==R.id.bpunjabi){

            Intent j = new Intent(MainActivity.this,Main4Activity.class);
            startActivity(j);
            return true;
        }

        if(id==R.id.bsports){

            Intent j = new Intent(MainActivity.this,sportss.class);
            startActivity(j);

            return true;
        }
        if(id==R.id.btrending){

            Intent i = new Intent(MainActivity.this, trending.class);
            startActivity(i);

            return true;
        }

         return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kids= (ImageView) findViewById(R.id.kids);
        old = (ImageView) findViewById(R.id.old);
        workout = (ImageView) findViewById(R.id.workout);
        sports = (ImageView) findViewById(R.id.sports);
        tomorrowland = (ImageView) findViewById(R.id.tomorrowland);
           hiphop = (ImageView) findViewById(R.id.hiphop);
        trending= (ImageView) findViewById(R.id.trending);
        imgprada= (ImageView) findViewById(R.id.imgprada);
           rock = (ImageView) findViewById(R.id.rock);



           kids.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent j = new Intent(MainActivity.this,kidss.class);
                   startActivity(j);
               }
           });
        old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,oldd.class);
                startActivity(j);
            }
        });
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,workoutt.class);
                startActivity(j);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,sportss.class);
                startActivity(j);
            }
        });
        tomorrowland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,tomorrow.class);
                startActivity(j);
            }
        });

           imgprada.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent j = new Intent(MainActivity.this,Main4Activity.class);
                   startActivity(j);
               }
           });
           trending.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent i = new Intent(MainActivity.this, trending.class);
                   startActivity(i);
               }
           });

           rock.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent i = new Intent(MainActivity.this, Main3Activity.class);
                   startActivity(i);
               }
           });
           hiphop.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View view) {


                   Intent i = new Intent(MainActivity.this, Main2Activity.class);
                   startActivity(i);
               }
           });



        }}