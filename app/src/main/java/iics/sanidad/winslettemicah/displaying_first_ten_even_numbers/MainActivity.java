package iics.sanidad.winslettemicah.displaying_first_ten_even_numbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int targetEvenCount = 10;
                int currEvenCount = 0;
                for(int i=1;currEvenCount<targetEvenCount;i++)
                {
                    // This is condition which finds if current value in i is an even or not
                    // if its an even number, currEvenCount is incremented by 1.
                    if(i%2==0)
                    {
                        currEvenCount++;
                        TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("2 4 6 8 10 12 14 16 18 20");
                    }
                }

            }

        });
    }
}

