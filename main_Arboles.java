public class main_Arboles {

public static void main (String[] args){
		ABB arbol = new ABB();

		arbol.insertarValor(25);
		arbol.insertarValor(8);
		arbol.insertarValor(29);
		arbol.insertarValor(38);
		arbol.insertarValor(27);
		arbol.imprimirHorizontal(0, arbol.regresaRaiz());
		arbol.buscarNodo(8, arbol.regresaRaiz());
		arbol.recorridoInOrden(arbol.regresaRaiz());
		System.out.println(" ");
		arbol.preOrden(arbol.regresaRaiz());
		System.out.println(" ");
		arbol.postOrden(arbol.regresaRaiz());
		System.out.println(" ");
		arbol.eliminaNodo(27);
		arbol.imprimirHorizontal(0, arbol.regresaRaiz());
	}
}