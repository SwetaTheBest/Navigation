package com.swetajain.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.swetajain.navigation.databinding.FragmentListBinding

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {
    val args: ListFragmentArgs by navArgs()
    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentListBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        binding.tvArgs.text = args.id
        view.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_listFragment_to_mainFragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}