package com.example.gambarslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.pedro);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/05/07/14/57/reflection-5141841__340.jpg", "Kota"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/06/04/19/56/hill-5260303__340.jpg", "Alam"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2017/02/07/09/45/city-2045453__340.jpg", "Taman"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2020/12/18/16/56/laptop-5842509__340.jpg", "Home"));

        imageSlider.setImageList(slideModels,true);
    }
}