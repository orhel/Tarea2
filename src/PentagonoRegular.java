public class PentagonoRegular {
	//Declaración de variable
	int lado;
	//creación de la clase
	PentagonoRegular(int lado)
	{
		this.lado = lado;
	}
	//aqui obtenemos el valor a la variable lado
	int getLado()
	{
		return lado;
	}
	//aqui establecemos el valor de la variable lado
	void setLado(int lado)
	{
		this.lado = lado;
	}
	//aqui obtenemos el valor de perimetro
	int getPerimetro()
	{
		return lado*5;//formula para el perimetro
	}
}
