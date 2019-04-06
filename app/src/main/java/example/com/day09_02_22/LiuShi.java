package example.com.day09_02_22;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class LiuShi extends ViewGroup {
    public LiuShi(Context context) {
        super(context,null);
    }

    public LiuShi(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public LiuShi(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
       //先获取控件的宽
        int width = getWidth();
        //定义一个常量
        int row=0;
        //左边控件的宽
        int LeftWidth=18;
        for (int i = 0; i <getChildCount() ; i++) {
            View childAt = getChildAt(i);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (LeftWidth+measuredWidth>width){
                row++;
                LeftWidth=18;
            }
            childAt.layout(LeftWidth,row*measuredHeight,measuredWidth+LeftWidth,measuredHeight*(row+1));
            LeftWidth+=measuredWidth;
        }

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
