package converter.api;

import view.View;

/**
 * Created by oleksii.khilkevych on 3/15/2016.
 */
public interface Converter <ViewType extends View, Model> {

    ViewType convertModelToView(Model param);
}
