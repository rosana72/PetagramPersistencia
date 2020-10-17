package com.rosana.petagrampersistencia.fragments;

import com.rosana.petagrampersistencia.adapters.MascotaAdaptador;
import com.rosana.petagrampersistencia.classes.Mascota;

import java.util.ArrayList;

public interface IRankingFragmentView {

    public void generateLinearLayot();
    public MascotaAdaptador generateMascotaAdaptador(ArrayList<Mascota> mascotas );
    public void initAdaptadorRV( MascotaAdaptador adaptador );

}
