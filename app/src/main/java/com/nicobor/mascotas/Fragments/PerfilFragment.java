package com.nicobor.mascotas.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nicobor.mascotas.Adaptador.PerfilAdaptador;
import com.nicobor.mascotas.POJO.Perfil;
import com.nicobor.mascotas.R;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public PerfilFragment() {
        // Required empty public constructor
    }

    private RecyclerView rvPerfil;
    private PerfilAdaptador perfilAdaptador;

    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
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
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        rvPerfil = v.findViewById(R.id.rvPerfil);

        GridLayoutManager  glm = new GridLayoutManager(getActivity(),2);
        rvPerfil.setLayoutManager(glm);
        perfilAdaptador = new  PerfilAdaptador(obtenerPerfil());
        rvPerfil.setAdapter(perfilAdaptador);

        return v;
    }

    public ArrayList<Perfil> obtenerPerfil() {
        ArrayList<Perfil> fotos = new ArrayList<>();
        fotos.add(new Perfil(R.drawable.gato1, 125));
        fotos.add(new Perfil(R.drawable.gato1, 236));
        fotos.add(new Perfil(R.drawable.gato1, 23));
        fotos.add(new Perfil(R.drawable.gato1, 198));
        fotos.add(new Perfil(R.drawable.gato1, 18));
        fotos.add(new Perfil(R.drawable.gato1, 112));
        fotos.add(new Perfil(R.drawable.gato1, 98));
        fotos.add(new Perfil(R.drawable.gato1, 9));
        fotos.add(new Perfil(R.drawable.gato1, 325));

        return fotos;
    }
}