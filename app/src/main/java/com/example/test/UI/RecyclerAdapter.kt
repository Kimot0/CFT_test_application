package com.example.test.UI

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.test.Domain.Entity.RandomUser
import com.example.test.databinding.ItemPersonCardBinding

class RecyclerAdapter(
    private val onItemClick: (Int) -> Unit
) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    private var dataList: MutableList<RandomUser> = mutableListOf()

    inner class RecyclerViewHolder(
        private val binding: ItemPersonCardBinding,
        private val onItemClick: (Int) -> Unit
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(data: RandomUser){
            val spanFio = SpannableStringBuilder("FIO: ${data.name}").apply {
                setSpan(StyleSpan(Typeface.BOLD),0,4,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            val spanPhone = SpannableStringBuilder("Phone number: " + data.phone).apply {
                setSpan(StyleSpan(Typeface.BOLD),0,13,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            val spanAddress = SpannableStringBuilder("Address: " + data.location).apply {
                setSpan(StyleSpan(Typeface.BOLD),0,8,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
            with(binding){
                picture.load(data.picture){
                    crossfade(true)
                    transformations(CircleCropTransformation())
                }
                fio.text = spanFio
                phone.text = spanPhone
                addres.text = spanAddress
                root.setOnClickListener{
                    onItemClick(adapterPosition)
                }
            }
        }
    }

    fun setUpdatedData(dataList: List<RandomUser>) {
        this.dataList.clear()
        this.dataList.addAll(dataList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            ItemPersonCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onItemClick
        )
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
}