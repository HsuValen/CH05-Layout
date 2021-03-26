package tw.tcnr08.m0500;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {
    private EditText e001;
    private Button b001;
    private TextView t003;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);//抓取LAYOUT的XML
        setupViewComponent();
    }

    private void setupViewComponent() {
        // 設定LAYOUT的配置
        e001 = (EditText) findViewById(R.id.m0500_e001);//輸入公斤
        b001 = (Button) findViewById(R.id.m0500_b001);//執行程式
        t003 = (TextView) findViewById(R.id.m0500_t003);//輸出磅
        b001.setOnClickListener(b001On);//宣告按鈕的監聽程式

    }

    private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat lbFormat = new DecimalFormat(".0000");//顯示到小數點後四位補0
            String outputNum = lbFormat.format(Float.parseFloat(e001.getText().toString()) * 2.20462262);//公斤轉磅
            t003.setText(outputNum);
        }
    };
}