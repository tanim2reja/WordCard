package jolpai.com.wordcard.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jolpai.com.wordcard.R
import jolpai.com.wordcard.databinding.ActivityTestBinding

class Test : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityTestBinding = DataBindingUtil.setContentView(this,R.layout.activity_test)
        binding.lifecycleOwner = this
        //binding.viewModel

    }
}