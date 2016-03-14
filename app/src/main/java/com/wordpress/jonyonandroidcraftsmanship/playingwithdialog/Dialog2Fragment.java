package com.wordpress.jonyonandroidcraftsmanship.playingwithdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Dialog2Fragment extends DialogFragment {

//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("Using onCreateDialog");
//
////        builder.setMessage(getString(R.string.dialog_msg));
//
////        builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
////            @Override
////            public void onClick(DialogInterface dialog, int which) {
////                Logger.toast(getActivity(), getString(R.string.item)+ which);
////            }
////        });
//
////        builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
////            @Override
////            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
////                Logger.toast(getActivity(), getString(R.string.item)+ which +" "+isChecked);
////            }
////        });
//
//        LayoutInflater inflater=getActivity().getLayoutInflater();
//        View view = inflater.inflate(R.layout.fragment_dialog2, null);
//        builder.setView(view);
//
//        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Logger.toast(getActivity(), getString(R.string.no_clicked));
//            }
//        });
//
//        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Logger.toast(getActivity(), getString(R.string.yes_clicked));
//            }
//        });
//
//        Dialog dialog = builder.create();
//        return dialog;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog1, null);
        return view;
    }
}













