public class ABB{
	private Nodo raiz;

	public ABB(){
		this.raiz = null;
	} 

	public boolean esVacio(){
		return (this.raiz == null); 
	}

	public Nodo regresaRaiz(){
		return this.raiz;
	}

		public void insertarValor(int valor){
		if (this.raiz == null){
			System.out.println("Insertando raiz: " + valor);
			this.raiz = new Nodo();
			this.raiz.dato = valor;
			this.raiz.izquierdo = null;
			this.raiz.derecho = null;
		}
		else insertarNodo(valor, this.raiz);
	}

	public void insertarNodo(int valor, Nodo nodoRef){
			if (valor <= nodoRef.dato) {
				if (nodoRef.izquierdo == null){
					System.out.println("Insertando hijo izquierdo de: "  + nodoRef.dato + ": " + valor);
					nodoRef.izquierdo =  new Nodo();
					nodoRef.izquierdo.dato = valor;
					nodoRef.izquierdo.izquierdo = null;
					nodoRef.izquierdo.derecho = null;
				}
				else {
					insertarNodo(valor, nodoRef.izquierdo);
				}
			}
			else {
				if (valor > nodoRef.dato) {
					if (nodoRef.derecho == null){
						System.out.println("Insertando hijo derecho de: " + nodoRef.dato + ": " + valor);
						nodoRef.derecho =  new Nodo();
						nodoRef.derecho.dato = valor;
						nodoRef.derecho.izquierdo = null;
						nodoRef.derecho.derecho = null;
					}
					else {
						insertarNodo(valor, nodoRef.derecho);
					}
				}
			}
	}

	public boolean buscarNodo(int x, Nodo nodoRef) {
		if(nodoRef == null) {
			return false;
		} else if (x < nodoRef.dato) {
			return buscarNodo(x, nodoRef.izquierdo);
		} else if (x > nodoRef.dato) {
			return buscarNodo(x, nodoRef.derecho);
		} else {
			return true;
		}
	}

	public void imprimirHorizontal (int nivel, Nodo nodoRef) {
		if (nodoRef == null) {
			return;
		}

		imprimirHorizontal(nivel+1, nodoRef.derecho);

		for (int i=0; i<nivel; i++){
			System.out.println("  ");
		}

		System.out.println(nodoRef.dato + "\n");

		imprimirHorizontal(nivel+1, nodoRef.izquierdo);
	}

	public void recorridoInOrden (Nodo nodoRef) {
		if(nodoRef == null) {
			return;
		}

		recorridoInOrden(nodoRef.izquierdo);
		System.out.print(nodoRef.dato + " - ");
		recorridoInOrden(nodoRef.derecho);
	}

	public void preOrden(Nodo nodoRef) {
		if (nodoRef == null) {
			return;
		}

		System.out.print(nodoRef.dato + " - ");
		preOrden(nodoRef.izquierdo);
		preOrden(nodoRef.derecho);
	}

	public void postOrden(Nodo nodoRef) {
		if(nodoRef == null){
			return;
		}

		postOrden(nodoRef.izquierdo);
		postOrden(nodoRef.derecho);
		System.out.print(nodoRef.dato + " - ");
	}

	public void eliminaNodo (int valor) {
		this.raiz = buscarNodoAEliminar(valor, this.raiz);

	}

	public Nodo buscarNodoAEliminar(int valor, Nodo nodoRef) {
		if (nodoRef == null) {
			return null;
		}

		if (valor < nodoRef.dato) {
			nodoRef.izquierdo = buscarNodoAEliminar(valor, nodoRef.izquierdo);
		} else if (valor > nodoRef.dato) {
			nodoRef.derecho = buscarNodoAEliminar(valor, nodoRef.derecho);
		} else {
			return null;
		}

		return nodoRef;
	}
}










