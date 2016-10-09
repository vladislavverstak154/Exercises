package notepad;

/**
 * @author Vladislav; 
 * Объекты этого класса представляют собой "Запись в блокноте"
 */

public class Note {
	/**
	 * @param note
	 *  Переменная note хранит в себе имя(заголовок) записи */
	String note;
	
	/**
	 * Данный конструктор будет создавать объект "Запись в блокноте" и передавать 
	 * значение данной записи в поле note объекта "Запись в блокноте"
	 * @param note 
	 * тип Sring, представляет собой заголовок "Записи в блокноте"
	 */
	public Note(String note) {
		this.note = note;
	}

	
	 
	// Данный метод будет выводить имя новой записи
	 
	protected String getNote() {
		return note;
	}

	
	 // Данный метод будет позволять нам позже "Редактировать запись" в блокноте
	
	 protected void setNote(String note) {
		this.note = note;
	}
	
	protected boolean equals(Note note){
		if(this.note.equals(note.getNote())){
			return true;
		}
		else {return false;}
	}
	
	
}
