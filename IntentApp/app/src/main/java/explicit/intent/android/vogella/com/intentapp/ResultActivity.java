package explicit.intent.android.vogella.com.intentapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USER on 2/8/2015.
 */
public class ResultActivity extends Activity{

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();

        String ReceivedString = extras.getString("MyKey");
        TextView textVw = (TextView) findViewById(R.id.displayintentextra);
        textVw.setText(ReceivedString);


    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        EditText text = (EditText) findViewById(R.id.returnValue);
        //String txt = et.getText().toString();
        intent.putExtra("MyKey",text.getText().toString());
        setResult(RESULT_OK,intent);
        super.finish();
    }
}
