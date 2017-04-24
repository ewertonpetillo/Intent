package com.ewertonpetillo.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button b = new Button(this);
        b.setText("Clique aqui para abrir nova tela.");
        b.setOnClickListener(this);
        setContentView(b);


    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, Tela2.class);
        Bundle params = new Bundle();
        params.putString("MSG", "Olá");
        it.putExtras(params);
        startActivity(it);
        Log.i("Teste", "metodo OnClick");
    }
}
