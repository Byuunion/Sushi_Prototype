package edu.rowan.bensonxu.sushi_prototype;
/**
 * Created by BenX on 12/23/2015.
 */
import android.os.Bundle;
import android.app.Activity;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class Animation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sushi_main);

        ImageView img_animation = (ImageView) findViewById(R.id.big_sushi);

        TranslateAnimation animation = new TranslateAnimation(0.0f, 400.0f,
                0.0f, 0.0f);
        animation.setDuration(5000);
        animation.setRepeatCount(5);
        animation.setRepeatMode(2);
        animation.setFillAfter(true);
        img_animation.startAnimation(animation);

    }
}