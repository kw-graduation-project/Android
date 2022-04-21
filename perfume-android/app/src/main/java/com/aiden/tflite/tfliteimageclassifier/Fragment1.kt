package com.aiden.tflite.tfliteimageclassifier

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() {
    val perfume_DataArray : ArrayList<Perfumes> = ArrayList()
    lateinit var recyclerView1 : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_1, container, false)
        perfume_DataArray.add(Perfumes(R.drawable.perfume2,"안나수이",13000,"향기로움"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume10,"안나수이",15000,"시트러스"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume2,"안나수이",15000,"시트러스"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume10,"안나수이",15000,"시트러스"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume2,"안나수이",15000,"시트러스"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume10,"안나수이",15000,"시트러스"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume2,"안나수이",15000,"시트러스"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume10,"안나수이",15000,"시트러스"))
        perfume_DataArray.add(Perfumes(R.drawable.perfume2,"안나수이",15000,"시트러스"))

        recyclerView1 = rootView.findViewById(R.id.perfume_list!!)as RecyclerView
        recyclerView1.layoutManager = LinearLayoutManager(requireContext())
        recyclerView1.adapter = PerfumeAdapter(perfume_DataArray)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }
}