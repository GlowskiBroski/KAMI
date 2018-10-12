package me.zeroeightsix.kami.setting.boxed.numerical;

import me.zeroeightsix.kami.setting.converter.AbstractBoxedNumberConverter;
import me.zeroeightsix.kami.setting.converter.BoxedFloatConverter;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

/**
 * Created by 086 on 12/10/2018.
 */
public class BoxedFloatSavableListeningNamedSettingRestrictable extends BoxedNumberSavableListeningNamedSettingRestrictable<Float> {

    private static final BoxedFloatConverter converter = new BoxedFloatConverter();

    public BoxedFloatSavableListeningNamedSettingRestrictable(Float value, Predicate<Float> restriction, BiConsumer<Float, Float> consumer, String name, Predicate<Float> visibilityPredicate) {
        super(value, restriction, consumer, name, visibilityPredicate);
    }

    @Override
    public AbstractBoxedNumberConverter converter() {
        return converter;
    }

}