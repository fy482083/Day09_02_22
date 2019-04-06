package example.com.day09_02_22;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
public class FlowLayout extends ViewGroup {

    public FlowLayout(Context context) {
        this(context,null);
    }

    public FlowLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {

    }

    @Override
    protected void  onLayout(boolean changed, int left, int top, int right, int bottom) {
          //先获取控件的宽
        int width = getWidth();
        //定义一个常量行数
        int row = 0;
        //子控件左边的坐标
        int disWidth = 18;
        for (int i = 0; i < getChildCount(); i++) {
                View view = getChildAt(i);
            int viewWidth  = view.getMeasuredWidth();
            int viewHeight  = view.getMeasuredHeight();
            if (disWidth+viewWidth>width){
                row++;
                disWidth=18;
            }
             view.layout(disWidth,row*viewHeight,viewWidth+disWidth,viewHeight*(row+1));
             disWidth+=viewWidth;
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
