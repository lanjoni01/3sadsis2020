package aula20200413.garrafa;

public class AppGarrafa {
	public static void main(String[] args) {
		Garrafa garrafa = new Garrafa();
		garrafa.setCor("preto");
		
		garrafa.encherGarrafa();
		System.out.println(garrafa.getQuantidadeEmMl());
		
		garrafa.esvaziar();
		System.out.println(garrafa.getQuantidadeEmMl());
		
		garrafa.encherGarrafa(200);
		garrafa.encherGarrafa(50);
		System.out.println(garrafa.getQuantidadeEmMl());
		garrafa.tomar(30.0);
		System.out.println(garrafa.getQuantidadeEmMl());
	}
}
