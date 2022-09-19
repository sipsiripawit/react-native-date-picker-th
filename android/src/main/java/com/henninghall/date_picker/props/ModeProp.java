package com.sipsiripawit.date_picker.props;

import com.facebook.react.bridge.Dynamic;
import com.sipsiripawit.date_picker.models.Mode;

public class ModeProp extends Prop<Mode> {
    public static final String name = "mode";

    @Override
    public Mode toValue(Dynamic value){
        return Mode.valueOf(value.asString());
    }
}
