package com.example.androidlesson10.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.androidlesson10.Adapter.NameAdapter
import com.example.androidlesson10.Adapter.UserAdapter
import com.example.androidlesson10.Models.User
import com.example.androidlesson10.R
import com.example.androidlesson10.databinding.FragmentHomeBinding
import com.example.androidlesson10.databinding.FragmentProfileBinding




class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val args:ProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val user = args.user

        binding.textView.text=user.name?:""
        binding.imageView.setImageResource(user.image?:0)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}