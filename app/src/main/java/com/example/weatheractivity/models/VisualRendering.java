package com.example.weatheractivity.models;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class VisualRendering {

    private ImageView image;
    private ConstraintLayout background;
    private String description;



    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public ConstraintLayout getBackground() {
        return background;
    }

    public void setBackground(ConstraintLayout background) {
        this.background = background;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
