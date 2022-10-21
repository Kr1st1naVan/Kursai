import java.util.ArrayList;
import java.util.Arrays;

public class Uzsakymas {

	

		public Uzsakymas(String uzsakymoNr, ArrayList<Pica> picos) {
		super();
		this.uzsakymoNr = uzsakymoNr;
		this.picos = picos;
	}
		String uzsakymoNr;
		public String getUzsakymoNr() {
			return uzsakymoNr;
		}
		public void setUzsakymoNr(String uzsakymoNr) {
			this.uzsakymoNr = uzsakymoNr;
		}
		public ArrayList<Pica> getPicos() {
			return picos;
		}
		public void setPicos(ArrayList<Pica> picos) {
			this.picos = picos;
		}
		ArrayList<Pica> picos;
				
	public Integer skaiciuotiUzsakymoSuma() throws NullPointerException {
		
		Integer suma=0;
		if(picos.isEmpty()) {
			throw new NullPointerException("Uzsakymas tuscias");
		}
		else {
			
			for(Pica pica : picos) {
				suma += pica.skaiciuotiKaina();
			}
		
		}
		return suma;
	}
		
	}


