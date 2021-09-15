package com.example.agendaa;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import com.example.agendaa.R;

public class Add_fragment extends Fragment {
    private TextView txNome;
    private TextView txend;
    private  TextView txtel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add,container,false);

        txNome =(TextView) view.findViewById(R.id.txtNome);
        txend =(TextView) view.findViewById(R.id.txtendereço);
        txtel= (TextView) view.findViewById(R.id.txtelefone);

   
        Bundle bundle =getArguments();

        Contato con =(Contato) bundle.getSerializable("dados");

        txNome.setText(con.getContatoNome());





        return view;
    }
}
