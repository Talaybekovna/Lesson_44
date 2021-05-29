package kg.tutorialapp.l44_rv_setonclicklistener

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.l44_rv_setonclicklistener.MyAdapter.Type.ADVERTISMENT
import kg.tutorialapp.l44_rv_setonclicklistener.MyAdapter.Type.ITEM

class MyAdapter(private val listener: OnClickListener) : RecyclerView.Adapter<BaseViewHolder<Any>>() {
    private val items = arrayListOf<Any>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Any> {
        return when(viewType){
            ITEM -> MyViewHolder.create(parent, listener)
            else -> AdViewHolder.create(parent, listener) // ADVERTISMENT
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Any>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.count()


    override fun getItemViewType(position: Int): Int {
        return  when (items[position]) {
            is String -> ADVERTISMENT
            is Item -> ITEM
            else -> -1
        }
    }

    fun setNewItems (newItems: List<Any>){
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    object Type {
        const val ITEM = 0
        const val ADVERTISMENT = 1
    }

    interface OnClickListener{
        fun onItemClick(position: Int)
        fun onAdClick(position: Int)
        fun onButtonClick(position: Int)
    }
}