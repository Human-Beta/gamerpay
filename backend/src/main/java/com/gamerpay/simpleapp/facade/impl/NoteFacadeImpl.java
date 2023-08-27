package com.gamerpay.simpleapp.facade.impl;

import com.gamerpay.simpleapp.data.NoteData;
import com.gamerpay.simpleapp.facade.NoteFacade;
import com.gamerpay.simpleapp.model.Note;
import com.gamerpay.simpleapp.service.NoteService;
import com.gamerpay.simpleapp.service.impl.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NoteFacadeImpl implements NoteFacade {

	private final NoteService noteService;
	private final MapperService mapperService;

	@Autowired
	public NoteFacadeImpl(final NoteService noteService, final MapperService mapperService) {
		this.noteService = noteService;
		this.mapperService = mapperService;
	}

	@Override
	public List<NoteData> getNotes() {
		return mapperService.mapAll(noteService.getNotes(), NoteData.class);
	}

	@Override
	public void addNote(final NoteData note) {
		final Note noteModel = mapperService.map(note, Note.class);

		noteService.addNote(noteModel);
	}
}
