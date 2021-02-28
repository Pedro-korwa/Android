package com.example.biakngemil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {
    private int[] mimage = new int[] {
            R.drawable.gamber, R.drawable.gamber2, R.drawable.gamber3, R.drawable.gamber4, R.drawable.gamber5
    };

    private String[] mimagesTitle = new String[] {
     "Gambar1", "Gambar2" , "Gambar3", "Gambar4" , "Gambar5"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarouselView carouselView = findViewById(R.id.pedro);
        carouselView.setPageCount(mimage.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mimage[position]);
            }
        });
        carouselView.setImageClickListener(new  ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this, mimagesTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}