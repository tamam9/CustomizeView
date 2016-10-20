package com.skypiea.act;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

import com.skypiea.span.CustomSpan;

import org.w3c.dom.Text;

/**
 * Created by Yusuf on 2016/10/20.
 */

public class MainAct5 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(getBaseContext());
        SpannableStringBuilder redBlackText = CustomSpan.getRedBlackText("mustafa muhtar");
        textView.setText(redBlackText);
        setContentView(textView);
    }
}
