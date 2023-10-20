package com.mykyta.simpletodo.repository;

import com.mykyta.simpletodo.model.Note;

import java.util.List;

public interface NoteRepository {
	List<Note> findAll();

	Note save(Note note);
}
