
        package sdu.cs58.jatuporn.calculator;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText num1EditText, num2EditText;
    Button addButton,divideButton,multiplyButton,deleteButton;
    TextView resultTextView;
int num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.edtNumber1);
        num2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.bntAdd);
        divideButton = findViewById(R.id.bntdivide);
        multiplyButton = findViewById(R.id.bntmultiply);
        deleteButton = findViewById(R.id.bntdelete);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 + num2;

                resultTextView.setText(result + "");
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 - num2;

                resultTextView.setText(result + "");
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 * num2;

                resultTextView.setText(result + "");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(num1EditText.getText().toString().trim());
                num2 = Integer.parseInt(num2EditText.getText().toString().trim());
                result = num1 / num2;

                resultTextView.setText(result + "");
            }
        });
    }//end onCreate
}// end class

