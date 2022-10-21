
public class Pica {
	
	public Pica(Dydis dydziai, Integer suriai, Integer peperoni) {
		super();
		this.dydziai = dydziai;
		this.suriai = suriai;
		this.peperoni = peperoni;
	}

	Dydis dydziai;
	public Dydis getDydziai() {
		return dydziai;
	}

	public void setDydziai(Dydis dydziai) {
		this.dydziai = dydziai;
	}

	public Integer getSuriai() {
		return suriai;
	}

	public void setSuriai(Integer suriai) {
		this.suriai = suriai;
	}

	public Integer getPeperoni() {
		return peperoni;
	}

	public void setPeperoni(Integer peperoni) {
		this.peperoni = peperoni;
	}

	Integer suriai;
	Integer peperoni;
	
	public Integer skaiciuotiKaina() {
		
		Integer kaina=0;
		switch(dydziai){
			
		case MAZAS:
			kaina += 11;
			break;
		case VIDUTINIS:
			kaina += 12;
			break;
		case DIDELIS:
			kaina+= 14;
			break;
			
		}
		
		kaina+=suriai*2;
		kaina+=peperoni*2;
		
	
	
	return kaina;


}
}
