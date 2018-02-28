import java.util.ArrayList;


public class Tripel {
	private int[] t=new int[3];
	public Tripel(int a, int b, int c){
		t[0]=a;
		t[1]=b;
		t[2]=c;
	}
	public String toString(){
		return "("+t[0]+"/"+t[1]+"/"+t[2]+")";
	}
	public static ArrayList<Tripel> getTripel(int n){
		ArrayList<Tripel> t=new ArrayList<Tripel>();
		for(int i=3;i<=n;i++){
			for(int j=2;j<i;j++){
				for(int k=1;k<j;k++){
					if(i+j+k==n){
						if(i*i==j*j+k*k){
							t.add(new Tripel(k,j,i));
						}
					}
				}
			}
		}
		return t;
	}
	// Test
	/*public static void main(String args[]){
		System.out.println(getTripel(12));
	}*/
}
