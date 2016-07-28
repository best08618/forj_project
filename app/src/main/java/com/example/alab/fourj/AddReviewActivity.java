package com.example.alab.fourj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

public class AddReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_review);
    }
    public void submit (View v) {
//버튼을 클릭하면
        Intent intent = getIntent();
// 이 액티비티를 시작하게 한 인텐트를 호출
        EditText name_input = (EditText)findViewById(R.id.nickname_text_view);
        EditText review_input = (EditText)findViewById(R.id.review_text_view);
        RatingBar rating_input= (RatingBar) findViewById(R.id.review_ratingbar);
        intent.putExtra("data_name",name_input.getText().toString());
        intent.putExtra("data_review", review_input.getText().toString());
        intent.putExtra("data_rating", rating_input.getRating());
        setResult(RESULT_OK,intent);
// 추가 정보를 넣은 후 다시 인텐트를 반환합니다.
        finish();
// 액티비티 종료
    }

}
