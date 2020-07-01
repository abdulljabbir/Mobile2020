package  com.codinginflow.saveinstancestateexample;

import android.support..v7.app.AppCompactActivity;
import  android.os.Bundle;
import  android.view.View;
import  android.widget.Button;
import  android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView mTextViewCount;
    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewCount = findViewById(R.id.text_view_count);
      Button buttonDecrement = findViewById(R.id.button_decrement);
      Button buttonIncrement = findViewById(R.id.button_increment);

buttonDecrement.setOnClickListener(new View.OnClickListener() {
@override
public void onClick(View V) {
}
}};
if (savedInstanceState != null) {
  mCount = savedInstanceState.getInt("count");
mTextViewCount.setText(string.valueOf(mCount));
}
}
outstate.putIn("count", mCount);
}
}