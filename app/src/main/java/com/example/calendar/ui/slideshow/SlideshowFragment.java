package com.example.calendar.ui.slideshow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.calendar.R;
import com.example.calendar.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {
    private FragmentSlideshowBinding binding;
    int i=0;
    public View onCreateView(
            @NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }
    @Override
    public void onStart() {
        super.onStart();
        TextView names,arbic,count;
        ImageView right,left;

        names = (TextView)this.getView().findViewById(R.id.name);
        arbic=(TextView)this.getView().findViewById(R.id.arabic_name);
        count=(TextView)this.getView().findViewById(R.id.name_number);
        left=(ImageView)this.getView().findViewById(R.id.left_btn);
        right=(ImageView)this.getView().findViewById(R.id.right_btn);

        count.setText("0/"+allahnames.names_arbic.length);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<allahnames.names_arbic.length-1)
                {
                    i++;
                    names.setText(allahnames.names_english[i]);
                    arbic.setText(allahnames.names_arbic[i]);
                    count.setText(""+i+"/"+allahnames.names_arbic.length);

                }
                else
                {

                }
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>0)
                {
                    i--;
                    names.setText(allahnames.names_english[i]);
                    arbic.setText(allahnames.names_arbic[i]);
                    count.setText(""+i+"/"+allahnames.names_arbic.length);

                }
                else
                {

                }

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}