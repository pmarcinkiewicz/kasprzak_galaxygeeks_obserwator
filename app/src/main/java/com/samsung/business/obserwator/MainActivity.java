package com.samsung.business.obserwator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Latarnia> listaLatarni = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Przelacznik przelacznik = zadeklarujPrzelacznik();

        zadeklarujLatarnie();

        for(Latarnia latarnia : listaLatarni){
            podlaczSieDoPrzelacznika(przelacznik, latarnia);
        }
    }

    private Przelacznik zadeklarujPrzelacznik() {
        final Przelacznik przelacznik = new Przelacznik((ToggleButton)findViewById(R.id.toggleButton));

        ((ToggleButton) findViewById(R.id.toggleButton)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                przelacznik.powiadomObserwatorow(isChecked);
            }
        });
        return przelacznik;
    }

    private void podlaczSieDoPrzelacznika(Przelacznik przelacznik, Latarnia latarnia) {
        przelacznik.zarejestrujObserwatora(latarnia);
    }

    private void zadeklarujLatarnie() {
        listaLatarni.add(new Latarnia(true, (ImageView)findViewById(R.id.imageView)));
        listaLatarni.add(new Latarnia(true, (ImageView)findViewById(R.id.imageView2)));
        listaLatarni.add(new Latarnia(true, (ImageView)findViewById(R.id.imageView3)));
        listaLatarni.add(new Latarnia(true, (ImageView)findViewById(R.id.imageView4)));
        listaLatarni.add(new Latarnia(true, (ImageView)findViewById(R.id.imageView5)));
    }
}
