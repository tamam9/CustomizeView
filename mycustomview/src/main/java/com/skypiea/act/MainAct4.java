package com.skypiea.act;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.skypiea.R;
import com.skypiea.customview.CustomView2;

/**
 * Created by Yusuf on 2016/10/18.
 */

public class MainAct4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        init();
    }

    private void init() {
        LinearLayout workspace= (LinearLayout) findViewById(R.id.workspace);
        CustomView2 customView2=new CustomView2(getBaseContext());
        workspace.addView(customView2);
    }
}
