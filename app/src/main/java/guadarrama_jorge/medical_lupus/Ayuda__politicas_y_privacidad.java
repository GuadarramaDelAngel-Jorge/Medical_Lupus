package guadarrama_jorge.medical_lupus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class Ayuda__politicas_y_privacidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayuda__politicas_y_privacidad);


        WebView algo = (WebView) findViewById(R.id.webview);
        algo.getSettings().setJavaScriptEnabled(true);
        algo.getSettings().setBuiltInZoomControls(true);
        algo.loadUrl("https://rentealo.com/aviso-de-privacidad");
    }

    public void ViewPLogin(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Ayuda__politicas_y_privacidad.class);
        startActivityForResult(myIntent, 0);
    }
    public void ViewPAyuda(View view)
    {
        Intent myIntent = new Intent(view.getContext(), AyudaAjustes.class);
        startActivityForResult(myIntent, 0);
    }
}
