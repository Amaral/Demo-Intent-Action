package br.com.fiap.mob.cadastropessoa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class CadastroPessoaJuridicaActivity extends ActionBarActivity {

    private EditText etNome, etCNPJ, etEmail, etSite, etTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa_juridica);
        etNome = (EditText) findViewById(R.id.etNome);
        etCNPJ = (EditText) findViewById(R.id.etCnpj);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etSite = (EditText) findViewById(R.id.etSite);
        etTelefone = (EditText) findViewById(R.id.etTelefone);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cadastro_pessoa_juridica, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_gravar) {

            Toast.makeText(this, getString(R.string.msg_contato_salvo), Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void telefonar(View v) {
        String telefone = etTelefone.getText().toString();
        Uri uri = Uri.parse("tel://" + telefone);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void enviarEmail(View v) {
        String email = etEmail.getText().toString();
        Intent i = new Intent(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:" + email));
        startActivity(i);
    }

    public void acessarSite(View v) {
        String site = etSite.getText().toString();
        if (!site.startsWith("http://")) {
            site = "http://" + site;
        }
        Uri url = Uri.parse(site);
        Intent i = new Intent(Intent.ACTION_VIEW, url);
        startActivity(i);
    }
}
