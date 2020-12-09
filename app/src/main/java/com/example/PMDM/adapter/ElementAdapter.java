package com.example.PMDM.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;


import com.example.PMDM.R;
import com.example.PMDM.model.Element;

import java.util.List;

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ElementViewHolder> {

    private List<Element> list;
    private OnItemClickListener listener;

    public interface OnItemClickListener
    {
        void onItemClick(Element element);
    }

    public ElementAdapter(List<Element> list, OnItemClickListener listener)
    {
        this.list = list;
        this.listener = listener;
    }

    @Override
    public ElementViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_element,parent,false);
        return new ElementViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ElementViewHolder holder, int position)
    {
        Element element = list.get(position);
        holder.titulo.setText(element.getTitulo());
        holder.imagen.setImageResource(element.getImagen());
        holder.bind(list.get(position), listener);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ElementViewHolder extends RecyclerView.ViewHolder
    {
        public TextView titulo;
        public ImageView imagen;

        public ElementViewHolder(View itemView)
        {
            super(itemView);
            titulo = itemView.findViewById(R.id.textViewTitulo);
            imagen = itemView.findViewById(R.id.imageView);
        }

        public void bind(final Element element, final OnItemClickListener listener)
        {
            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    listener.onItemClick(element);
                }
            });
        }
    }
}
