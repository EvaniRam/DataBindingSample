package com.evani.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.evani.databindingsample.databinding.ActivityMainBinding;
import com.evani.databindingsample.model.Note;
import com.evani.databindingsample.model.NotesData;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    private Note mNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        NotesData notes = new NotesData();
        mNote = notes.noteArray[0];

        mBinding.setNote(mNote);
    }
}
