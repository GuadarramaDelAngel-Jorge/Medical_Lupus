package guadarrama_jorge.medical_lupus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }
    public void ViewPLogin(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Principal.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPHome(View view)
    {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }
}
