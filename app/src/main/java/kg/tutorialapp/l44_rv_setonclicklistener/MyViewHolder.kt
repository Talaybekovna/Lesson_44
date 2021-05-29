package kg.tutorialapp.l44_rv_setonclicklistener

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MyViewHolder(itemView: View): BaseViewHolder<Any>(itemView) {

    companion object{
        fun create(parent: ViewGroup): MyViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_my_viewholder, parent, false)
            return MyViewHolder(view)
        }
    }

    override  fun bind(item: Any) {
        item as Item
        itemView.run {
            val iv_icon= findViewById<ImageView>(R.id.iv_icon)
            val tv_name = findViewById<TextView>(R.id.tv_name)
            iv_icon.setImageResource(item.icon)
            tv_name.text = item.name
        }
    }
}