package example.com.day09_02_22;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView img_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_view = findViewById(R.id.img_view);
        initData();

    }

    private void initData() {
        AnimatorSet animatorSet = new AnimatorSet();
        //alpha透明
        ObjectAnimator alpha = ObjectAnimator.ofFloat(img_view, "alpha", 1f,0f,1f);
       //平移
        ObjectAnimator translationX1 = ObjectAnimator.ofFloat(img_view, "translationX", 0, 1000,0);
        //缩放
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(img_view, "scaleX", 1,3,0,3,1);
         //旋转
        ObjectAnimator rotationX = ObjectAnimator.ofFloat(img_view, "rotation", 0, 360,0);
        translationX1.setRepeatCount(-1);//一值循环

        animatorSet.play(rotationX).with(translationX1);
        animatorSet.setDuration(5000);
        animatorSet.start();
    }
}
