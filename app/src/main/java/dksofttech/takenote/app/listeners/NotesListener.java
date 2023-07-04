package dksofttech.takenote.app.listeners;

import dksofttech.takenote.app.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
