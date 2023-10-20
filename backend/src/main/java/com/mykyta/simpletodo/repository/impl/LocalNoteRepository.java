package com.mykyta.simpletodo.repository.impl;

import com.mykyta.simpletodo.model.Note;
import com.mykyta.simpletodo.repository.NoteRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConditionalOnExpression("${local:false}")
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
	public Note save(Note note) {
		notes.add(note);

		return note;
	}
}
