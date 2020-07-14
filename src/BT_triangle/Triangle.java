package BT_triangle;

public class Triangle {
    private int edgeA;
    private int edgeB;
    private int edgeC;

    public Triangle() {
    }

    public int compareTriangle(int edgeA, int edgeB, int edgeC){
        if(edgeA <= 0 || edgeB <= 0 || edgeC <= 0 ||
                Math.abs(edgeA) > (Math.abs(edgeB)+Math.abs(edgeC)) ||
                Math.abs(edgeB) > (Math.abs(edgeA)+Math.abs(edgeC)) ||
                Math.abs(edgeC) > (Math.abs(edgeB)+Math.abs(edgeA))){
            return 0;
        }else if(edgeA == edgeB){
            if(edgeB == edgeC){
                return 3;
            }else
                return 2;
        }else if(edgeB == edgeC || edgeA == edgeC){
            return 2;
        }else
            return 1;
    }
}
