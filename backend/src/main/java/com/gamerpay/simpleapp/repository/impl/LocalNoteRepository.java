package com.gamerpay.simpleapp.repository.impl;

import com.gamerpay.simpleapp.model.Note;
import com.gamerpay.simpleapp.repository.NoteRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocalNoteRepository implements NoteRepository {

	private final List<Note> notes;

	public LocalNoteRepository() {
		notes = new ArrayList<>();
		notes.add(createNote("Hello"));
		notes.add(createNote("world"));
		notes.add(createNote("how are you?"));
	}

	private static Note createNote(String value) {
		final Note note = new Note();
		note.setValue(value);

		return note;
	}

	@Override
	public List<Note> findAll() {
		return new ArrayList<>(notes);
	}

	@Override
	public void add(Note note) {
		notes.add(note);
	}
}
