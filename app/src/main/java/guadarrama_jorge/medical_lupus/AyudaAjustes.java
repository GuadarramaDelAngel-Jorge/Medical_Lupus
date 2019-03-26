package guadarrama_jorge.medical_lupus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AyudaAjustes extends AppCompatActivity {
    public void ViewPPrincipal(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Principal.class);
        startActivityForResult(myIntent, 0);
    }

    public void ViewPAnalisis(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AnalisisDiario.class);
        startActivityForResult(myIntent, 0);
    }

    public void ViewPResultados(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Resultados.class);
        startActivityForResult(myIntent, 0);
    }

    public void ViewPRecordatorios(View view)
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
