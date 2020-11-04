package com.amril.amrilsubmission

//import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class CaturAcrobaticAdapter : RecyclerView.Adapter<CaturAcrobaticAdapter.CaturAcrobaticViewHolder>() {

    private var data: List<CaturAcrobatic> = ArrayList()

    class CaturAcrobatic {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaturAcrobaticViewHolder {
        return CaturAcrobaticViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_caturacrobatic_list_item, parent, false)
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: CaturAcrobaticViewHolder, position: Int) =
        holder.bind(data[position])

    fun swapData(data: List<CaturAcrobatic>) {
        this.data = data
        notifyDataSetChanged()
    }

    class CaturAcrobaticViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CaturAcrobatic) = with(itemView) {
            // TODO: Bind the data with View
            setOnClickListener {
                // TODO: Handle on click
            }
        }
    }
}