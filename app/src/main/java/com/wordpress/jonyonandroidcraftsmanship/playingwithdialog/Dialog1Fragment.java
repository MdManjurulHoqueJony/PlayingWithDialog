package com.wordpress.jonyonandroidcraftsmanship.playingwithdialog;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Dialog1Fragment extends DialogFragment implements View.OnClickListener {

    private Button btnYes = null;
    private Button btnNo = null;
    private Communicator communicator = null;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        communicator= (Communicator) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog1, null);
        initialize(view);
        return view;
    }

    private void initialize(View view) {
        btnYes = (Button) view.findViewById(R.id.btnYes);
        btnNo = (Button) view.findViewById(R.id.btnNo);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);
        setCancelable(false);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnYes) {
            dismiss();
            communicator.onDialogMessage(getActivity().getString(R.string.yes_clicked));
        } else {
            dismiss();
            communicator.onDialogMessage(getActivity().getString(R.string.no_clicked));
        }
    }

    interface Communicator {
        public void onDialogMessage(String message);
    }

}













