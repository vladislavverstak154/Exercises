package notepad;

/**
 * @author Vladislav 
 * The objects of this class represents Notepads
 * 
 */

public class Notepad {

	
	
	private Note[] pages = new Note[1];

	/**
	 * This constructor creates the notepad with one place for note;
	 */
	public Notepad() {};

	/**
	 * This method adds a note into a notepad, if the notepad has no emprty places
	 * for new note, this method creates a new array of pages for one position
	 * greater then previos and copy all notes there plus a new note. 
	 * 
	 * @param note
	 *            the title of new note
	 */
	public void newNote(Note note) {

		boolean write = false;
		// в этом цикле выполняется поиск null ссылок и первая из них заменится
		// на "Добавленную запись"
		for (int i = 0; i < this.pages.length & !write; i++) {
			if (this.pages[i] == null) {
				this.pages[i] = note;
				write = true;
				} else;
		}
		// если замены не произошло, т.е. блокнот оказался переполненным,
		// создается новый массив и туда копируются
		// все записи блокнота + в новое свободное место добавляется запись,
		// ссылка на старый массив заменяется
		// ссылкой на новый массив
		if (!write) {
			Note[] pagesNew = new Note[this.pages.length + 1];
			System.arraycopy(this.pages, 0, pagesNew, 0, this.pages.length);
			this.pages = pagesNew;
			System.out.println(this.pages.length);
			this.pages[this.pages.length - 1] = note;

		}

	}
	
/**
 * This method allows to delete notes from notepad, to delete note from notepad 
 * call method Notepad.seeAllNotes and then use index of proper note use this note 
 * as a parameter for this method. The note will be deleted and the array of notes
 * decrease for one note
 *  
 * @param note - parameter of type Note.
 *  
 */
	public void delNote(Note note) {
		int i;

		for (i = 0; i < this.pages.length - 1; i++) {
			if (this.pages[i].equals(note)) {
				this.pages[i] = null;
				System.out.println("Запись удалена");
				//после того как элемент массива сталл ссылкой null, создается новый массив
				//ссылок на объекты класс Note("Запись в блокноте"),и все ссылки старого
				//массива кроме ссылки null копируются в новый массив.
				Note[] pagesNew = new Note[this.pages.length - 1];
				 
				System.arraycopy(this.pages, 0, pagesNew, 0, i);
				System.arraycopy(this.pages, i + 1, pagesNew, i, this.pages.length - i - 1);
				this.pages = pagesNew;
				break;
			}

		}
	}

	/**
	 * This metod output all titles and indexes of notes in notepad
	 * 
	 */
	public void seeAllNotes() {
		for (int i = 0; i < this.pages.length; i++) {
			System.out.println("Запись N" + i + " " + this.pages[i].getNote());
		}
	}

	
}
