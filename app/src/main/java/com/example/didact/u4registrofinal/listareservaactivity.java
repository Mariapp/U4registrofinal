package com.example.didact.u4registrofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listareservaactivity extends AppCompatActivity {

    ListView Listvreservas;
    ArrayList<item_reservas>Lista_reservas=new ArrayList <item_reservas>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listareservaactivity);

        cargardatos();

        Listvreservas=(ListView)findViewById(R.id.Listvreservas);


        Adaptadorreservas adaptadorreservas=new Adaptadorreservas(this, Lista_reservas);
        Listvreservas.setAdapter(adaptadorreservas);
        Listvreservas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView <?> adapterView, View view, int i, long l) {

                item_reservas r=((item_reservas)adapterView.getItemAtPosition(i));
                String nombre=r.getNombre();
                String dia=r.getDia();
                String hora=r.getHora();
                int personas=r.getPersonas();
                String observaciones=r.getObservaciones();

                Toast.makeText(getApplicationContext(),"Tu reserva está a nombre de "+nombre+dia+hora+personas+observaciones,
                        Toast.LENGTH_LONG).show();

                return false;
            }
        });






    }

    private void cargardatos(){


        Lista_reservas.add(new item_reservas("Pablo","Miércoles","12",2));
        Lista_reservas.add(new item_reservas("Pablo","Miércoles","12",2));
        Lista_reservas.add(new item_reservas("Pablo","Miércoles","12",2));
        Lista_reservas.add(new item_reservas("Pablo","Miércoles","12",2));
        Lista_reservas.add(new item_reservas("Pablo","Miércoles","12",2));
    }









}
