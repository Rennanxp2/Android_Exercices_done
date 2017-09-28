package br.ex3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroRetangulo extends Activity {

	private EditText textValorA;
	private EditText textValorB;
	private TextView textResultado;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_retangulo);
        
        textValorA = (EditText) findViewById(R.id.editValorA);
        textValorB = (EditText) findViewById(R.id.editValorB);
        textResultado = (TextView) findViewById(R.id.textResultado);
    }
    
        public void Area(View Area){
           
        	int a, b, res;
            
            a = Integer.parseInt(textValorA.getText().toString());
        	b = Integer.parseInt(textValorB.getText().toString());
        	
        	res = a * b;
        	
        	textResultado.setText(String.valueOf(res));
        	
        	textValorA.setText(null);
        	textValorB.setText(null);
        	
        	
        	textValorA.requestFocus();
    }
        public void Perimetro(View Perimetro){
            
        	int a, b, res;
            
            a = Integer.parseInt(textValorA.getText().toString());
        	b = Integer.parseInt(textValorB.getText().toString());
        	
        	res = 2 * (a + b);
        	
        	textResultado.setText(String.valueOf(res));
        	
        	textValorA.setText(null);
        	textValorB.setText(null);
        	
        	
        	textValorA.requestFocus();
    }
}
