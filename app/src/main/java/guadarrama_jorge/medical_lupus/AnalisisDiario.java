package guadarrama_jorge.medical_lupus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AnalisisDiario extends AppCompatActivity {

    public void ViewPPrincipal(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Principal.class);
        startActivityForResult(myIntent, 0);
    }

    public void ViewAAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AnalisisDiario.class);
        startActivityForResult(myIntent, 0);
    }

    public void ViewAResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Resultados.class);
        startActivityForResult(myIntent, 0);
    }

    public void ViewARecordatorios(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Recordatorios.class);
        startActivityForResult(myIntent, 0);
    }

    public void ViewPAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AyudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
}

