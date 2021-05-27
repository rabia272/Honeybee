package org.iiui.honeybee.ui.Promocode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PromocodeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PromocodeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}