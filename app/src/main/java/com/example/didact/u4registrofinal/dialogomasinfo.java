package com.example.didact.u4registrofinal;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

/**
 * Created by DIDACT on 16/02/2018.
 */


public class dialogomasinfo extends DialogFragment {



    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setMessage("Avenida de Europa, 24. Jerez de la Frontera, Cádiz")
                .setTitle("Sobre nosotros!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        return builder.create();
    }

    public void show(FragmentManager fragmentManager, String btnmasinfo) {
    }
}

