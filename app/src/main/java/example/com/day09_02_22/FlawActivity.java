package example.com.day09_02_22;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FlawActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEdit01;
    /**
     * 搜索
     */
    private TextView mText;
    private LinearLayout mLine2;
    private FlowLayout mMainFlow;
    private LinearLayout mLine1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flaw);
        initView();
    }

    private void initView() {

        mEdit01 = findViewById(R.id.edit01);
        mText = findViewById(R.id.text);
        mText.setOnClickListener(this);
        mLine2 = findViewById(R.id.line2);
        mMainFlow = findViewById(R.id.main_flow);
        mLine1 = findViewById(R.id.line1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text:
                TextView textView = new TextView(FlawActivity.this);
                //获取输入框
                String s = mEdit01.getText().toString();
                Log.i("fy", "onClick: ============="+s);
                textView.setText(s);
                ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                mMainFlow.addView(textView,params);

                break;
        }

    }
}
