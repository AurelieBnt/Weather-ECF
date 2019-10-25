package com.example.weatheractivity.services;

import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.weatheractivity.models.VisualRendering;
import com.example.weatheractivity.models.Weather;

public class VisualRenderingService {

    public void read(){
        VisualRendering visualRendering = new VisualRendering();
        String description = visualRendering.getDescription();
        ImageView image = visualRendering.getImage();
        ConstraintLayout background = visualRendering.getBackground();
    }

    public void create(String description, ImageView image, ConstraintLayout background){
        VisualRendering visualRendering = new VisualRendering();
        visualRendering.setDescription(description);
        visualRendering.setImage(image);
        visualRendering.setBackground(background);
    }

}
