package com.skypiea.act;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Yusuf on 2016/10/20.
 */

public class MainAct7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ClipView clipView = new ClipView(getBaseContext());
        setContentView(clipView);
    }


    public class ClipView extends View {

        public ClipView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            canvas.drawColor(Color.BLACK);
            paint.setColor(Color.GRAY);
            canvas.drawRect(100, 100, 300, 300, paint);
            paint.setColor(Color.YELLOW);
            canvas.clipRect(new Rect(200, 200, 250, 250));
            canvas.drawColor(Color.RED);
        }
    }
}
