package com.mykyta.simpletodo.facade;

import com.mykyta.simpletodo.data.NoteData;

import java.util.List;

public interface NoteFacade {
	List<NoteData> getNotes();

	NoteData addNote(NoteData note);
}
