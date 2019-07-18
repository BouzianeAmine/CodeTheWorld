package Course;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import observation.IObserver;

public class Session implements IObserver {
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");  
	public Date date;  
	public ArrayList<Note> notes;
	public Note lastNote;
	public Session(Note note) {
		init();
		lastNote=note;
		this.notes.add(note);
	}
	public Session() {
		init();
	}
	
	public void init() {
		date = new Date(System.currentTimeMillis());
		notes= new ArrayList<Note>();
	}
	
	public void addNote(Note note) {
		this.notes.add(note);
	}
	@Override
	public void update() {
		lastNote.notify();
	}
}
