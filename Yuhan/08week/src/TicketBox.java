
public class TicketBox {
	// [ �߻�ȭ ]
	// �Ӽ� : ��ȭ�����, �ݾ׵�, �¼���ȣ��
	// ��� : ��ȭ�� �����Ѵ�, �¼���ȣ�� �����Ѵ�, �ݾ��� �����Ѵ�, Ƽ���� �޴´�, �ܾ��� �޴´�.
	
	String[] titles = new String[3];	// ����
	int [] pays = new int[3];			// �ݾ�
	String seatNum;						// �¼���ȣ
	
	public void choiceMoive(int titleNum) {
		System.out.println(titles[titleNum-1] + " ��ȭ�� ���õǾ����ϴ�.");
	}

	public String[] getTitles() {
		return titles;
	}

	public void setTitles(String[] titles) {
		this.titles = titles;
	}

	public int[] getPays() {
		return pays;
	}

	public void setPays(int[] pays) {
		this.pays = pays;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	
	public void displayMovies() {
		
	}
}
