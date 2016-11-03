package notepad;

/**
 * @author Vladislav; 
 * Objects of this class represents "Запись в блокноте"
 */

public class Note {
	/**
	 * @param note
	 *  This variable note stores the title of note */
	String note;
	
	/**
	 * This constructor creates a note in notepad 
	 * whith title "note"
	 * @param note 
	 * String, represents the title of note 
	 */
	public Note(String note) {
		this.note = note;
	}

	
	 
	// Данный метод будет выводить имя новой записи
	 
	protected String getNote() {
		return note;
	}

	
	 /**
	  * This method allows to correct note in the Notepad
	  * @param note
	  */
	
	 public void setNote(String note) {
		this.note = note;
	}
	
	protected boolean equals(Note note){
		if(this.note.equals(note.getNote())){
			return true;
		}
		else {return false;}
	}
	
	
}
