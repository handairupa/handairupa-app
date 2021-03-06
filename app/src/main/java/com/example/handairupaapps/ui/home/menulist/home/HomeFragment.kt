package com.example.handairupaapps.ui.home.menulist.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.handairupaapps.databinding.FragmentHomeBinding
import com.example.handairupaapps.ui.camera.CameraActivity

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

            binding.apply {
                cameraXButton.setOnClickListener {
                    Intent(requireContext(), CameraActivity::class.java).also {
                        startActivity(it)
                    }
                }
            }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}