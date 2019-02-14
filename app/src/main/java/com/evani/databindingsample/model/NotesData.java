package com.evani.databindingsample.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotesData {
    public Note[] noteArray = {note1,note2,note3,note4};

    public Map<String,Note> noteMap = new HashMap<>();

    public NotesData() {
        for (Note note:noteArray) {
            noteMap.put(note.getNoteTitle(),note);
        }
    }

    public static final Note note1 = new Note("Groceries","Need to go to DMart this weekend");
    public static final Note note2 =  new Note("LearnAndroid","Android App Development Practice");
    public static final Note note3 =  new Note("Kotlin","Kotlin Programming ");
    public static final Note note4=  new Note("RxJava","Reactive Programming in Java ");




}
