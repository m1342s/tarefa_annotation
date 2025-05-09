package pck;

public class LerTabela {

	public static void main(String[] args)   {
		Class<Clientes> clazz=Clientes.class;
		if(clazz.isAnnotationPresent(Tabela.class)) {
			Tabela anotacao=clazz.getAnnotation(Tabela.class);
			System.out.println("Valor:" + anotacao.valor());
		}
	}

}
