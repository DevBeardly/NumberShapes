package info.timgraves.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkNumberShapes(View view) {

        EditText numEditText = (EditText) findViewById(R.id.numEditText);

        if (numEditText.getText().toString().isEmpty()) {
            message = "Please enter a number";
        } else {
            Number userNum = new Number();
            userNum.number = Integer.parseInt(numEditText.getText().toString());

            message = "";

            if (userNum.isSquare() && userNum.isTriangular()) {
                message = userNum.number + " is both square and triangular!";
            } else if (userNum.isSquare()) {
                message = userNum.number + " is square, but not triangular";
            } else if (userNum.isTriangular()) {
                message = userNum.number + " is triangular, but not square";
            } else {
                message = userNum.number + " is neither square nor triangular";
            }
        }

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();



    }
}
