package com.mehmetbalbay.customdialogexample;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.mehmetbalbay.customdialogexample.databinding.CustomLoginPopupBinding;

public class CustomLoginPopup extends Dialog {

    private CustomLoginPopupBinding mBinding;
    private Context context;

    public CustomLoginPopup(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = CustomLoginPopupBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        getWindow().setContentView(mBinding.getRoot(), new WindowManager.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        mBinding.surnameET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Send Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
