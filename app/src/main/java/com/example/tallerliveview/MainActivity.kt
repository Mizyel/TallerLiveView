package com.example.tallerliveview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //crear el objeto ListView con el elemento creado en el layout
        val listapersonas:ListView=findViewById(R.id.listaPersonas)
            //crar una lista mutable vacia de tipo personas
        var personas = mutableListOf<Persona>()
        //crear objetos personas
        var per1= Persona("Duvan Cataño","312335",R.drawable.img1)
        var per2= Persona("Santiago Vargas","312335",R.drawable.img2)
        var per3= Persona("Sebastian Castañeda","312335",R.drawable.img3)
        var per4= Persona("Juan Esteban Ortiz","312335",R.drawable.img1)
            //agregamos los objetos personas a la lista personas
        personas.add(per1)
        personas.add(per2)
        personas.add(per3)
        personas.add(per4)
        personas.add(per1)
        personas.add(per2)
        personas.add(per3)
        personas.add(per4)

            //crear un adaptador asociado con la ctivity, con un layout
            //prederterminado y con los datos
        val adaptador: Adaptador = Adaptador(this,R.layout.elementopersona,personas)
            //al objeto ListView llamado listarpersonas adignarle como adapter el adaptador creado
        listapersonas.adapter = adaptador
            //respuesta al evento click en una item de la lista
        listapersonas.setOnItemClickListener { adapterView, view, posicion, id ->
            Toast.makeText(this@MainActivity,
                "Click en posición $posicion, con nombre: " +
                        personas[posicion].nombre, Toast.LENGTH_SHORT).show()
        }
    }
}