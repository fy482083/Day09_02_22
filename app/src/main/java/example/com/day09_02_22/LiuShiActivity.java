package example.com.day09_02_22;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LiuShiActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mEdit01;
    /**
     * 搜索
     */
    private TextView mText;
    private LinearLayout mLine2;
    private FlowLayout mMainFlow;
    private LinearLayout mLine1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flaw);
        initView();

    }

    private void initView() {
        mEdit01 = (EditText) findViewById(R.id.edit01);
        mText = (TextView) findViewById(R.id.text);
        mLine2 = (LinearLayout) findViewById(R.id.line2);
        mMainFlow = (FlowLayout) findViewById(R.id.main_flow);
        mLine1 = (LinearLayout) findViewById(R.id.line1);
        mText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.text:
                TextView textView = new TextView(LiuShiActivity.this);
                String s = mEdit01.getText().toString();
                textView.setText(s);
                ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                mMainFlow.addView(textView,params);
                break;
        }
    }
}
