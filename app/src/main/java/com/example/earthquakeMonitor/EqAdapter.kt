package com.example.earthquakeMonitor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.earthquakeMonitor.databinding.EqListItemBinding

class EqAdapter(val earthquakes: MutableList<Earthquake>):RecyclerView.Adapter<EqAdapter.EqViewHolder>() {

    //el parametro, es el layout del item
    class EqViewHolder(private var binding: EqListItemBinding):RecyclerView.ViewHolder(binding.root){
        //val magnitudeText=view.findViewById<TextView>(R.id.eq_magnitude_text)
        val magnitudeText=binding.eqMagnitudeText
        val placeText=binding.eqPlaceText

        fun bind(earthquake: Earthquake){
            magnitudeText.text=earthquake.magnitude.toString()
            placeText.text=earthquake.place


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EqViewHolder {
        //agrego dataBinding y saco el findViewById
        val binding= EqListItemBinding.inflate(LayoutInflater.from(parent.context))


        return EqViewHolder(binding)

    }

    override fun onBindViewHolder(holder: EqViewHolder, position: Int) {

        val earthquake= earthquakes[position]
        holder.bind(earthquake)
    }

    override fun getItemCount() = earthquakes.size
}

/**

//SIN DATABINDING
class EqAdapter(val earthquakes: MutableList<Earthquake>):RecyclerView.Adapter<EqAdapter.EqViewHolder>() {

//el parametro, es el layout del item
class EqViewHolder(view:View):RecyclerView.ViewHolder(view){
val magnitudeText=view.findViewById<TextView>(R.id.eq_magnitude_text)
val placeText=view.findViewById<TextView>(R.id.eq_place_text)

}

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EqViewHolder {
val view:View = LayoutInflater.from(parent.context).inflate(R.layout.eq_list_item,parent,false)

return EqViewHolder(view)

}

override fun onBindViewHolder(holder: EqViewHolder, position: Int) {

val earthquake= earthquakes[position]
holder.magnitudeText.text=earthquake.magnitude.toString()
holder.placeText.text=earthquake.place
}

override fun getItemCount() = earthquakes.size
}


 * */