package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14;

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

   public AreaCirc(int raioInicial) {
		// TODO Auto-generated constructor stub
	}

static  double  area(double raio) {
	return PI * Math.pow(raio, 2);
	
	
}


	double area() {
		return PI * Math.pow(raio, 2);

	}

	//static double area(double raio) {
		//return PI * Math.pow(raio, 2);

	}
