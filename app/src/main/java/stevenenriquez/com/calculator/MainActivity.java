package stevenenriquez.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonSign, buttonAdd, buttonSub,
            buttonMult, buttonDiv, buttonMod, buttonDec, buttonMS, buttonBack,
            buttonMC, buttonMR, buttonEqual, buttonClear, buttonSettings;

    EditText textViewEdit;

    boolean addFlag, subFlag, multFlag, divFlag, modFlag, signFlag = false,
            decFlag = false;

    double val1, val2, memStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonSign = findViewById(R.id.buttonSign);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMult = findViewById(R.id.buttonMult);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonDec = findViewById(R.id.buttonDec);
        buttonMod = findViewById(R.id.buttonMod);
        buttonMS = findViewById(R.id.buttonMS);
        buttonMC = findViewById(R.id.buttonMC);
        buttonMR = findViewById(R.id.buttonMR);
        buttonBack = findViewById(R.id.buttonBack);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonClear = findViewById(R.id.buttonClear);
        buttonSettings = findViewById(R.id.buttonSettings);
        textViewEdit = findViewById(R.id.textView);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String tempString = textViewEdit.getText() + "0";
                textViewEdit.setText(tempString);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "1";
                textViewEdit.setText(tempString);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "2";
                textViewEdit.setText(tempString);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "3";
                textViewEdit.setText(tempString);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "4";
                textViewEdit.setText(tempString);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "5";
                textViewEdit.setText(tempString);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "6";
                textViewEdit.setText(tempString);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "7";
                textViewEdit.setText(tempString);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "8";
                textViewEdit.setText(tempString);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempString = textViewEdit.getText() + "9";
                textViewEdit.setText(tempString);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                    isEmpty(textViewEdit);
                    val1 = Double.parseDouble(textViewEdit.getText() + "");
                    addFlag = true;
                    textViewEdit.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isEmpty(textViewEdit);
                val1 = Double.parseDouble(textViewEdit.getText() + "");
                subFlag = true;
                textViewEdit.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isEmpty(textViewEdit);
                val1 = Double.parseDouble(textViewEdit.getText() + "");
                multFlag = true;
                textViewEdit.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isEmpty(textViewEdit);
                val1 = Double.parseDouble(textViewEdit.getText() + "");
                divFlag = true;
                textViewEdit.setText(null);
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isEmpty(textViewEdit);
                val1 = Double.parseDouble(textViewEdit.getText() + "");
                modFlag = true;
                textViewEdit.setText(null);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewEdit.setText("");
                decFlag = false;
            }
        });

        buttonSign.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String tvString = textViewEdit.getText().toString();
                String tempString;

                if(!signFlag)
                {
                    tempString = "-" + textViewEdit.getText();
                    textViewEdit.setText(tempString);
                    signFlag = true;
                }
                else
                {
                    tempString = tvString.substring(1, tvString.length());
                    textViewEdit.setText(tempString);
                    signFlag = false;
                }
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String tvString = textViewEdit.getText().toString();
                int length = tvString.length();
                String tempString;

                if(length == 0)
                {
                    textViewEdit.setText("");
                }
                else
                {
                    tempString = tvString.substring(0, tvString.length() - 1);
                    textViewEdit.setText(tempString);
                }
            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(!decFlag)
                {
                    String tvString = textViewEdit.getText().toString();
                    int length = tvString.length();

                    if(length == 0)
                    {
                        textViewEdit.setText("0");
                    }

                    String tempString = textViewEdit.getText() + ".";
                    textViewEdit.setText(tempString);

                    decFlag = true;
                }
            }
        });

        buttonMS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isEmpty(textViewEdit);
                memStore = Double.parseDouble(textViewEdit.getText() + "");
            }
        });

        buttonMR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textViewEdit.setText(String.valueOf(memStore));
            }
        });

        buttonMC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                memStore = 0.0;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                val2 = Float.parseFloat(textViewEdit.getText() + "");
                String tempString;

                if (addFlag)
                {
                    tempString = val1 + val2 + "";
                    textViewEdit.setText(tempString);
                    addFlag = false;
                }

                if (subFlag)
                {
                    tempString = val1 - val2 +"";
                    textViewEdit.setText(tempString);
                    subFlag = false;
                }

                if (multFlag)
                {
                    tempString = val1 * val2 + "";
                    textViewEdit.setText(tempString);
                    multFlag = false;
                }

                if (divFlag)
                {
                    tempString = val1 / val2 + "";
                    textViewEdit.setText(tempString);
                    divFlag = false;
                }

                if (modFlag)
                {
                    tempString = val1 % val2 + "";
                    textViewEdit.setText(tempString);
                    modFlag = false;
                }
            }
        });
    }

//        private boolean isTooLong(EditText inText)
//        {
//            if (inText.getText().toString().length() == 16)
//            {
//                return true;
//            }
//            return false;
//        }

        private void isEmpty(EditText inText)
        {
            String tempString = inText.getText().toString();
            int length = tempString.length();

            if (length == 0)
            {
                inText.setText("0");
            }
        }

//        private void nullCheck(EditText inText)
//        {
//            if (inText.getText() == null)
//            {
//                inText.setText("0");
//            }
//        }
    }
