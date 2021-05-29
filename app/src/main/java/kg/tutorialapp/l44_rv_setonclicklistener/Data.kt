package kg.tutorialapp.l44_rv_setonclicklistener

object Data {
    val items = listOf<Item>(
        Item(1, "Java", R.drawable.ic_baseline_anchor_24),
        Item(2, "Kotlin", R.drawable.ic_baseline_cloud_queue_24),
        Item(3, "Dart", R.drawable.ic_baseline_filter_vintage_24)
    )

    val itemDetails = listOf<ItemDetails>(
        ItemDetails(1, "Java", R.drawable.ic_baseline_anchor_24, "Sun MacroSystems", "One of the most hated languages"),
        ItemDetails(2, "Kotlin", R.drawable.ic_baseline_cloud_queue_24, "Jet Brains", "Basically sugar coated Java"),
        ItemDetails(3, "Dart", R.drawable.ic_baseline_filter_vintage_24, "Google", "One language to rule them all")
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