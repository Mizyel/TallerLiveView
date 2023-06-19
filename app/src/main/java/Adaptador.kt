import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.tallerliveview.R

class Adaptador: BaseAdapter {


    //Atributos
    lateinit var contexto:Context
    var layout:Int=0
    lateinit var listaPersonas:List<Persona>

    /**
     * constructor que inicializa el objeto
     */

    constructor(context: Context,layout:Int,listaPersona:List<Persona>){
        this.contexto=contexto
        this.layout=layout
        this.listaPersonas=listaPersona
    }

    /**
     * obtiene el tamaño de la lista del adaptador
     */
    override fun getCount(): Int {
        return listaPersonas.size
    }


    /**
     * obtiene el item del elmento de acuerdo aposicion
     */

    override fun getItem(posicion: Int): Any {
        return listaPersonas[posicion]
    }

    override fun getItemId(posicion: Int): Long {
        return posicion.toLong()
    }

    /**
     * terona la vsta con los elementos
     */
    override fun getView(posicion: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
        var v:View
        var inflater:LayoutInflater= LayoutInflater.from(contexto)

        v=inflater.inflate(R.layout.elementopersona,null)
        val txtNombre:TextView=v.findViewById(R.id.txtNombre)
        txtNombre.text=listaPersonas[posicion].nombre
        val txtTelefono:TextView=v.findViewById(R.id.txtTelefono)
        txtTelefono.text = listaPersonas[posicion].celular
        val imgFoto:ImageView=v.findViewById(R.id.imgFoto)
        imgFoto.setImageResource(listaPersonas[posicion].foto)
        return v
    }
}