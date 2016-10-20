package com.skypiea.act;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.skypiea.R;
import com.skypiea.customview.PlussView;

/**
 * Created by Yusuf on 2016/10/18.
 */

public class MainAct2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        init();
    }

    private void init() {
        LinearLayout workspace = (LinearLayout) findViewById(R.id.workspace);
        PlussView plussView = new PlussView(getBaseContext());
        plussView.setLayoutParams(new LinearLayout.LayoutParams(600, 600));
        workspace.addView(plussView);
        PlussView plussView2 = new PlussView(getBaseContext());
        plussView2.setLayoutParams(new LinearLayout.LayoutParams(600, 600));
        workspace.addView(plussView2);
    }
}
