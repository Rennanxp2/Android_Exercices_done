package br.ex5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Media extends Activity {
	
	private EditText Nota1;
	private EditText Nota2;
	private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        
        Nota1 = (EditText) findViewById(R.id.editNota1);
        Nota2 = (EditText) findViewById(R.id.editNota2);
        Resultado = (TextView) findViewById(R.id.textResultado);
    }
    
    public void Calcular (View btn){
    	
    	double a, b, res;
    	
    	a = Double.parseDouble(Nota1.getText().toString());
    	b = Double.parseDouble(Nota2.getText().toString());
    	
    	res = (a + b) / 2;
    	
    	Resultado.setText(String.valueOf(res));
    	
    	Nota1.setText(null);
    	Nota2.setText(null);
    	
    	Nota1.requestFocus();
    }
}
