package com.example.handairupaapps.ui.journal

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.handairupaapps.databinding.FragmentJournalBinding

class JournalFragment : Fragment() {

    private var _binding: FragmentJournalBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val journalViewModel =
            ViewModelProvider(this)[JournalViewModel::class.java]

        _binding = FragmentJournalBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.journalFragment
        journalViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}