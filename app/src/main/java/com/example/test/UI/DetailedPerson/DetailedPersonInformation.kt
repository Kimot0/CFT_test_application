package com.example.test.UI.DetailedPerson

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import coil.load
import coil.transform.CircleCropTransformation
import com.example.test.Domain.Entity.RandomUser
import com.example.test.R
import com.example.test.Utils.Status
import com.example.test.Utils.collectOnStart
import com.example.test.Utils.viewBinding
import com.example.test.databinding.DetailedPersonInformationBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailedPersonInformation: Fragment(R.layout.detailed_person_information) {

    private val binding:DetailedPersonInformationBinding by viewBinding()
    private val detailedViewModel :DetailedPersonInformationViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val position = arguments?.getInt("position") ?: 0
        getData(position)
    }

    private fun bindui(person: RandomUser) {
        with(binding){
            fullPhoto.load(person.picture){
                crossfade(true)
                transformations(CircleCropTransformation())
            }
            fullFIO.text = person.name
            fullGender.text = person.gender
            fullAddress.text = person.location
            fullNumber.text = person.phone
            fullEmail.text = person.email
            fullAge.text = person.age + " y.o"
            fullBirthday.text = person.dob.removeRange(10,person.dob.length)
            fullNumber.setOnClickListener {
                val phoneIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:${person.phone}")
                }
                startActivity(phoneIntent)
            }
            numberForward.setOnClickListener {
                val phoneIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:${person.phone}")
                }
                startActivity(phoneIntent)
            }
            emailForward.setOnClickListener {
                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto: ${person.email}")
                }
                startActivity(emailIntent)
            }
            fullEmail.setOnClickListener {
                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto: ${person.email}")
                }
                startActivity(emailIntent)
            }
            addressForward.setOnClickListener {
                val mapIntent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("geo:0,0?q=${person.location}")
                }
                startActivity(mapIntent)
            }
            fullAddress.setOnClickListener {
                val mapIntent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("geo:0,0?q=${person.location}")
                }
                startActivity(mapIntent)
            }

        }
    }
    private fun getData(position : Int) {
        collectOnStart(detailedViewModel.personInformationStateFlow) {
            when (it.status) {
                Status.SUCCESS -> {
                    bindui(it.data!![position])
                }
                Status.ERROR -> {
                    Toast.makeText(context,"Error while getting information", Toast.LENGTH_SHORT).show()
                }
                Status.LOADING -> Unit
            }
        }
    }
}