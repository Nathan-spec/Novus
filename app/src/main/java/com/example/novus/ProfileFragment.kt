package com.example.novus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.example.novus.databinding.FragmentProfileBinding
import com.example.novus.databinding.FragmentSettingsBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageOne.load("https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
        {
            transformations(CircleCropTransformation())
        }
        binding.secondImage.load("https://th.bing.com/th/id/R.6618fefff640dd1618f9bbb6c7047149?rik=5XAJx0dsZPeCkw&pid=ImgRaw&r=0 ") {
            transformations(CircleCropTransformation())
        }
        binding.thirdImage.load("https://images.pexels.com/photos/2812193/pexels-photo-2812193.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
        {
            transformations(CircleCropTransformation())
        }
        binding.fourthImage.load("https://images.pexels.com/photos/1374510/pexels-photo-1374510.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
        {
            transformations(CircleCropTransformation())
        }
        binding.fifthImage.load("https://images.pexels.com/photos/1542085/pexels-photo-1542085.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
        {
            transformations(CircleCropTransformation())
        }
        binding.sixthImage.load("https://images.pexels.com/photos/1080882/pexels-photo-1080882.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
        {
            transformations(CircleCropTransformation())
        }
        binding.seventhImage.load("https://images.pexels.com/photos/2127969/pexels-photo-2127969.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")
        {
            transformations(CircleCropTransformation())
        }

    }

}