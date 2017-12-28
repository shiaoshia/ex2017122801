package tw.com.shiaoshia.ex2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TV,TV3;
    EditText ET1;
    final int REQUEST_PAGE_3 = 123;
    final int REQUEST_PAGE_4 = 456;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV=findViewById(R.id.textView);
        TV3=findViewById(R.id.textView3);
        ET1=findViewById(R.id.editText);


    }

    public void onClick1(View v){
        //從strings.xml檔裡讀取資料的2個方法
        TV.setText(getResources().getString(R.string.TV1));
        //TV.setText(this.getString(R.string.TV1));
    }

    //跳第二頁,將值傳給第二頁
    public void onClick2(View v){
        Intent it=new Intent(MainActivity.this,Sec2Activity.class);
        it.putExtra("data", ET1.getText().toString());
        startActivity(it);
        ET1.setText("");
    }
    //跳第三頁,並接收第三頁回傳資料
    public void onClick3(View v){
        Intent it=new Intent(MainActivity.this,thr3Activity.class);
        it.putExtra("data", ET1.getText().toString());
        startActivityForResult(it,REQUEST_PAGE_3);
        ET1.setText("");
    }

    //跳第四頁,並接收第四頁回傳資料
    public void onClick4(View v){
        Intent it=new Intent(MainActivity.this,for4Activity.class);
        startActivityForResult(it,REQUEST_PAGE_4);
        ET1.setText("");
    }

    //接收第三、四頁回傳資料
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 123){
            if(resultCode == RESULT_OK) {
                TV.setText(data.getStringExtra("myresult"));
            }
        }
        if(requestCode == 456){
            if(resultCode == RESULT_OK) {
                TV3.setText(data.getStringExtra("myresult"));
            }
        }

    }
}
