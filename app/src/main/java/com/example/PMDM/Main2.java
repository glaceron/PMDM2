package com.example.PMDM;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.PMDM.databinding.ActivityMain2Binding;

import java.util.List;

public class Main2 extends AppCompatActivity implements View.OnClickListener, ListAdapter.OnItemClickListener {

    List<ListElement> elements;
    private ActivityMain2Binding binding;
    private AlertDialog.Builder popup;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        this.popup=new AlertDialog.Builder(this);

        elements = ListElement.createContactList();
        adapter = new ListAdapter(elements);
        binding.listaReciclerView.setAdapter(adapter);
        binding.listaReciclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

    }

    @Override
    public void onItemClick(View itemView, int position)
    {
        String autor = elements.get(position).getAutor();
        String fecha = elements.get(position).getFecha();
        String titulo = elements.get(position).getTitulo();

        popup.setTitle(titulo);
        popup.setMessage("Autor:" + autor + "\nFecha: " + fecha);
        popup.setPositiveButton("Ok", null);
        popup.show();
    }
}
