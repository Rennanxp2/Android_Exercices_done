package br.app.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Rodizio extends Activity {

	private EditText editText2;
	private TextView resultado;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rodizio);
        
        editText2 = (EditText) findViewById(R.id.editText2);
        resultado = (TextView) findViewById(R.id.txtResultado);
    }
    
    public void Calcular (View btn){
    	
    	String placa;
    	char c;
    	
    	placa = editText2.getText().toString();
    	
    	c = placa.charAt(placa.length()-1);
    	
    	switch(c){
    		
    	case '1':
    	case '2': resultado.setText(String.valueOf("2ª Feira"));
    	break;
    	case '3':
    	case '4': resultado.setText(String.valueOf("3ª Feira"));
    	break;
    	case '5':
    	case '6': resultado.setText(String.valueOf("4ª Feira"));
    	break;
    	case '7':
    	case '8': resultado.setText(String.valueOf("5ª Feira"));
    	break;
    	case '9':
    	case '0': resultado.setText(String.valueOf("6ª Feira"));
    	break;
    	default : resultado.setText(String.valueOf("Placa Invalida!"));  
    	}
    	
    }
}
