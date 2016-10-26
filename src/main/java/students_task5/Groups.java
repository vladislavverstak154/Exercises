package students_task5;

import notepad.Note;

public class UnivList<T> {
	T[] list;
	
	public void newNote(T... note) {

		boolean write = false;
		// в этом цикле выполняется поиск null ссылок и первая из них заменится
		// на "Добавленную запись"
		for (int i = 0; i < this.list.length & !write; i++) {
			if (this.T[i] == null) {
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
 * Этот метод позволяет удалять записи из блокнота, для того чтобы удалить запись из 
 * блокнота, необходимо вызвать метод Notepad.seeAllNotes и потом через индекс нужной
 * записи передать Объект записи в качестве параметра в этот метод. Запись будет 
 * удалена, а массив записей автоматиески уменьшиться в размерах.
 * @param note - параметр типа Note.
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
	 * Этот метод представляет собой "Вывести все записи"
	 *  выводит все индексы записей в массиве и их заголовки
	 */
	public void seeAllNotes() {
		for (int i = 0; i < this.pages.length; i++) {
			System.out.println("Запись N" + i + " " + this.pages[i].getNote());
		}
	}

}
