package cat.copernic.esther.morales.practica_final_mp07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.*


class FragmentA : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buton1.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }

        buton2.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentC)
        }
    }


}