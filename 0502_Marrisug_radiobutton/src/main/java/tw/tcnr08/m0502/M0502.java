package tw.tcnr08.m0502;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0502 extends AppCompatActivity {
    private TextView f000;
    private Button b001;
    private RadioButton r002a,r002b,r002c;
    private RadioGroup r001,r002;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0502);
        setupViewComponent();
    }

    private void setupViewComponent() {
//        e001 = (EditText)findViewById(R.id.m0502_e001);
//        s001 = (Spinner) findViewById((R.id.m0502_s001));
        b001 = (Button)findViewById((R.id.m0502_b001));
        f000 = (TextView)findViewById(R.id.m0502_f000);
        r001 =(RadioGroup)findViewById(R.id.m0502_r001);
        r002 =(RadioGroup)findViewById(R.id.m0502_r002);
        r002a =(RadioButton)findViewById(R.id.m0502_r002a);
        r002b =(RadioButton)findViewById(R.id.m0502_r002b);
        r002c =(RadioButton)findViewById(R.id.m0502_r002c);

//        //-----------------------------------------------------------------------------------------------------------------------------
        b001.setOnClickListener(b001On);
        r001.setOnCheckedChangeListener(r001On);
    }

    private  RadioGroup.OnCheckedChangeListener r001On = new RadioGroup.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch(checkedId){
                case R.id.m0502_r001a:{//點男
                    r002a.setText(R.string.m0502_r002aa);
                    r002b.setText(R.string.m0502_r002ab);
                    r002c.setText(R.string.m0502_r002ac);
                    break;
                }

                case R.id.m0502_r001b:{//點女
                    r002a.setText(R.string.m0502_r002ba);
                    r002b.setText(R.string.m0502_r002bb);
                    r002c.setText(R.string.m0502_r002bc);
                    break;
                }
            }
        }
    };

    private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSug = getString(R.string.m0502_f000);
            switch(r002.getCheckedRadioButtonId()){
                case R.id.m0502_r002a:{
                    strSug+=getString(R.string.m0502_f001);
                    break;
                }
                case R.id.m0502_r002b:{
                    strSug+=getString(R.string.m0502_f002);
                    break;
                }
                case R.id.m0502_r002c:{
                    strSug+=getString(R.string.m0502_f003);
                    break;
                }
            }
            switch(r001.getCheckedRadioButtonId()){
                case R.id.m0502_r001a:{//男
                    strSug+=getString(R.string.m0502_f0001);
                    break;
                }
                case R.id.m0502_r001b:{//女
                    strSug+=getString(R.string.m0502_f0002);
                    break;
                }
            }
            f000.setText(strSug);
//            f000.setText("請勿輸入空白");
        }
    };





}