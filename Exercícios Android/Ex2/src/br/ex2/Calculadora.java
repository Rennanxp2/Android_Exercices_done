package br.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends Activity {

	private EditText textNumero1;
	private EditText textNumero2;
	private TextView textResultado;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        
        textNumero1 = (EditText) findViewById(R.id.editValorA);
        textNumero2 = (EditText) findViewById(R.id.editValorB);
        textResultado = (TextView) findViewById(R.id.textResultado);
    }
        public void Somar(View Somar){
        	
        	int a,b,res;
        	
        	a = Integer.parseInt(textNumero1.getText().toString());
        	b = Integer.parseInt(textNumero2.getText().toString());
        	
        	res = a + b;
        	
        	textResultado.setText(String.valueOf(res));
        	
        	
        	textNumero1.setText(null);
        	textNumero2.setText(null);
        	
        	
        	textNumero1.requestFocus();
    }
        public void Subtrair(View Subtrair){
        	
        	int a,b,res;
        	
        	a = Integer.parseInt(textNumero1.getText().toString());
        	b = Integer.parseInt(textNumero2.getText().toString());
        	
        	res = a - b;
        	
        	textResultado.setText(String.valueOf(res));
        	
        	
        	textNumero1.setText(null);
        	textNumero2.setText(null);
        	
        	
        	textNumero1.requestFocus();
    }
        public void Multiplicar(View Multiplicar){
        	
        	int a,b,res;
        	
        	a = Integer.parseInt(textNumero1.getText().toString());
        	b = Integer.parseInt(textNumero2.getText().toString());
        	
        	res = a * b;
        	
        	textResultado.setText(String.valueOf(res));
        	
        	
        	textNumero1.setText(null);
        	textNumero2.setText(null);
        	
        	
        	textNumero1.requestFocus();
    }
        public void Dividir(View Dividir){
        	
        	int a,b,res;
        	
        	a = Integer.parseInt(textNumero1.getText().toString());
        	b = Integer.parseInt(textNumero2.getText().toString());
        	
        	res = a / b;
        	
        	textResultado.setText(String.valueOf(res));
        	
        	
        	textNumero1.setText(null);
        	textNumero2.setText(null);
        	
        	
        	textNumero1.requestFocus();
    }
}
