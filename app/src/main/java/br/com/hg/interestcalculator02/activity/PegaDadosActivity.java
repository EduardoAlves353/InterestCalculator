package br.com.hg.interestcalculator02.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

import br.com.hg.interestcalculator02.R;
import br.com.hg.interestcalculator02.utils.DatePickerDialogHelper;

public class PegaDadosActivity extends AppCompatActivity {

    private EditText valorEditText;
    private EditText jurosEditText;
    private EditText multaEditText;
    private EditText dataPagamento;
    private EditText dataVencimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pega_dados);

        valorEditText = (EditText) findViewById(R.id.valorPegaDados);
        dataVencimento = (EditText) findViewById(R.id.dataVencimentoPegaDados);
        dataPagamento = (EditText) findViewById(R.id.dataPagamentoPegaDados);
        jurosEditText = (EditText) findViewById(R.id.jurosPegaDados);
        multaEditText = (EditText) findViewById(R.id.multaPegaDados);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DatePickerDialogHelper.setDatePickerDialog(dataPagamento, this, simpleDateFormat);
        DatePickerDialogHelper.setDatePickerDialog(dataPagamento, this, simpleDateFormat);

        Button salvar_dados = findViewById(R.id.salvarButtonPegaDados);
        salvar_dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiProResultado = new Intent(PegaDadosActivity.this, ResultadoActivity.class);


                double valorET = Double.parseDouble(valorEditText.getText().toString());
                double jurosET = Double.parseDouble(jurosEditText.getText().toString());
                double multaET = Double.parseDouble(multaEditText.getText().toString());

                vaiProResultado.putExtra("VALOR", valorET);
                vaiProResultado.putExtra("JUROS", jurosET);
                vaiProResultado.putExtra("MULTA", multaET);

                startActivity(vaiProResultado);
            }
        });
    }
}
