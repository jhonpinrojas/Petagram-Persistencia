package com.jhon.petagram.fragment;

import com.jhon.petagram.adaptadores.ContactoAdapter;
import com.jhon.petagram.pojo.Contacto;

import java.util.ArrayList;

public interface ReciclerviewFragmentview {
    public void generarLinearLayout();

    public ContactoAdapter crearadaptador(ArrayList<Contacto> contactos);

    public void InicializarAdaptadorRV(ContactoAdapter adaptador);
}