package com.micoder.imageslider;

public class SliderItem {

    // If you are picking image from internet you can use String to store url instead of int
    private int image;

    SliderItem(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}
