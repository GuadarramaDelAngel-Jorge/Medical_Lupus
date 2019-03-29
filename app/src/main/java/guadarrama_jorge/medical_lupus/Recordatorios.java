package guadarrama_jorge.medical_lupus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Recordatorios extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordatorios);
    }
    public void ViewPPrincipal(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Principal.class);
        startActivityForResult(myIntent, 0);
    }
    public void GenericToast(View view)
    {
        Toast.makeText(getApplicationContext(), "function not available yet ", Toast.LENGTH_SHORT).show();
    }
}
