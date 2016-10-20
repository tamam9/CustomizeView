package com.skypiea.act;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.skypiea.R;
import com.skypiea.customview.Customview;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        init();
    }

    private void init() {
        LinearLayout workspace = (LinearLayout) findViewById(R.id.workspace);
        Customview customview = new Customview(getBaseContext());
//        customview.setMinimumWidth(200);
//        customview.setMinimumHeight(200);
//        customview.invalidate();
        customview.setBackgroundColor(Color.YELLOW);
        workspace.addView(customview);
    }
}
