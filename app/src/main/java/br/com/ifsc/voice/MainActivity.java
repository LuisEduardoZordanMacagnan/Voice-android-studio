package br.com.ifsc.voice;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextToSpeech textToSpeech;
    private EditText texto;
    private TextToSpeechHelper textToSpeechHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.editTextPalavra);
        textToSpeechHelper = new TextToSpeechHelper(this);
    }

    public void falar(View view){
        textToSpeechHelper.speak(String.valueOf(texto.getText()));
    }
}