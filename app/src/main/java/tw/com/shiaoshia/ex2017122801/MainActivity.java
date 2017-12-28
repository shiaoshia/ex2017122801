package tw.com.shiaoshia.ex2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV=findViewById(R.id.textView);
    }

    public void onClick1(View v){

        //TV=(TextView)findViewById(R.id.textView);


        //從strings.xml檔裡讀取資料的2個方法
        TV.setText(getResources().getString(R.string.TV1));
        //TV.setText(this.getString(R.string.TV1));
    }

    //跳下一頁,將值傳給下一頁
    public void onClick2(View v){

        EditText ET1;
        ET1=findViewById(R.id.editText);
        Intent it=new Intent(MainActivity.this,Sec2Activity.class);
        it.putExtra("data", ET1.getText().toString());
        startActivity(it);
    }
    //跳第三頁,並接教第三頁回傳資料
    public void onClick3(View v){
        Intent it=new Intent(MainActivity.this,thr3Activity.class);
        //startActivity(it);
        startActivityForResult(it,123);
    }

    //接收第三頁回傳資料
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TV.setText(data.getStringExtra("myresult"));
    }
}
