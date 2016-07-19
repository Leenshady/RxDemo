package com.lv.rxdemo.viewmodel;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lv.rxdemo.model.VRModel;

/**
 * Created by Lv on 2016/7/18.
 */
public class DesignViewModel {

    private VRModel vrModel;

    public DesignViewModel(VRModel vrModel) {
        this.vrModel = vrModel;
    }

    public String getDesignerPic() {
        return vrModel.getDesignerPic();
    }

    public String getModelHomeApartmentDesignName() {
        return vrModel.getModelHomeApartmentDesignName();
    }

    public String getConstructionArea() {
        return vrModel.getConstructionArea() + "";
    }

    public String getApartmentLayout() {
        return vrModel.getApartmentLayout();
    }

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext()).load(imageUrl).into(view);
    }
}