package br.ex1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Soma extends Activity {

	private EditText lblNumero1;
	private EditText lblNumero2;
	private TextView lblResultado;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);
        
        lblNumero1 = (EditText) findViewById(R.id.lblNumero1);
        lblNumero2 = (EditText) findViewById(R.id.lblNumero2);
        lblResultado = (TextView) findViewById(R.id.lblResultado);
    }
    
    public void Somar(View btn){
    	
    	int a, b, res;
    	
    	a = Integer.parseInt(lblNumero1.getText().toString());
    	b = Integer.parseInt(lblNumero2.getText().toString());
    	
    	res = a + b;
    	
    	lblResultado.setText(String.valueOf(res));
    	
    	
    	lblNumero1.setText(null);
    	lblNumero2.setText(null);
    	
    	
    	lblNumero1.requestFocus();
    }
}
