package com.example.PMDM;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.PMDM.model.Element;

public class ViewElementFragment extends Fragment
{
    public static final String TAG = "ViewElementFragment";

    private ImageView ivImagen;
    private TextView tvTitulo;
    private TextView tvAutor;
    private TextView tvEditorial;
    private TextView tvfecha;
    private TextView tvSinopsis;

    public static Fragment newInstance(Bundle bundle)
    {
        ViewElementFragment fragment = new ViewElementFragment();
        if(bundle != null)
        {
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_view_element, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivImagen = view.findViewById(R.id.imageViewFragment);
        tvTitulo = view.findViewById(R.id.textViewFragmentTitulo);
        tvAutor = view.findViewById(R.id.textViewFragmentAutor);
        tvEditorial = view.findViewById(R.id.textViewFragmentEditorial);
        tvfecha = view.findViewById(R.id.textViewFragmentFecha);
        tvSinopsis = view.findViewById(R.id.textViewFragmentSinopsis);

        if (getArguments() != null) {
            Element element = getArguments().getParcelable(Element.TAG);
            ivImagen.setImageResource(element.getImagen());
            tvTitulo.setText(element.getTitulo());
            tvAutor.setText(element.getAutor());
            tvEditorial.setText(element.getEditorial());
            tvfecha.setText(element.getFecha());
            tvSinopsis.setText(element.getSinopsis());
        }
    }
}
