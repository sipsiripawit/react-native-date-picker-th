package com.sipsiripawit.date_picker.wheelFunctions;

import android.view.View;

import com.sipsiripawit.date_picker.wheels.Wheel;

public class Hide implements WheelFunction {

    @Override
    public void apply(Wheel wheel) {
        wheel.picker.setVisibility(View.GONE);
    }
}


