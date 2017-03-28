package bstar128.example.hansung.xmllayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{
    EditText edit1,edit2;
    Button butPlus,butMinus,butMultiply,butDivision;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit_1);
        edit2 = (EditText) findViewById(R.id.edit_2);
        butPlus = (Button) findViewById(R.id.but_plus);
        butMinus = (Button) findViewById(R.id.but_minus);
        butMultiply = (Button) findViewById(R.id.but_times);
        butDivision = (Button) findViewById(R.id.but_division);
        textResult = (TextView) findViewById(R.id.text_result);
        butPlus.setOnClickListener(butHandler);
        butMinus.setOnClickListener(butHandler);
        butMultiply.setOnClickListener(butHandler);
        butDivision.setOnClickListener(butHandler);

      /*  butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(num1 + num2));

            }
        });
        butMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(num1 - num2));
            }
        });
        butMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(num1 * num2));
            }
        });
        butDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edit1.getText().toString());
                int num2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(num1 / num2));
            }
        });*/

    }
    View.OnClickListener butHandler=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(edit1.getText().toString());
            int num2 = Integer.parseInt(edit2.getText().toString());
            int result=0;

            switch (view.getId()){
                case R.id.but_plus:
                    result=num1+num2;
                    break;
                case R.id.but_minus:
                    result=num1-num2;
                    break;
                case R.id.but_times:
                    result=num1*num2;
                    break;
                case R.id.but_division:
                    result=num1/num2;
                    break;
            }
            textResult.setText(result+" ");
        }
    };

    /*@Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(edit1.getText().toString());
        int num2 = Integer.parseInt(edit2.getText().toString());
        int result=0;

        switch (view.getId()){
            case R.id.but_plus:
                result=num1+num2;
                break;
            case R.id.but_minus:
                result=num1-num2;
                break;
            case R.id.but_times:
                result=num1*num2;
                break;
            case R.id.but_division:
                result=num1/num2;
                break;
        }
        textResult.setText(result+" ");
    }*/
}
