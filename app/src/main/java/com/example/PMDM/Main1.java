package com.example.PMDM;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.PMDM.databinding.ActivityMain1Binding;

public class Main1 extends AppCompatActivity implements View.OnClickListener
{
    private ActivityMain1Binding binding;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        binding = ActivityMain1Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.botonConvertir.setOnClickListener(this);
        binding.radioButtonDolaresAeuros.setChecked(true);
        binding.editTextEuros.setEnabled(false);
        binding.radioButtonDolaresAeuros.setOnClickListener(this);
        binding.radioButtonEurosADolares.setOnClickListener(this);

        Double euro;
    }

    @Override
    public void onClick(View view)
    {
        if(view == binding.radioButtonDolaresAeuros)
        {
            binding.editTextEuros.setEnabled(false);
            binding.editTextDolares.setEnabled(true);
        }
        if(view == binding.radioButtonEurosADolares)
        {
            binding.editTextEuros.setEnabled(true);
            binding.editTextDolares.setEnabled(false);
        }
        if(view == binding.botonConvertir)
        {
            if(binding.radioButtonDolaresAeuros.isChecked())
            {
                try
                {
                    Double dolar = Double.parseDouble(String.valueOf(binding.editTextDolares.getText()));
                    Double euro = dolar * 1.21;
                    binding.editTextEuros.setText(euro.toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(Main1.this, "Introduce un numero valido",Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                try
                {
                    Double euro = Double.parseDouble(String.valueOf(binding.editTextEuros.getText()));
                    Double dolar= euro / 1.21;
                    binding.editTextDolares.setText(dolar.toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(Main1.this, "Introduce un numero valido",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
