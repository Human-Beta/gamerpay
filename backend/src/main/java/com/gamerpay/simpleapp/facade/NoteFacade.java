package com.gamerpay.simpleapp.facade;

import com.gamerpay.simpleapp.data.NoteData;

import java.util.List;

public interface NoteFacade {
	List<NoteData> getNotes();

	void addNote(NoteData note);
}
