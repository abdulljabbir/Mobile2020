package com.example.calculatorforaj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView Screen;
    private Button Div,mul,plus,sub,clear,one,two,three,four,five,six,seven,eight,nine,zero,equal;
    private String input,Answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Screen = findViewById(R.id.screen);
        clear = findViewById(R.id.clear);
        Div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        plus = findViewById(R.id.plus);
        sub = findViewById(R.id.sub);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equal);

        clear.setOnClickListener((view) {Screen.setText(""); });


    }

    public void ButtonClick(View View){
        Button button=(Button) View;
        String data=button.getText().toString();
        switch (data){

            case "x"
                solve();
            input+="x";
            break;
            case "="
                Solve();
            Answer=input;
            break;
            default:
                if (input==null){
                    input="";
                }
                if (data.equals("+") || data.equals("-")  ||  data.equals("/")){
                    solve();
                }
                input+=data;

        }
       Screen.setText(input);

    }

    private void Solve(){
        if (input.split("\\*").length==2){
             String number[]=input.split("\\");
             try{

                 double mul = Double.parseDouble(number[0]) * Double.parseDouble([1]);
                 input = mul+"";
             }
             catch (Exception e){

             }
        }
        if (input.split("\\*").length==2){
            String number[]=input.split("\\");
            try {

                double div = Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                input = div+"";
            }
catch (Exception e){

}
        }
        else  if (input.split("\\+").length==2){
            String number[]=input.split("\\+");
            try{


                double sum = Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                input = sum+"";
            }
            catch (Exception e){

            }
        }
        else  if (input.split("-").length>1){
            String number[]=input.split("-");
            if (number[0]==""&& number.length==2);{
                number[0]=0+"";
            }
            try {

                double sub=0;
                input (number.length==2) {
                      sub = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                }
                input = sub+"";
            }
            catch (Exception e);
        }
    }
    Screen.setText(input);
   }
}
