package com.skypiea.customview;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

/**
 * Created by Yusuf on 2016/10/18.
 */

public class CustomView2 extends View {
    public CustomView2(Context context) {
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setTextSize(40);
        paint.setStrokeWidth(30);
        paint.setShadowLayer(5, 0, 0, Color.RED);
        canvas.drawText("this", 0, 100, paint);
        canvas.drawLine(0, 40, 100, 40, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        Path path = new Path();
        path.addRect(200, 40, 300, 80, Path.Direction.CCW);
        canvas.drawPath(path,paint);
        paint.setColor(Color.RED);
        Path path2 = new Path();
        path2.addRoundRect(new RectF(200,100,400,200),100,50, Path.Direction.CW);
        canvas.drawPath(path2,paint);
//        paint.setTextSkewX(0.4f);
        paint.setUnderlineText(true);
        paint.setFakeBoldText(false);
        paint.setStrokeWidth(2);
//        canvas.drawText("abcdefg",200,300,paint);
         canvas.drawTextOnPath("3",path2,0,0,paint);
        canvas.drawText("مۇستافا",200,400,paint);
        AssetManager mgr=getContext().getAssets();//得到AssetManager
        Typeface typeface= Typeface.createFromAsset(mgr, "UKIJTuT.ttf");//根据路径得到Typeface
        paint.setTypeface(typeface);
        paint.setColor(Color.BLUE);
        canvas.drawText("مۇستافا",400,400,paint);

    }
}
