package java1;
	
public class Pat {
public Pat() {
	
}
public Pat(int i, String string, int j) {
		System.out.println(i + j);
	}

	public Pat(int i, int j) {
	System.out.println(i+j);
}
	
	void ravi(int i, int j) {
		
		System.out.println( i+  j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Pat ram=new Pat(12,"jai",232);
    Pat raj=new Pat(12,223);
    Pat obj=new Pat();
    obj.ravi(2,5);
	}

	}
