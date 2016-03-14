package com.wordpress.jonyonandroidcraftsmanship.playingwithdialog;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Dialog1Fragment.Communicator{

    private FragmentManager fragmentManager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        fragmentManager=getSupportFragmentManager();
    }

    public void showDialog(View view) {
        if (view.getId()==R.id.btnShowDialog1) {
            Dialog1Fragment dialog1Fragment=new Dialog1Fragment();
            dialog1Fragment.show(fragmentManager,getString(R.string.dialog1));
        } else if (view.getId()==R.id.btnShowDialog2){
            Dialog2Fragment dialog2Fragment=new Dialog2Fragment();
            dialog2Fragment.show(fragmentManager,getString(R.string.dialog1));
        }else if (view.getId()==R.id.btnShowDialogAsFragment){
            Dialog2Fragment dialog2Fragment=new Dialog2Fragment();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.llFragmentContainer,dialog2Fragment,getString(R.string.dlg_fragment));
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onDialogMessage(String message) {
        Logger.toast(this,message);
    }
}
