package kg.tutorialapp.l44_rv_setonclicklistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), FragmentItemsListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup(){
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, FragmentItems())
            .addToBackStack(null)
            .commit()
    }

    override fun openFragmentItemDetails(id: Long) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, FragmentItemDetails.newInstance(id))
            .addToBackStack(null)
            .commit()
    }
}