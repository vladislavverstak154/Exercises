package notepad;

/**
 * @author Vladislav; 
 * ������� ����� ������ ������������ ����� "������ � ��������"
 */

public class Note {
	/**
	 * @param note
	 *  ���������� note ������ � ���� ���(���������) ������ */
	String note;
	
	/**
	 * ������ ����������� ����� ��������� ������ "������ � ��������" � ���������� 
	 * �������� ������ ������ � ���� note ������� "������ � ��������"
	 * @param note 
	 * ��� Sring, ������������ ����� ��������� "������ � ��������"
	 */
	public Note(String note) {
		this.note = note;
	}

	
	 
	// ������ ����� ����� �������� ��� ����� ������
	 
	protected String getNote() {
		return note;
	}

	
	 // ������ ����� ����� ��������� ��� ����� "������������� ������" � ��������
	
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
