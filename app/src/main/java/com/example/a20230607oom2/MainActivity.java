package com.example.a20230607oom2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import leakcanary.LeakCanary;

//import com.squareup.leakcanary.LeakCanary;

//import leakcanary.LeakCanary;


//public class MainActivity extends AppCompatActivity {
//    private Button mButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mButton = findViewById(R.id.button);
//        mButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // do something
//                Toast.makeText(getApplicationContext(), "已经点击", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//
////        if (LeakCanary.isInAnalyzerProcess(this)) {
////            return;
////        }
////        LeakCanary.Builder builder = LeakCanary
////                .config(this)
////                .newBuilder()
////                .build();
////        LeakCanary.install(this, builder);
//    }
//
//
//
//
//
//}

public class MainActivity extends AppCompatActivity {
    //非静态内部类的静态实例引用
    public static InnerClass innerClass = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //保证非静态内部类的实例只有1个
        if (innerClass == null) {
            innerClass = new InnerClass();
        }
    }

    // 非静态内部类
    private class InnerClass {
        //...
    }
}

