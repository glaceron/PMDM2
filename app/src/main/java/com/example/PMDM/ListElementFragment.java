package com.example.PMDM;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.PMDM.adapter.ElementAdapter;
import com.example.PMDM.model.Element;

import java.util.ArrayList;

public class ListElementFragment extends Fragment
{
    public static final String TAG = "ListElementFragment";
    private RecyclerView rvelement;
    private RecyclerView.Adapter adapterelement;
    private ElementAdapter.OnItemClickListener listener;
    private ListElementFragmentCallback callback;

    interface ListElementFragmentCallback
    {
        void onElementView(Element element);
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        try
        {
            callback = (ListElementFragmentCallback) context;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(context.toString() + "must implement ListElementFragmentCallback");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_listelement,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view,@Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<Element> elements = new ArrayList<>();
        elements.add(new Element(R.drawable.quijote, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", "1605", "El ingenioso hidalgo don Quijote de la Mancha narra las aventuras de Alonso Quijano, un hidalgo pobre que de tanto leer novelas de caballería acaba enloqueciendo y creyendo ser un caballero andante, nombrándose a sí mismo como don Quijote de la Mancha."));
        elements.add(new Element(R.drawable.tambor, "El tambor de hojalata", "Günter Grass", "Danzig Trilogy", "1959", "La novela es contada desde la perspectiva de su protagonista,Oscar Matzerath, un enano deforme que voluntariamente decidió dejar de crecer al cumplir los tres años. Nos cuenta su historia desde la habitación de un sanatorio y nos lleva de la mano para descubrir una Alemania asolada por el nazismo y la intolerancia."));
        elements.add(new Element(R.drawable.gilga, "Poema de Gilgamesh", "Anónimo", "Sîn-lēqi-unninni", "2100 a.C.", "El poema cuenta la historia de las aventuras del rey Gilgamesh de Uruk."));
        elements.add(new Element(R.drawable.divina, "Divina Comedia", "Dante Alighieri", "-", "1304", "La Divina Comedia relata el viaje de Dante por el Infierno, el Purgatorio y el Paraíso, guiado por el poeta romano Virgilio. "));
        elements.add(new Element(R.drawable.cocina, "La buena cocina", "Karlos Arguiñano", "Editorial Planeta", "2018", "En este nuevo recetario de Karlos Arguiñano descubrirás qué ingredientes usar en tu día a día cuidando tu salud y con lo que tengas más a mano en la despensa o el frigorífico."));
        elements.add(new Element(R.drawable.blanco, "Rey blanco", "Juan Gómez-Jurado", "B", "2019", "¿JUGAMOS? Cuando Antonia Scott recibe este mensaje, sabe muy bien quién se lo envía. También sabe que ese juego es casi imposible de ganar. Pero a Antonia no le gusta perder. Después de todo este tiempo huyendo, la realidad ha acabado alcanzándola. Antonia es cinturón negro en mentirse a sí misma, pero ahora tiene claro que si pierde esta batalla, las habrá perdido todas. -La reina es la figura más poderosa del tablero -dice el Rey Blanco-. Pero por poderosa que sea una pieza de ajedrez, nunca debe olvidar que hay una mano que la mueve. -Eso ya lo veremos-, responde Antonia"));
        elements.add(new Element(R.drawable.linea, "Línea de fuego", "Arturo Pérez-Reverte", "Alfaguara", "2020", "Julio de 1938, miles de jóvenes combaten en la trágica batalla del Ebro. Sus nombres no son los que recuerda la Historia, pero cuanto les sucedió forma parte de nuestra memoria."));
        elements.add(new Element(R.drawable.oceano, "Un Océano para llegar a ti", "Sandra Barneda", "Editorial Planeta", "2019", "Una novela tierna y atrevida sobre los secretos familiares y las emociones silenciadas."));
        elements.add(new Element(R.drawable.roja, "Reina roja", "Juan Gómez-Jurado", "B", "2019", "Nunca ha empuñado un arma ni llevado una placa, y, sin embargo, ha resuelto decenas de crímenes."));

        rvelement = view.findViewById(R.id.rvelement);
        rvelement.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));

        listener = new ElementAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClick(Element element)
            {
                callback.onElementView(element);
            }
        };
        adapterelement = new ElementAdapter(elements,listener);
        rvelement.setAdapter(adapterelement);
    }
}
