package com.example.tugasdrawer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tugasdrawer.R;

public class RatingApp extends Fragment {

    TextView rateCount, showRating;
    EditText review;
    Button submit;
    RatingBar ratingBar;
    float rateValue; String temp;
    public RatingApp() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.rating_app_fragment, container, false);

        rateCount = view.findViewById(R.id.rateCount);
        ratingBar = view.findViewById(R.id.ratingBar);
        review = view.findViewById(R.id.review);
        submit = view.findViewById(R.id.submit);
        showRating = view.findViewById(R.id.showRating);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                rateValue = ratingBar.getRating();

                if (rateValue <= 1 && rateValue > 0) {
                    rateCount.setText("Bad");
                } else if (rateValue <= 2 && rateValue > 1) {
                    rateCount.setText("OK");
                } else if (rateValue <= 3 && rateValue > 2) {
                    rateCount.setText("Good");
                } else if (rateValue <= 4 && rateValue > 3) {
                    rateCount.setText("Very Good");
                } else if (rateValue <= 5 && rateValue > 4) {
                    rateCount.setText("Awesome");
                }

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    temp = rateCount.getText().toString();
                    showRating.setText(temp + "\n" + "Feedback:" + "\n" + review.getText());
                    review.setText("");
                    ratingBar.setRating(0);
                    rateCount.setText("");
            }
        });
        return view;
    }
}
