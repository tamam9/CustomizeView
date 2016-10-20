package com.skypiea.act;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.skypiea.R;

/**
 * Created by Yusuf on 2016/10/18.
 */

public class MainAct3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        init();
    }

    private void init() {
        LinearLayout workspace = (LinearLayout) findViewById(R.id.workspace);
        TextView textView = new TextView(getBaseContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText("测试");
        workspace.addView(textView);
        TextView textView2 = new TextView(getBaseContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView2.setText("测试2");
        textView2.setScaleY(2);
        textView2.setAlpha(0.8f);
        textView2.setTranslationX(100);
        textView2.setRotation(0.5f);
        workspace.addView(textView2);


        TextView textView3 = new TextView(getBaseContext());
        textView3.setText("测试3");
        textView3.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView3.setTextColor(Color.RED);
        workspace.addView(textView3);
        textView3.setAnimation(AnimationUtils.loadAnimation(getBaseContext(), R.anim.my_scale));

        TextView textView4 = new TextView(getBaseContext());
        textView4.setText("测试4");
        textView4.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        workspace.addView(textView4);


        AnimationSet animationSet = new AnimationSet(true);
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(getBaseContext(), R.anim.my_rotate);
        rotateAnimation.setDuration(3000);

        animationSet.addAnimation(rotateAnimation);
        textView4.setAnimation(animationSet);


    }
}
