package com.dy.assist.srptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageLoader imageLoader = new ImageLoader();
        ImageView imageView = findViewById(R.id.image_view);
        imageLoader.displayImage("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=234600013,2090953224&fm=173&app=49&f=JPEG?w=640&h=392&s=9FA4CE0096D565DC989034030100A0D0",imageView);
    }
}
