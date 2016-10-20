package com.skypiea.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by Yusuf on 2016/10/18.
 */

public class PlussView extends View {
    public PlussView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setTextSize(30);
        canvas.drawCircle(300, 300, 300, paint);
        paint.setColor(Color.RED);
        canvas.drawLine(0, 300, 300, 300, paint);
        canvas.drawRect(300, 0, 600, 300, paint);
        paint.setColor(Color.WHITE);
        Path path = new Path();
        path.moveTo(150, 150);
        path.lineTo(200, 150);
        path.lineTo(150, 300);
        path.close();
        canvas.drawPath(path, paint);
//        canvas.drawPoints(new float[]{10, 10, 30, 30, 50, 50, 60, 150, 70, 70, 250, 170}, paint);
        canvas.drawPoints(new float[]{60, 400, 65, 400, 70, 400}, paint);//画多个点
        paint.setColor(Color.YELLOW);
        RectF rectF = new RectF(0, 300, 300, 600);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 90, 180, false, paint);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), android.R.drawable.ic_menu_help);
        canvas.drawBitmap(bitmap, 300, 300, paint);
    }


}
