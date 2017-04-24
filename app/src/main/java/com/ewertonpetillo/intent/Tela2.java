package com.ewertonpetillo.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView view = new TextView(this);
        view.setText("Esta é a Tela 2");
        setContentView(view);

        Intent it = getIntent();
        if (it !=  null) {
            Bundle params = it.getExtras();
            if(params != null){
                String msg = params.getString("MSG");
                Log.i("TESTE", "Mensagem: "+msg);
            }
        }

    }
}
