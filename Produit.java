package EFM_v2;

public class Produit {
	private int code;
	private double prixOrigine;


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getPrixOrigine() {
		return prixOrigine;
	}

	public void setPrixOrigine(double prixOrigine) {
		this.prixOrigine = prixOrigine;
	}

	public Produit(int code, double prixOrigine) {
		super();
		this.code = code;
		this.prixOrigine = prixOrigine;
	}
	@Override
	public String toString() {
		return "code=" + code + "; prixOrigine=" + prixOrigine ;
	}
	public boolean equals(Produit obj) {
		Produit prdProduit=(Produit) obj;
		if (prdProduit.code==this.code) {
			return true;
		}else {
			return false;
		}
	}
	public double prixProduit() {
		return getPrixOrigine();
	}
	

}
