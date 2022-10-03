package com.example.calendar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Dua#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dua extends Fragment {
    RecyclerView recyclerView;
    ArrayList<datamodel> dataholder;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Dua() {
        // Required empty public constructor
    }


    public static Dua newInstance(String param1, String param2) {
        Dua fragment = new Dua();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dua, container, false);
        recyclerView=view.findViewById(R.id.dua_hori);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder=new ArrayList<datamodel>();

        datamodel ob1=new datamodel("Invocations for breaking the fast","ذهب الظما، وابتلت\n" +
                "العروق، وثبت الأجر إن شاءً\n" +
                "ال له\n" +
                " ال لهم إني أسألك برحمتِك\n" +
                "   التي وسعت كل شيء، أن تَغفِرَ\n" +
                "لي");
        dataholder.add(ob1);

        datamodel ob2=new datamodel("Invocations before eating","يُس ال له يسم ال له في أوله وآخـره\n" +
                "ال لهم بارك لنا فيه وأظعِنْنا\n" +
                "خَيرا مثه ال له بارك لنا فيه\n" +
                "وزنا منه");
        dataholder.add(ob2);

        datamodel ob3=new datamodel("Invocations after eating","الد ل له الذي أعمنـي هذا\n" +
                "قنيه من غير حول متي ولا\n" +
                "وُة\n" +
                "الحد ل له الذ\n" +
                " ورزه\n" +
                "حمدا كثير طيبا\n" +
                "مباركا فيه، غير مكفي ولا مُودَع\n" +
                "ولا مستغني عنه ربنا\n" +
                "الحد ل له");
        dataholder.add(ob3);

        datamodel ob4=new datamodel("A dinner guest's invocation for his host","ال لهم بارك لهم فيما رقَتُهُم،\n" +
                "واغفز لهم وارخمهمُ");
        dataholder.add(ob4);

        datamodel ob5=new datamodel("Invocation for someone who gives you\n" +
                "       drink or offers it to you","ال لهم أظعم من أعني، وَاسقِ ال له أَظعِهٔ\n" +
                "مَن سقاني");
        dataholder.add(ob5);
     recyclerView.setAdapter(new myadapter(dataholder));

        return view;
    }


}