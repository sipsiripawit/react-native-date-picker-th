package com.sipsiripawit.date_picker.wheelFunctions;

import com.sipsiripawit.date_picker.wheels.Wheel;

public class SetShowCount implements WheelFunction {

    private final int count;

    public SetShowCount(int count) {
        this.count = count;
    }

    @Override
    public void apply(Wheel wheel) {
        wheel.picker.setShownCount(this.count);
    }
}


