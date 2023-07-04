package dksofttech.takenote.app.listeners;

import dksofttech.takenote.app.entities.Note;

public interface InterAdListener {
    void onClick(int position, Note note, String type);
}
