package br.com.fiap.mob.cadastropessoa;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void cadastrarPessoaFisica(View v){
        Intent i = new Intent(this, CadastroPessoaFisicaActivity.class);
        startActivity(i);

    }

    public void cadastrarPessoaJuridica(View v){
        Intent i = new Intent(this,CadastroPessoaJuridicaActivity.class);
        startActivity(i);
    }




}
