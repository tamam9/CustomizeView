package com.skypiea.act;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Paint.Style;
import android.graphics.Region.Op;
import android.graphics.RegionIterator;
import android.view.View;
/**
 * Created by Yusuf on 2016/10/20.
 */
public class MainAct6 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       MyRegionView myRegionView=new MyRegionView(getBaseContext());
        setContentView(myRegionView);
    }
}



  class MyRegionView extends View {

    public MyRegionView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);

        //构造两个矩形
        Rect rect1 = new Rect(100,100,400,200);
        Rect rect2 = new Rect(200,0,300,300);

        //构造一个画笔，画出矩形轮廓
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(2);

        canvas.drawRect(rect1, paint);
        canvas.drawRect(rect2, paint);



        //构造两个Region
        Region region = new Region(rect1);
        Region region2= new Region(rect2);

        //取两个区域的交集
        region.op(region2, Op.REVERSE_DIFFERENCE);

        //再构造一个画笔,填充Region操作结果
        Paint paint_fill = new Paint();
        paint_fill.setColor(Color.GREEN);
        paint_fill.setStyle(Style.FILL);
        drawRegion(canvas, region, paint_fill);

    }


    private void drawRegion(Canvas canvas,Region rgn,Paint paint)
    {
        RegionIterator iter = new RegionIterator(rgn);
        Rect r = new Rect();

        while (iter.next(r)) {
            canvas.drawRect(r, paint);
        }
    }
}