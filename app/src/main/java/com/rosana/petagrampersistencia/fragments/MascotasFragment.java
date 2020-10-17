package com.rosana.petagrampersistencia.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rosana.petagrampersistencia.classes.Mascota;
import com.rosana.petagrampersistencia.R;
import com.rosana.petagrampersistencia.adapters.MascotaAdaptador;
import com.rosana.petagrampersistencia.presentador.IMascotasFragmentPresenter;
import com.rosana.petagrampersistencia.presentador.IRankingFragmentPresenter;
import com.rosana.petagrampersistencia.presentador.MascotasFragmentPresenter;
import com.rosana.petagrampersistencia.presentador.RankingFragmentPresenter;

import java.util.ArrayList;

public class MascotasFragment extends Fragment implements IMascotasFragmentView {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private IMascotasFragmentPresenter iMascotasFragmentPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);
        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        iMascotasFragmentPresenter = new MascotasFragmentPresenter( this, getContext() );
        iMascotasFragmentPresenter.obtenerMascotasBD();
        generateLinearLayot();

        return v;
    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.bianca, "Bianca", 5) );
        mascotas.add( new Mascota(R.drawable.dolly, "Dolly", 1) );
        mascotas.add( new Mascota(R.drawable.jack, "Jack", 2) );
        mascotas.add( new Mascota(R.drawable.jinjan, "Jinjan", 11) );
        mascotas.add( new Mascota(R.drawable.loki, "Loki", 10) );
        mascotas.add( new Mascota(R.drawable.nemo, "Nemo", 4) );
        mascotas.add( new Mascota(R.drawable.peco, "Peco", 20) );
        mascotas.add( new Mascota(R.drawable.sol, "Sol", 2) );
    }

    @Override
    public void generateLinearLayot() {
        LinearLayoutManager llm = new LinearLayoutManager( getContext() );
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador generateMascotaAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador( mascotas );
        return mascotaAdaptador;
    }

    @Override
    public void initAdaptadorRV(MascotaAdaptador adaptador) {
        rvMascotas.setAdapter( adaptador );
    }
}
