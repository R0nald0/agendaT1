package com.example.agendaa;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import com.example.agendaa.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Tes_fragem extends Fragment {

    private EditText edNome;
    private EditText edEndereco;
    private EditText edTelefone;
    private Button btnSalvar;
    private BottomNavigationView bottomNView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_teste,container,false);



       edNome =(EditText) view.findViewById(R.id.edtnome);
       edEndereco= (EditText)  view.findViewById(R.id.edtendereco);
       edTelefone=(EditText) view.findViewById(R.id.edttelefone);
       bottomNView = (BottomNavigationView) view.findViewById(R.id.bottomNavigationView);

       btnSalvar=(Button) view.findViewById(R.id.btnsalvar);

       btnSalvar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                 FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                 fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

                 Add_fragment add_fragment = new Add_fragment();
                 Bundle bundle = new Bundle();

                 Contato contato = new Contato();

                 contato.setContatoNome(edNome.getText().toString());

                  bundle.putSerializable("dados",contato);
                  add_fragment.setArguments(bundle);
                   fragmentTransaction.replace(R.id.frameLayaouiD, add_fragment);
                    fragmentTransaction.commit();



           }
       });


      return  view;
    }
}
