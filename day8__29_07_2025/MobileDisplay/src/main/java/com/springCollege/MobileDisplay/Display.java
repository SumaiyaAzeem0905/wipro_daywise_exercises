package com.springCollege.MobileDisplay;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private int size;

    public Display() {
        this.size = 6; // default size
    }

    public Display(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Display{size=" + size + " inches}";
    }
}
