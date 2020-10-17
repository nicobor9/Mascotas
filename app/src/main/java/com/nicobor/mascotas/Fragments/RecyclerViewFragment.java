package com.nicobor.mascotas.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicobor.mascotas.Adaptador.MascotaAdaptador;
import com.nicobor.mascotas.POJO.Mascota;
import com.nicobor.mascotas.R;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public RecyclerViewFragment() {
    }

    private RecyclerView recyclerViewMascota;
    private MascotaAdaptador adaptadorMascota;

    public static RecyclerViewFragment newInstance(String param1, String param2) {
        RecyclerViewFragment fragment = new RecyclerViewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        recyclerViewMascota = v.findViewById(R.id.rvMascotas);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(getActivity()));

        adaptadorMascota = new MascotaAdaptador(obtenerMascotas());
        recyclerViewMascota.setAdapter(adaptadorMascota);
        return v;
    }

    public ArrayList<Mascota> obtenerMascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Rocka", R.drawable.gato1, 50));
        mascotas.add(new Mascota("Yuli", R.drawable.perro1, 36));
        mascotas.add(new Mascota("Esteban", R.drawable.perro2, 23));
        mascotas.add(new Mascota("Misi", R.drawable.perro3, 18));
        mascotas.add(new Mascota("Rocko", R.drawable.gato2, 19));
        mascotas.add(new Mascota("Lupo", R.drawable.perro4, 12));
        mascotas.add(new Mascota("Esti", R.drawable.gato3, 98));
        mascotas.add(new Mascota("Elque", R.drawable.gato4, 90));
        mascotas.add(new Mascota("Tommy", R.drawable.perro5, 35));

        return mascotas;
    }
}