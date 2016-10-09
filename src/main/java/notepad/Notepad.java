package notepad;

/**
 * @author Vladislav 
 * ������� ������� ������ ������������ ����� �������
 * 
 * ������ ������ ������������ ����� ������� � ������� ����������
 * 
 */

public class Notepad {

	
	
	private Note[] pages = new Note[1];

	/**
	 * ���� ����������� ������� ������� ��-��������� � l=1 ������� ��� �������;
	 */
	public Notepad() {};

	/**
	 * ������ ����� ������������ ����� "�������� ������ � �������", ������ �����
	 * ���� �������� ����� � �������� ��� ����� ������, � ������ ���� �������
	 * ����� ���������� ������ ����� ������� ����� ������ ������� �� ����
	 * ������� ������ ����������� ������� � ��������� ���� ��� ���������� ������
	 * � ������� �����;
	 * 
	 * @param note
	 *            ���� �������� ��������� ��� ����� ������
	 */
	public void newNote(Note note) {

		boolean write = false;
		// � ���� ����� ����������� ����� null ������ � ������ �� ��� ���������
		// �� "����������� ������"
		for (int i = 0; i < this.pages.length & !write; i++) {
			if (this.pages[i] == null) {
				this.pages[i] = note;
				write = true;
				} else;
		}
		// ���� ������ �� ���������, �.�. ������� �������� �������������,
		// ��������� ����� ������ � ���� ����������
		// ��� ������ �������� + � ����� ��������� ����� ����������� ������,
		// ������ �� ������ ������ ����������
		// ������� �� ����� ������
		if (!write) {
			Note[] pagesNew = new Note[this.pages.length + 1];
			System.arraycopy(this.pages, 0, pagesNew, 0, this.pages.length);
			this.pages = pagesNew;
			System.out.println(this.pages.length);
			this.pages[this.pages.length - 1] = note;

		}

	}
	
/**
 * ���� ����� ��������� ������� ������ �� ��������, ��� ���� ����� ������� ������ �� 
 * ��������, ���������� ������� ����� Notepad.seeAllNotes � ����� ����� ������ ������
 * ������ �������� ������ ������ � �������� ��������� � ���� �����. ������ ����� 
 * �������, � ������ ������� ������������ ����������� � ��������.
 * @param note - �������� ���� Note.
 *  
 */
	public void delNote(Note note) {
		int i;

		for (i = 0; i < this.pages.length - 1; i++) {
			if (this.pages[i].equals(note)) {
				this.pages[i] = null;
				System.out.println("������ �������");
				//����� ���� ��� ������� ������� ����� ������� null, ��������� ����� ������
				//������ �� ������� ����� Note("������ � ��������"),� ��� ������ �������
				//������� ����� ������ null ���������� � ����� ������.
				Note[] pagesNew = new Note[this.pages.length - 1];
				 
				System.arraycopy(this.pages, 0, pagesNew, 0, i);
				System.arraycopy(this.pages, i + 1, pagesNew, i, this.pages.length - i - 1);
				this.pages = pagesNew;
				break;
			}

		}
	}

	/**
	 * ���� ����� ������������ ����� "������� ��� ������"
	 *  ������� ��� ������� ������� � ������� � �� ���������
	 */
	public void seeAllNotes() {
		for (int i = 0; i < this.pages.length; i++) {
			System.out.println("������ N" + i + " " + this.pages[i].getNote());
		}
	}

	
}
