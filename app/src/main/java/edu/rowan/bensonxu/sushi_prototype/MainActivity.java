package edu.rowan.bensonxu.sushi_prototype;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sushi_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //For the sushi button click handler
        final ImageView v = (ImageView) findViewById(R.id.big_sushi);
        v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                TranslateAnimation animation = new TranslateAnimation(0, 50, 0, 100);
                animation.setDuration(1000);
                animation.setFillAfter(false);
                animation.setAnimationListener(new MyAnimationListener());

                v.startAnimation(animation);
            }

        });
    }

    public class MyAnimationListener implements Animation.AnimationListener {
        final ImageView v = (ImageView) findViewById(R.id.big_sushi);
        @Override
        public void onAnimationEnd(Animation animation) {
            v.clearAnimation();
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(v.getWidth(), v.getHeight());
            lp.setMargins(50, 100, 0, 0);
            v.setLayoutParams(lp);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
