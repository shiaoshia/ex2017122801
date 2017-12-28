package tw.com.shiaoshia.ex2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class thr3Activity extends AppCompatActivity {
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thr3);
        et2=findViewById(R.id.editText2);
    }

    //回傳資料給第一頁
    public void onClickOkay(View v){
        Intent it=new Intent();
        it.putExtra("myresult",et2.getText().toString());
        setResult(RESULT_OK,it);
        finish();
    }

    public void onClickCancel(View v){
        et2.setText("");
    }

}
