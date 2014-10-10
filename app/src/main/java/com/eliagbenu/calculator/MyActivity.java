package com.eliagbenu.calculator;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {
    TextView editText1;
    TextView editText2;
    TextView resultTextView;
    Button btnResult;
    RelativeLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        addClick();
        clearFields();
    }


     public void addClick(){
         editText1 = (TextView) findViewById(R.id.editText1);
         editText2 = (TextView) findViewById(R.id.editText2);
         resultTextView = (TextView) findViewById(R.id.resultTextView);
         btnResult = (Button) findViewById(R.id.btnResult);
         mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);

         btnResult.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int number1 = Integer.parseInt(editText1.getText().toString().trim());
                 int number2 = Integer.parseInt(editText2.getText().toString().trim());
                 int result = number1+number2;

                 if (result<=25){
                     mainLayout.setBackgroundColor(Color.GRAY);
                 }else if(result>25 && result<=50){
                     mainLayout.setBackgroundColor(Color.BLUE);
                 }else if(result>50 && result<=100){
                     mainLayout.setBackgroundColor(Color.YELLOW);
                 }else if(result>100 && result<=200){
                     mainLayout.setBackgroundColor(Color.MAGENTA);
                 }else{
                     mainLayout.setBackgroundColor(Color.GREEN);
                 }

                 resultTextView.setText("The sum is "+result);

             }
         });
     }

    public void clearFields(){
        editText1 = (TextView) findViewById(R.id.editText1);
        editText2 = (TextView) findViewById(R.id.editText2);

        editText1.setText(" ");
        editText2.setText(" ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
