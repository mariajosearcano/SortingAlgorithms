
package bean;

public class Ordenar {
    
    private long[] tiempoB, tiempoQ,tiempoD, tiempoC;

    public Ordenar() {
        tiempoB = new long[3];
        tiempoQ = new long[3];
        tiempoD= new long[3];
        tiempoC = new long[3];
        
    }

    public long[] getTiempoD() {
		return tiempoD;
	}

	public void setTiempoD(long[] tiempoD) {
		this.tiempoD = tiempoD;
	}
    
    public void setTiempoD(int i, long dato) {
        tiempoD[i] = dato;
    }
    


	public long[] getTiempoC() {
		return tiempoC;
	}

	public void setTiempoC(long[] tiempoC) {
		this.tiempoC = tiempoC;
	}
	
    
    public void setTiempoC(int i, long dato) {
        tiempoC[i] = dato;
    }
    


	public long[] getTiempoB() {
        return tiempoB;
    }

    public void setTiempoB(long[] tiempoB) {
        this.tiempoB = tiempoB;
    }
    
    public void setTiempoB(int i, long dato) {
        tiempoB[i] = dato;
    }

    public long[] getTiempoQ() {
        return tiempoQ;
    }

    public void setTiempoQ(long[] tiempoQ) {
        this.tiempoQ = tiempoQ;
    }
    
    public void setTiempoQ(int i, long dato) {
        tiempoQ[i] = dato;
    }
    
    
    
}
