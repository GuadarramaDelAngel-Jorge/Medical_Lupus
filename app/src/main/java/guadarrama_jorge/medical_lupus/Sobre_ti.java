package guadarrama_jorge.medical_lupus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Sobre_ti extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre_ti);
    }
    public void ViewSPrincipal(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Principal.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewSAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AnalisisDiario.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewSResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Resultados.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewSRecordatorios(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Recordatorios.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewSAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AyudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
    public void GenericToast(View view)
    {
        Toast.makeText(getApplicationContext(), "function not available yet ", Toast.LENGTH_SHORT).show();
    }
}
