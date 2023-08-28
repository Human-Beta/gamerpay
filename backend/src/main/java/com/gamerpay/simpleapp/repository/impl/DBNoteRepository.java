package com.gamerpay.simpleapp.repository.impl;

import com.gamerpay.simpleapp.model.Note;
import com.gamerpay.simpleapp.repository.NoteRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnExpression("!${local:false}")
public interface DBNoteRepository extends NoteRepository, CrudRepository<Note, Long> {
}
