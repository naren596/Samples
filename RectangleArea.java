
public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int rec1 = (C-A) * (D-B);
		int rec2 = (G-E) * (H-F);
		if(C <= E || G <= A || H <= B || D <= F) return rec1 + rec2;
		if(E > A && F > B && G < C && H < D) return rec1;
		if(A > E && B > F && C < G && D < H) return rec2;
		
		int len = 0, wid = 0;
		if(A > E && C < G) len = C-A;
		else if(E > A && G < C) len = G-E;
		else len = Math.min(Math.abs(E-C), Math.abs(A-G));
		
		if(D < H && B > F) wid = D-B;
		else if(D > H && B < F) wid = H-F;
		else wid = Math.min(Math.abs(B-H), Math.abs(F-D));
		int recInt =  len * wid ;
        return rec1+rec2-recInt;
    }
}
