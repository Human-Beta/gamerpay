package com.mykyta.simpletodo.repository.impl;

import com.mykyta.simpletodo.model.Note;
import com.mykyta.simpletodo.repository.NoteRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnExpression("!${local:false}")
public interface DBNoteRepository extends NoteRepository, CrudRepository<Note, Long> {
}
