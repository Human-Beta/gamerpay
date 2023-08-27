package com.gamerpay.simpleapp.service;

import com.gamerpay.simpleapp.model.Note;

import java.util.List;

public interface NoteService {
	List<Note> getNotes();

	void addNote(Note note);
}
