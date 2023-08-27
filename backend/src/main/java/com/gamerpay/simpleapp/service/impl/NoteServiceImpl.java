package com.gamerpay.simpleapp.service.impl;

import com.gamerpay.simpleapp.model.Note;
import com.gamerpay.simpleapp.repository.NoteRepository;
import com.gamerpay.simpleapp.service.NoteService;
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
	public void addNote(Note note) {
		noteRepository.save(note);
	}
}
