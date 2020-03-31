package org.techtown.myfragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewerFragment extends Fragment {
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_viewer, container);

        imageView = (ImageView) rootView.findViewById(R.id.imageView);

        return rootView;
    }
    public void setImage(int index){
        if (index == 0){
            imageView.setImageResource(R.drawable.cat);
        } else if (index ==1){
            imageView.setImageResource(R.drawable.cat2);
        } else{
            imageView.setImageResource(R.drawable.cat1);
        }
    }
}
