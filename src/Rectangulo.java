public class Rectangulo {
	//Declaración de variables
	int base, altura;
	//Contructor a utilizar
	Rectangulo(int base, int altura)
	{
		this.base = base;
		this.altura = altura;
	}
	//aqui obtenemos el valor de la base
	int getBase()
	{
		return base;
	}
	//establecemos el valor de la base
	void setBase(int base)
	{
		this.base = base;
	}
	//obtenemos el valor de la altura
	int getAltura()
	{
		return altura;
	}
	//establecemos el valor de la altura
	void setAltura(int altura)
	{
		this.altura = altura;
	}
	//obtenemos el valor del area
	int getArea()
	{
		return base*altura;//formula para calcular el area
	}
	//obtenemos el valor del perimetro
	int getPerimetro()
	{
		return (base*2)+(altura*2);//formula para obtener el perimetro
	}
}
