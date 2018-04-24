package com.example.oscar.finder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import static com.example.oscar.finder.MainActivity.photoURI;

public class PopActivity extends Activity {

    EditText editText1, editText2;
    Button button;
    ImageView imageView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        //editText3 = findViewById(R.id.editText3);
        button = findViewById(R.id.popBtn);
        imageView = findViewById(R.id.popImg);


        imageView.setImageURI(photoURI);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Log.d("oscaar", "onClick: " + photoURI);
                intent = new Intent(getApplicationContext(),MainActivity.class);

                intent.putExtra("EditValue", editText1.getText().toString());
                intent.putExtra("EditValue2", editText2.getText().toString());
                //intent.putExtra("EditValue3", editText3.getText().toString());
                intent.putExtra("upload", true);
                startActivity(intent);
                Log.d("oscar1", "onClick: funkr");

                }


        });



        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);


    }
}
