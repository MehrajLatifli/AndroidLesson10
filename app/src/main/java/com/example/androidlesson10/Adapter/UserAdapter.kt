package com.example.androidlesson10.Adapter

import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.example.androidlesson10.Fragments.HomeFragmentDirections
import com.example.androidlesson10.Models.User
import com.example.androidlesson10.R
import com.example.androidlesson10.databinding.ItemCard2Binding
import com.example.androidlesson10.databinding.ItemCardBinding

class UserAdapter(list: List<User>?) :
    BaseAdapter<User>(list ?: emptyList(), R.layout.item_card2) {

    override fun bind(view: View, item: User, position: Int) {
        val binding = ItemCard2Binding.bind(view)

        item.name.let {it
            binding.textView.text = it?:""
        }

        item.image.let {it
            binding.imageView.setImageResource(it?:0)
        }


        binding.materialCardView.setOnClickListener {
            Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToProfileFragment(item))
        }
    }
}



