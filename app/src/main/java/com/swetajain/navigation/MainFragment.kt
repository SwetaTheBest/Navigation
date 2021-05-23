package com.swetajain.navigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.swetajain.navigation.databinding.FragmentMainBinding


/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        binding.ivTouch.setOnClickListener {

            val action =
                MainFragmentDirections.actionMainFragmentToListFragment(binding.tietText.text.toString())
            Navigation.findNavController(it).navigate(action)
            Log.d("Main", "${it.id}")
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}