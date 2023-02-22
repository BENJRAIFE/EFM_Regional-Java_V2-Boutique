package EFM_v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Boutique {
private ArrayList<Produit> produits=new ArrayList<Produit>();
	public Boutique() {
		// TODO Auto-generated constructor stub
	}
	public int indiceDe(int code) {
	int indice=0;
		for(Produit pr:produits) {
			if (pr.getCode()==code) {
				indice=produits.indexOf(pr);
			}else {
				indice=-1;
			}
		}
		return indice;
	}
	public void ajouter(Produit p) throws Exception {
		if (produits.contains(p)) {
			throw new Exception("le produit déja existe");
		}else {
			produits.add(p);
		}
	}
	public boolean supprimer(int code)throws Exception {
		boolean etat = false;
		for(Produit prd:produits) {
			if (prd.getCode()==code) {
				produits.remove(prd);
				etat= true;
			}else {
				throw new Exception("le produit n'existe pas");
			}
		}
		return etat;
		
	}
	public boolean supprimer(Produit p)throws Exception {
		boolean etat = false;
		if (produits.contains(p)) {
			produits.remove(p);
			etat= true;
		}else {
			throw new Exception("le produit n'existe pas");
		}
		return etat;
	}
	public int nombreProduitsEnSolde() {
		int nmbr=0;
		for(Produit prt:produits) {
			if (prt instanceof ProduitEnSolde) {
				nmbr=nmbr+1;
			}
		}
		return nmbr;
	}
	public void enregistrer(String chemin) throws IOException {
		File file=new File(chemin);
		FileOutputStream outputStreamWriter=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStreamWriter);
		objectOutputStream.writeObject(produits);
		objectOutputStream.close();
		outputStreamWriter.close();
		
	}
	
}
