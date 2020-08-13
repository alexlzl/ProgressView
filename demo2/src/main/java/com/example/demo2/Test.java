package com.example.demo2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

class Test extends View {
    public Test(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint mPaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint1.setStrokeWidth(70);//设置画笔宽度
        mPaint1.setColor(Color.BLUE);//设置画笔颜色
        mPaint1.setStyle(Paint.Style.STROKE);//设置画笔样式
        mPaint1.setTextSize(100);

        Paint mPaint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint3.setStrokeWidth(3);//设置画笔宽度
        mPaint3.setColor(Color.BLUE);//设置画笔颜色
        mPaint3.setStyle(Paint.Style.STROKE);//设置画笔样式
        mPaint3.setTextSize(100);

        Path path1 = new Path();
        path1.addCircle(400, 400, 300, Path.Direction.CCW);

        Path path2 = new Path();
        path2.addCircle(400, 1200, 300, Path.Direction.CCW);

        canvas.drawCircle(400, 400, 300, mPaint3);
        canvas.drawCircle(400, 1200, 300, mPaint3);
        canvas.drawPoint(400, 400, mPaint1);
        canvas.drawPoint(400, 1200, mPaint1);
        canvas.drawTextOnPath("学习Android 绘图！1", path1, 200, 0, mPaint3);
        canvas.drawTextOnPath("学习Android 绘图！2", path2, 50, 50, mPaint3);

    }
}
