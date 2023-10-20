package com.mykyta.simpletodo.facade.impl;

import com.mykyta.simpletodo.data.NoteData;
import com.mykyta.simpletodo.facade.NoteFacade;
import com.mykyta.simpletodo.model.Note;
import com.mykyta.simpletodo.service.NoteService;
import com.mykyta.simpletodo.service.impl.MapperService;
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
	public NoteData addNote(final NoteData note) {
		final Note noteModel = mapperService.map(note, Note.class);

		return mapperService.map(noteService.addNote(noteModel), NoteData.class);
	}
}
