package com.samsung.business.obserwator;

import android.graphics.Color;

import android.widget.ImageView;

public class Latarnia implements Obserwujacy {

    private boolean wlaczony;
    private final ImageView latarnia;

    public Latarnia(boolean wlaczony, ImageView latarnia) {
        this.wlaczony = wlaczony;
        this.latarnia = latarnia;
    }

    @Override
    public void aktualizuj(boolean wlaczony) {
        this.wlaczony = wlaczony;
        if(wlaczony) {
            latarnia.setColorFilter(null);
        }else{
            latarnia.setColorFilter(Color.BLACK,android.graphics.PorterDuff.Mode.SRC_IN);
        }
    }
}
