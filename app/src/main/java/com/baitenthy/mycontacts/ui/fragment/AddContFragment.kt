package com.baitenthy.mycontacts.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.baitenthy.mycontacts.R
import com.baitenthy.mycontacts.databinding.FragmentAddContBinding

class AddContFragment : Fragment() {

    private lateinit var binding: FragmentAddContBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_add_cont, container, false)

        return binding.root
    }

}