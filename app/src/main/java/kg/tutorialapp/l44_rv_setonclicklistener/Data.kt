package kg.tutorialapp.l44_rv_setonclicklistener

object Data {
    val items = listOf<Item>(
        Item(1, "Java", R.drawable.ic_baseline_anchor_24),
        Item(2, "Kotlin", R.drawable.ic_baseline_cloud_queue_24),
        Item(3, "Python", R.drawable.ic_baseline_filter_vintage_24)
    )

    fun getLongListOfItems(): MutableList<Any>{
        val list = mutableListOf<Any>()
        for (i in 1..100){
            list.addAll(items)
            if (i % 3 == 0)
                list.add("https://dart.dev/tutorials")
        }
        return list
    }
}