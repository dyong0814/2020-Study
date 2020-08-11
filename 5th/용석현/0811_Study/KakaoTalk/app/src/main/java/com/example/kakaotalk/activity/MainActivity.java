package com.example.kakaotalk.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.kakaotalk.R;
import com.example.kakaotalk.fragment.ChatFragment;
import com.example.kakaotalk.fragment.FriendFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FriendFragment fragmentF;
    private ChatFragment fragmentC;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        fragmentF = new FriendFragment();
        fragmentC = new ChatFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentF).commitAllowingStateLoss();
    }

    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.btn_fragmentA:
                transaction.replace(R.id.frameLayout, fragmentF).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentB:
                transaction.replace(R.id.frameLayout, fragmentC).commitAllowingStateLoss();
                break;
        }
    }
}