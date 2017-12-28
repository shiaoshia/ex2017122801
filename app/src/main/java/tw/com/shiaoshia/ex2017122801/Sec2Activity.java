package tw.com.shiaoshia.ex2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sec2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec2);

        //讀取MainActivity傳來的資料
        TextView tv2=findViewById(R.id.textView2);
        Intent it=getIntent();
        String str=it.getStringExtra("data");
        tv2.setText(str);

    }
}
