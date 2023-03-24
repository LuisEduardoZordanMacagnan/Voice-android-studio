package br.com.ifsc.voice;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class TextToSpeechHelper implements TextToSpeech.OnInitListener {
    private TextToSpeech tts;
    private Boolean load = false;

    public TextToSpeechHelper(Context context){
        tts = new TextToSpeech(context, this);
    }

    @Override
    public void onInit(int status) {
        if(status==TextToSpeech.SUCCESS){
            tts.setLanguage(Locale.getDefault());
            load=true;
        }
    }

    public void speak(String text){
        if(load){
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
        }
    }
}
