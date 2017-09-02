package com.juan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bSuma, bMultiplicación, bDivision, bResta, bCero,
            bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete,
            bOcho, bNueve, bIgual, bPunto, bBorrar;
    EditText eResultado;
    String num1="",num2;
    int op=0;
    boolean punto=false, oper=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bSuma= (Button) findViewById(R.id.bSuma);
        bMultiplicación= (Button) findViewById(R.id.bMultiplicacion);
        bDivision= (Button) findViewById(R.id.bDivision);
        bResta= (Button) findViewById(R.id.bResta);
        bCero= (Button) findViewById(R.id.bCero);
        bUno= (Button) findViewById(R.id.bUno);
        bDos= (Button) findViewById(R.id.bDos);
        bTres= (Button) findViewById(R.id.bTres);
        bCuatro= (Button) findViewById(R.id.bCuatro);
        bCinco= (Button) findViewById(R.id.bCinco);
        bSeis= (Button) findViewById(R.id.bSeis);
        bSiete= (Button) findViewById(R.id.bSiete);
        bOcho= (Button) findViewById(R.id.bOcho);
        bNueve= (Button) findViewById(R.id.bNueve);
        bIgual= (Button) findViewById(R.id.bIgual);
        bPunto= (Button) findViewById(R.id.bPunto);
        bBorrar= (Button) findViewById(R.id.bBorrar);
        eResultado= (EditText) findViewById(R.id.eResultado);

        bCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"0");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"0");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        eResultado.setText("0");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("0");
                        num2= eResultado.getText().toString();
                    }

                }

            }
        });
        bUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"1");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"1");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"1");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("1");
                        num2= eResultado.getText().toString();
                    }

                }
            }
        });
        bDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"2");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"2");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"2");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("2");
                        num2= eResultado.getText().toString();
                    }

                }
            }
        });
        bTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"3");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"3");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"3");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("3");
                        num2= eResultado.getText().toString();
                    }

                }
            }
        });
        bCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"4");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"4");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"4");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("4");
                        num2= eResultado.getText().toString();
                    }

                }

            }
        });
        bCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"5");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"5");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"5");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("5");
                        num2= eResultado.getText().toString();
                    }

                }

            }
        });
        bSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"6");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"6");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"6");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("6");
                        num2= eResultado.getText().toString();
                    }

                }

            }
        });
        bSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"7");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"7");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"7");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("7");
                        num2= eResultado.getText().toString();
                    }

                }

            }
        });
        bOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"8");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"8");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"8");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("8");
                        num2= eResultado.getText().toString();
                    }

                }

            }
        });
        bNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(punto==true){
                    if(oper==false){
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"9");
                        num1= eResultado.getText().toString();


                    }
                    else{
                        String b= eResultado.getText().toString();
                        eResultado.setText(b+"9");
                        num2= eResultado.getText().toString();
                    }

                }
                else{
                    if(oper==false){
                        String c=eResultado.getText().toString();
                        eResultado.setText(c+"9");
                        num1= eResultado.getText().toString();

                    }
                    else{
                        eResultado.setText("9");
                        num2= eResultado.getText().toString();
                    }

                }

            }
        });
        bSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eResultado.setText("");
                op=1;
                punto=false;
                oper=true;

            }
        });
        bResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b= eResultado.getText().toString();
                if(b.equals("")&&oper==false){
                    eResultado.setText("-");
                }
                else{
                    eResultado.setText("");
                    op=2;
                    punto=false;
                    oper=true;
                }


            }
        });
        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eResultado.setText("");
                op=3;
                punto=false;
                oper=true;
            }
        });
        bMultiplicación.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eResultado.setText("");
                op=4;
                punto=false;
                oper=true;

            }
        });
        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(punto==false){
                    if(oper==false){
                        num1= eResultado.getText().toString();
                        eResultado.setText(num1+".");
                        punto=true;
                    }
                    else{
                        num2= eResultado.getText().toString();
                        eResultado.setText(num2+".");
                        punto=true;
                    }

                }



            }
        });

        bBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eResultado.setText("");
                num1="";
                num2="";
                punto=false;
                oper=false;
            }
        });

        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float Num1, Num2, resultado;
                Num1 = Float.parseFloat(num1);
                Num2= Float.parseFloat(num2);

                if(op==1){
                    resultado= Num1 + Num2;
                    eResultado.setText(Num1+"+"+Num2+"="+resultado);

                }
                if(op==2){
                    resultado= Num1 - Num2;
                    eResultado.setText(Num1+"-"+Num2+"="+resultado);
                }
                if(op==3){
                    resultado= Num1 / Num2;
                    eResultado.setText(Num1+"/"+Num2+"="+resultado);
                }
                if(op==4){
                    resultado= Num1 * Num2;
                    eResultado.setText(Num1+"*"+Num2+"="+resultado);
                }

            }
        });
    }
}
