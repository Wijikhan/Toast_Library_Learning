package com.example.toast_library;

import android.content.Context;
import android.widget.Toast;

public class ToastClass
{
    private Context context;
    public ToastClass(Context context)
    {
        this.context = context;
    }

    public void ShowMessage(String message)
    {
        Toast.makeText(context, ""+message, Toast.LENGTH_SHORT).show();
    }
}
