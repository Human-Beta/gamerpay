package com.mykyta.simpletodo.service.impl;

import com.mykyta.simpletodo.model.Note;
import com.mykyta.simpletodo.repository.NoteRepository;
import com.mykyta.simpletodo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

	private final NoteRepository noteRepository;

	@Autowired
	public NoteServiceImpl(final NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}

	@Override
	public List<Note> getNotes() {
		return noteRepository.findAll();
	}

	@Override
	public Note addNote(Note note) {
		return noteRepository.save(note);
	}
}
