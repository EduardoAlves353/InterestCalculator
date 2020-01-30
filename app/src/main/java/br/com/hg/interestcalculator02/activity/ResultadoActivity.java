package br.com.hg.interestcalculator02.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.hg.interestcalculator02.R;

public class ResultadoActivity extends AppCompatActivity {

    private TextView valorR;
    private TextView jurosR;
    private TextView multaR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        valorR = findViewById(R.id.valorResultado);
        jurosR = findViewById(R.id.jurosResultado);
        multaR = findViewById(R.id.multaResultado);

        Intent intent = getIntent();
        double valor = intent.getDoubleExtra("VALOR", 0);
        double juros = intent.getDoubleExtra("JUROS", 0);
        double multa = intent.getDoubleExtra("MULTA", 0);

        Locale locale = new Locale("pt", "BR");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
    }
}
