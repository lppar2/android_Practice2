package ru.mirea.galkina.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;

public class MyProgressDialogFragment {
    public static void onProgress(ProgressDialog myProgressDialog) {
        myProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        myProgressDialog.setMessage("Progress...");
        myProgressDialog.setButton(Dialog.BUTTON_POSITIVE, "Skip", (DialogInterface.OnClickListener) (dialog, which) -> { });
        myProgressDialog.show();
    }
}
