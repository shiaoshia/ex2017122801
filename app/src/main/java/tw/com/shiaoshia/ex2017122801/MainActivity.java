package tw.com.shiaoshia.ex2017122801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v){

        //TV=(TextView)findViewById(R.id.textView);
        TV=findViewById(R.id.textView);

        //從strings.xml檔裡讀取資料
        //TV.setText(getResources().getString(R.string.TV1));
        TV.setText(this.getString(R.string.TV1));
    }

}
