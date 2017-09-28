package br.app.ex1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Balaio extends Activity {
	
	private EditText editText01;
	private EditText editText02;
	private EditText editText03;
	private TextView textView04;
	private TextView textView05;
	private TextView textView06;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balaio);
        
        editText01 = (EditText) findViewById(R.id.EditText01);
        editText02 = (EditText) findViewById(R.id.EditText02);
        editText03 = (EditText) findViewById(R.id.EditText03);
        textView04 = (TextView) findViewById(R.id.TextView04a);
        textView05 = (TextView) findViewById(R.id.TextView05b);
        textView06 = (TextView) findViewById(R.id.TextView06c);
    }
    
    public void Calcular(View btn){
    	
    	double a, b, c, d, e, f;
    	
    	a = Double.parseDouble(editText01.getText().toString());
    	b = Double.parseDouble(editText02.getText().toString());
    	c = Double.parseDouble(editText03.getText().toString());
    	
    	d = (a + b) / 10;
    	e = a + b;
    	f = e / c;
    	
    	textView04.setText(String.valueOf(d));
    	textView05.setText(String.valueOf(e));
    	textView06.setText(String.valueOf(f));
    	
    	editText01.setText(null);
    	editText02.setText(null);
    	editText03.setText(null);
    	
    	editText01.requestFocus();
    }
}
