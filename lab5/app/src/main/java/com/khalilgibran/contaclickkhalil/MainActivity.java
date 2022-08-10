package com.khalilgibran.contaclickkhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botaoIncrementa;
    private TextView displayValor;
    private int acumulador;

    public Button getBotaoIncrementa() {
        return botaoIncrementa;
    }

    public void setBotaoIncrementa(Button botaoIncrementa) {
        this.botaoIncrementa = botaoIncrementa;
    }

    public TextView getDisplayValor() {
        return displayValor;
    }

    public void setDisplayValor(TextView displayValor) {
        this.displayValor = displayValor;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBotaoIncrementa(findViewById(R.id.botaoIncrementa));
        setDisplayValor(findViewById(R.id.displayValorAcumulado));
        setAcumulador(10000);
        getDisplayValor().setText(Integer.toString(getAcumulador()));
    }

    public void incrementaValor(View view){
        setAcumulador(getAcumulador()+1000);
        getDisplayValor().setText(Integer.toString(getAcumulador()));
    }
}