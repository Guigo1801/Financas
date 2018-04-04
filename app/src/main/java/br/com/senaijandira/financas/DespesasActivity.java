package br.com.senaijandira.financas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class DespesasActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String [] lista = {"lazer", "Transporte", "Saude", "Moradia", "Salario", "Outros"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesas);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void cadastrarGasto(View v) {

        Intent intent = new Intent(this, LancamentosActivity.class);
        startActivity(intent);
    }
}
