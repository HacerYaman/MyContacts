package com.baitenthy.mycontacts.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.baitenthy.mycontacts.R
import com.baitenthy.mycontacts.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)      //binding views

        binding.toolbar.title="Contacts"

        binding.buttonDetail.setOnClickListener {



        }

        binding.fab.setOnClickListener {



        }



        return binding.root
    }


}