package com.example.test.UI

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.R
import com.example.test.Utils.Status
import com.example.test.Utils.collectOnStart
import com.example.test.Utils.viewBinding
import com.example.test.databinding.MainScreenFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment(R.layout.main_screen_fragment) {

    private var adapter: RecyclerAdapter = RecyclerAdapter(this::onItemClick)
    private val binding:MainScreenFragmentBinding by viewBinding()
    private val mainViewModel:MainFragmentViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        bindui()
    }

    private fun getData() {
        collectOnStart(mainViewModel.personInformationStateFlow) {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { it1 -> adapter.setUpdatedData(it1) }
                }
                Status.ERROR -> {
                    Toast.makeText(context,"Error while getting information",Toast.LENGTH_SHORT).show()
                }
                Status.LOADING -> Unit
            }
        }
    }

    private fun bindui() {
        with(binding){
            personRecycler.layoutManager = LinearLayoutManager(requireContext())
            personRecycler.adapter = adapter
            with(swipe){
                setOnRefreshListener {
                    mainViewModel.updateUsers()
                    getData()
                    isRefreshing = false
                }
            }
        }
    }

    private fun onItemClick(position: Int) {
        val bundle = Bundle()
        bundle.putInt("position", position)
        findNavController().navigate(
            R.id.action_mainFragment_to_detailedPersonInformation,
            bundle
        )
    }
}