package com.example.androidlesson10.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.androidlesson10.Adapter.NameAdapter
import com.example.androidlesson10.Adapter.UserAdapter
import com.example.androidlesson10.Models.User
import com.example.androidlesson10.R
import com.example.androidlesson10.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textList= ArrayList<String>()

        textList.add("Name_1")
        textList.add("Name_2")
        textList.add("Name_3")
        textList.add("Name_4")
        textList.add("Name_5")
        textList.add("Name_6")
        textList.add("Name_7")
        textList.add("Name_8")
        textList.add("Name_9")
        textList.add("Name_10")
        textList.add("Name_11")
        textList.add("Name_12")
        textList.add("Name_13")
        textList.add("Name_14")
        textList.add("Name_15")
        textList.add("Name_16")

        val nameAdapter=NameAdapter()

        nameAdapter.updateList(textList)


        val users= ArrayList<User>()
        users.add(User("Name_1", R.drawable.emoji_1))
        users.add(User("Name_2", R.drawable.emoji_2))
        users.add(User("Name_3", R.drawable.emoji_3))
        users.add(User("Name_4", R.drawable.emoji_4))

        val nameAdapter2=UserAdapter(users)



       // binding.recycleViewHome.layoutManager = LinearLayoutManager(context)

        val horizontalLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recycleViewHome.layoutManager = horizontalLayoutManager
        binding.recycleViewHome.adapter = nameAdapter2



        val gridLayoutManager = GridLayoutManager(context, 4)
        binding.recycleViewHome2.layoutManager = gridLayoutManager
        binding.recycleViewHome2.adapter = nameAdapter

        val staggeredGridLayoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)
        binding.recycleViewHome3.layoutManager = staggeredGridLayoutManager
        binding.recycleViewHome3.adapter = nameAdapter



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}