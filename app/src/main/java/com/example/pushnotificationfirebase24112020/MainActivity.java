package com.example.pushnotificationfirebase24112020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FirebaseMessaging.getInstance().getToken()
//                .addOnCompleteListener(new OnCompleteListener<String>() {
//                    @Override
//                    public void onComplete(@NonNull Task<String> task) {
//
//                        // Get new FCM registration token
//                        String token = task.getResult();
// dN7U_c3oR_SD-SRUGm_8L4:APA91bF2ECr3wQvF1pxTETUOW6eW27MMYCAcj3wqu4Spbs062JJ12r3aijrZFFg8-X-BD8DUeXkEYqLbDmlF1NnPjWbCyz0DFJ1rLu_LZtOyMthapUqPSzWEDH_Vd0YSRT-46SBCkmXU
//                        Log.d("BBB",token);
//                    }
//                });
    }
}