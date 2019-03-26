package guadarrama_jorge.medical_lupus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;


public class Resultados extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);
    }
    public void ViewRHome(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Principal.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRDAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AyudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AnalisisDiario.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Resultados.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRRecordatorios(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Recordatorios.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewRBSintoma(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
    }
    public void ViewRBResultado(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();;
    }
    public void ViewRExportar(View view)
    {
        Toast.makeText(getApplicationContext(), "function not yet available", Toast.LENGTH_SHORT).show();
    }
}

