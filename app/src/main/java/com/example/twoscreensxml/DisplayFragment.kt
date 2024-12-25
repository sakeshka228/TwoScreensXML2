package com.example.twoscreensxml

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.twoscreensxml.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {
    private var _binding: FragmentDisplayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputText = arguments?.getString("input_text") ?: "No text provided"
        binding.textViewDisplay.text = inputText

        // Обработчик кнопки "Назад"
        binding.buttonBack.setOnClickListener {
            // Переходим обратно к первому фрагменту
            parentFragmentManager.popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
