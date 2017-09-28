package br.ex4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ConversorDolar extends Activity {
	
	private EditText textCotacao;
	private EditText textValor;
	private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_dolar);
        
        textCotacao = (EditText) findViewById(R.id.editCotacao);
        textValor = (EditText) findViewById(R.id.editValor);
        textResultado = (TextView) findViewById(R.id.textResultado);
    }
    
    public void Converter(View Converter){
    	
    	float a, b, res;
    	
    	a = Float.parseFloat(textCotacao.getText().toString());
    	b = Float.parseFloat(textValor.getText().toString());
    	
    	res = a * b;
    	
    	textResultado.setText(String.valueOf(res));
    	
    	textCotacao.setText(null);
    	textValor.setText(null);
    	
    	
    	textCotacao.requestFocus();
    }
}
