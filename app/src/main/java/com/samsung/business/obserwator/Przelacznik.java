package com.samsung.business.obserwator;


import android.widget.ToggleButton;

import java.util.ArrayList;

public class Przelacznik implements Obserwowany {

    ArrayList<Obserwujacy> obserwatorzy = new ArrayList<>();
    ToggleButton toggleButton;


    public Przelacznik(ToggleButton toggleButton) {
        this.toggleButton = toggleButton;
    }

    @Override
    public void zarejestrujObserwatora(Obserwujacy obserwujacy) {
        if(obserwatorzy.indexOf(obserwujacy) == -1){
            obserwatorzy.add(obserwujacy);
        }
    }

    @Override
    public void usunObserwatora(Obserwujacy obserwujacy) {
        if(obserwatorzy.indexOf(obserwujacy) != -1){
            obserwatorzy.remove(obserwujacy);
        }
    }

    @Override
    public void powiadomObserwatorow(boolean wartosc) {
        for(Obserwujacy obserwujacy : obserwatorzy){
            obserwujacy.aktualizuj(wartosc);
        }

    }
}
