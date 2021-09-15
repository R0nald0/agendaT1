package com.example.agendaa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_home extends Fragment {
    private ListView lista;
    private String[] contato={

            "contato1","contato2","contato3"
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_home, container, false);


        lista = view.findViewById(R.id.listact);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(

                view.getContext(), android.R.layout.simple_list_item_1,contato
        );

        lista.setAdapter(adapter);

        return view;
    }
}
