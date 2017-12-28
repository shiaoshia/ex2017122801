package tw.com.shiaoshia.ex2017122801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v){
        TextView TV;
        TV=(TextView)findViewById(R.id.textView);
        TV.setText("123");

    }

}
