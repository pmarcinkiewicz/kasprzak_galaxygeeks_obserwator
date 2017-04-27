package com.samsung.business.obserwator;

public interface Obserwowany {
    void zarejestrujObserwatora(Obserwujacy obserwujacy);
    void usunObserwatora(Obserwujacy obserwujacy);
    void powiadomObserwatorow(boolean wartosc);
}
