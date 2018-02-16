package com.example.didact.u4registrofinal; /**
 * Created by DIDACT on 16/02/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.didact.u4registrofinal.R;
import com.example.didact.u4registrofinal.item_reservas;

import java.util.ArrayList;

 public class Adaptadorreservas extends ArrayAdapter<item_reservas> {
    ArrayList<item_reservas> reservas;
    Context c;
    public Adaptadorreservas(Context c, ArrayList<item_reservas> coches) {
        super(c, R.layout.item_reservas, coches);
        this.reservas = coches;
        this.c = c;
    }
    public View getView(int position, View view, ViewGroup
            viewGroup) {
        LayoutInflater inflater =
                LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_reservas, null);

        TextView tvnombre = (TextView)
                item.findViewById(R.id.tvnombre);
        tvnombre.setText(reservas.get(position).getNombre() );

        TextView tvdia = (TextView)
                item.findViewById(R.id.tvdia);
        tvdia.setText(reservas.get(position).getDia() );

        TextView tvpersonas = (TextView)
                item.findViewById(R.id.tvpersonas);
        tvpersonas.setText(reservas.get(position).getPersonas()+"");

        TextView tvobs = (TextView)
                item.findViewById(R.id.tvobs);
        tvobs.setText(reservas.get(position).getObservaciones() );

        TextView tvhora = (TextView)
                item.findViewById(R.id.tvhora);
        tvhora.setText(reservas.get(position).getHora() );
        return item;
    }
}