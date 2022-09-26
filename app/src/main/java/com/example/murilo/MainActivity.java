package com.example.murilo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);
    }

    Button botao_ir_cadastro = (Button) findViewById(R.id.botao_ir_cadastro);

    botao_ir_cadastro.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent it = new Intent(MainActivity.this, NovaTela.class);
            startActivity(it);
        }
    });
}