public class Jogadores
{
	public void iniciaJogo()
	{
		Jogador p1 = new Jogador();
		Jogador p2 = new Jogador();
		Jogador p3 = new Jogador();

		int j1Palpite;
		int j2Palpite;
		int j3Palpite;

		boolean p1EstaCerto = false;
		boolean p2EstaCerto = false;
		boolean p3EstaCerto = false;

		while (true)
		{
			// Toda vez que não tiver um vencedor o número para adivinhar mudará
			int varNumeroSorteado = (int) (Math.random()*10);
			System.out.println("Estou pensando em um número de 0 a 9...");

			System.out.println("O número a adivinhar é...:" + varNumeroSorteado + "\n");

			p1.setPalpite();
			j1Palpite = p1.getPalpite();
			System.out.println("O jogador 1 forneceu o palpite " + j1Palpite + "\n");

			p2.setPalpite();
			j2Palpite = p2.getPalpite();
			System.out.println("O jogador 2 forneceu o palpite " + j2Palpite + "\n");

			p3.setPalpite();
			j3Palpite = p3.getPalpite();
			System.out.println("O jogador 3 forneceu o palpite " + j3Palpite + "\n");

			if (j1Palpite == varNumeroSorteado)
			{
				p1EstaCerto = true;
			}
			if (j2Palpite == varNumeroSorteado)
			{
				p2EstaCerto = true;
			}
			if (j3Palpite == varNumeroSorteado)
			{
				p3EstaCerto = true;
			}

			if (p1EstaCerto || p2EstaCerto || p3EstaCerto)
			{
				System.out.println("Temos um vencedor!!!");
				System.out.println("O jogador um acertou? " + p1EstaCerto);
				System.out.println("O jogador dois acertou? " + p2EstaCerto);
				System.out.println("O jogador três acertou? " + p3EstaCerto);
				System.out.println("Fim do Jogo.");
				break;
			} else
			{
				System.out.println("Os jogadores terão que tentar novamente\n");
				System.out.println("-----------------------------------------");
			}
		}
	}

}
