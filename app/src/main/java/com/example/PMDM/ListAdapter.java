package com.example.PMDM;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.PMDM.databinding.ListElementBinding;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>
{
    private List<ListElement> mData;

    public interface OnItemClickListener
    {
        void onItemClick(View itemView, int position);
    }

    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        this.listener = listener;
    }

    public ListAdapter(List<ListElement> itemList)
    {
        mData = itemList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ListElementBinding binding;

        public ViewHolder(ListElementBinding b)
        {
            super(b.getRoot());
            binding = b;
            binding.linearLayout.setOnClickListener(this);
        }
        @Override
        public void onClick(View view)
        {
            // Triggers click upwards to the adapter on click
            if (listener != null)
            {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(itemView, position);
                }
            }
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new ViewHolder(ListElementBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        ListElement listElement = mData.get(position);

        holder.binding.textViewTitulo.setText(listElement.getTitulo());
        holder.binding.imageView.setImageResource(listElement.getImagen());
    }

    public int getItemCount()
    {
        return mData.size();
    }


}
