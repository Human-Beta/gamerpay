package com.gamerpay.simpleapp.repository;

import com.gamerpay.simpleapp.model.Note;

import java.util.List;

public interface NoteRepository {
	List<Note> findAll();

	void add(Note note);
}
