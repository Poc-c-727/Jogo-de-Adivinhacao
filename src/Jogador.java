public class Jogador
{
	private int palpite;

	public void setPalpite()
	{
		palpite = (int)(Math.random()*10);
		System.out.println("Estou pensando em " + palpite);
	}

	public int getPalpite()
	{
		return palpite;
	}
}
