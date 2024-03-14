package odd_validate;

public class validate {
	private float multiplier;
	private float winRate;
	private float aux;
	
	public validate(float multiplier, float winRate) {
		
		this.multiplier = multiplier;
		this.winRate = winRate;
		this.aux = 100/multiplier;
	}
	
	public void oddValidate() {
		
		if(this.aux > winRate) {
			System.out.println("Aposta Válida!");
		}else {
			System.out.println("Aposta Inválida!");
		}
		
	}
}
