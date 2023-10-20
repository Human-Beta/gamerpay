package com.mykyta.simpletodo.service;

import com.mykyta.simpletodo.model.Note;

import java.util.List;

public interface NoteService {
	List<Note> getNotes();

	Note addNote(Note note);
}
