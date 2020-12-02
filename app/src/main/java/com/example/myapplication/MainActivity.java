package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     EditText etSalary;
     TextView tvDetails;
     Button btnGetDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         etSalary = findViewById(R.id.salary);
        tvDetails = findViewById(R.id.details);
        btnGetDetails = findViewById(R.id.getDetails);

        btnGetDetails.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        double annualSalary;
        double tax;
        double taxAmount;
        double netSalary;

        double biWeeklySalary;
        double sal = Double.parseDouble(etSalary.getText().toString());
            annualSalary = sal * 12;


         if (annualSalary < 50000 ){
            tax = 0;
            //annualSalary = sal * 12;
            taxAmount = 0 ;
            netSalary = sal - taxAmount;
            biWeeklySalary = netSalary / 24 ;
             tvDetails.setText("Tax on your Salary is = " + tax + "% \n Annual Salary = " + annualSalary  + "" +
                     " \n tax amount on your salary is  " + taxAmount + " \n Net Salary of you is " +
                     "" + netSalary + "\n Biweekly Salary without tax = " + biWeeklySalary + ".");

         }
         else if (annualSalary > 50000 && annualSalary < 70000){
             tax = 17;
             //annualSalary = sal * 12;
             taxAmount = (tax /100) * annualSalary ;
             netSalary = annualSalary - taxAmount;
             biWeeklySalary = netSalary / 24 ;

             tvDetails.setText("Tax on your Salary is = " + tax + "% \n Annual Salary = " + annualSalary  + "" +
                     " \n tax amount on your salary is  " + taxAmount + " \n Net Salary of you is " + netSalary +
                     " \n Biweekly Salary without tax = " + biWeeklySalary + ".");


         }else if (annualSalary > 70000 && annualSalary < 90000){
            tax = 23;
             //annualSalary = sal * 12;
             taxAmount = (tax /100) * annualSalary ;
             netSalary = annualSalary - taxAmount;
             biWeeklySalary = netSalary / 24 ;

             tvDetails.setText("Tax on your Salary is = " + tax + "% \n Annual Salary = " + annualSalary  + " \n tax amount" +
                     " on your salary is  " + taxAmount + " \n Net Salary of you is " + netSalary + "\n Biweekly Salary without tax " +
                     "= " + biWeeklySalary + ".");

         }else  if (sal > 90000 )  {
             tax = 27;
             //annualSalary = sal * 12;
             taxAmount = (tax /100) * annualSalary ;
             netSalary = annualSalary - taxAmount;
             biWeeklySalary = netSalary / 24 ;

             tvDetails.setText("Tax on your Salary is = " + tax + "% \n Annual Salary = " + annualSalary  + " \n tax amount on your salary is  "
                     + taxAmount + " \n Net Salary of you is " + netSalary + "\n Biweekly Salary without tax = " + biWeeklySalary + ".");

         }
    }
}