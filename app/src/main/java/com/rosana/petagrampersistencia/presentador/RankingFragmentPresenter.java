package com.rosana.petagrampersistencia.presentador;

import android.content.Context;

import com.rosana.petagrampersistencia.classes.Mascota;
import com.rosana.petagrampersistencia.db.ConstructorRanking;
import com.rosana.petagrampersistencia.fragments.IRankingFragmentView;

import java.util.ArrayList;

public class RankingFragmentPresenter implements IRankingFragmentPresenter {

    private IRankingFragmentView iRankingFragmentView;
    private Context context;
    private ConstructorRanking constructorRanking;
    private ArrayList<Mascota> ranking;

    public RankingFragmentPresenter(IRankingFragmentView iRankingFragmentView, Context context) {
        this.iRankingFragmentView = iRankingFragmentView;
        this.context = context;
    }

    @Override
    public void obtenerRankingBD() {
        constructorRanking = new ConstructorRanking( context );
        ranking = constructorRanking.getRanking();
        mostrarRanking();
    }

    @Override
    public void mostrarRanking() {
        iRankingFragmentView.initAdaptadorRV( iRankingFragmentView.generateMascotaAdaptador( ranking ) );
        iRankingFragmentView.generateLinearLayot();
    }
}
