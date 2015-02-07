package com.yusufrahmatullah.intentexplicit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Yusuf on 07/02/2015.
 */
public class ResultActivity extends Activity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle newBundle = getIntent().getExtras();
        TextView text = (TextView) findViewById(R.id.displayintentextra);
        text.setText(newBundle.getString("inputText"));
    }

    @Override
    public void finish(){
        Intent intent = new Intent();
        EditText text = (EditText) findViewById(R.id.returnValue);
        String retval = text.getText().toString();
        intent.putExtra("returnValue", retval);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
