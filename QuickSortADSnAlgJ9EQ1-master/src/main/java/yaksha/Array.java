package yaksha;

public class Array {
	private int array[];
	private int beg;
	private int end;

	public Array(int[] array, int beg, int end) {
		super();
		this.array = array;
		this.beg = beg;
		this.end = end;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getBeg() {
		return beg;
	}

	public void setBeg(int beg) {
		this.beg = beg;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}
