package com.example.prac_3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView topText = findViewById(R.id.topText);
        TextView middleText = findViewById(R.id.middleText);
        TextView footerText = findViewById(R.id.footerText);

        topText.setBackgroundColor(0xFF333333);
        topText.setTextColor(0xFFFFFFFF);
        middleText.setBackgroundColor(0xFF4169E1);
        middleText.setTextColor(0xFFFFFFFF);
        footerText.setBackgroundColor(0xFFFF4500);
        footerText.setTextColor(0xFF000000);

        ConstraintLayout.LayoutParams topLayoutParams = (ConstraintLayout.LayoutParams) topText.getLayoutParams();
        ConstraintLayout.LayoutParams middleLayoutParams = (ConstraintLayout.LayoutParams) middleText.getLayoutParams();
        ConstraintLayout.LayoutParams footerLayoutParams = (ConstraintLayout.LayoutParams) footerText.getLayoutParams();

        // Top TextView
        topLayoutParams.width = ConstraintLayout.LayoutParams.MATCH_PARENT;
        topLayoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        topLayoutParams.bottomToTop = middleText.getId();
        topLayoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        topLayoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

        // Middle TextView
        middleLayoutParams.width = ConstraintLayout.LayoutParams.MATCH_PARENT;
        middleLayoutParams.topToBottom = topText.getId();
        middleLayoutParams.bottomToTop = footerText.getId();
        middleLayoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        middleLayoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

        // Footer TextView
        footerLayoutParams.width = ConstraintLayout.LayoutParams.MATCH_PARENT;
        footerLayoutParams.topToBottom = middleText.getId();
        footerLayoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        footerLayoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        footerLayoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

        topText.setLayoutParams(topLayoutParams);
        middleText.setLayoutParams(middleLayoutParams);
        footerText.setLayoutParams(footerLayoutParams);
    }
}
