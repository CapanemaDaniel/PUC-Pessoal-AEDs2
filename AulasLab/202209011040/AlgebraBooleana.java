public class AlgebraBooleana
{
	public static void main(String[] args)
	{
		String s;
		String resposta;

		s = MyIO.readLine();                                   //Leitura da entrada padrao
		while(!isFim(s))
		{

			s = parse(s);
			resposta = doExpBool(s);

			if (resposta.charAt(0) == 'f')
			{
				MyIO.println('0');                     //Escrita na saida padrao
			}//end if
			else
			{
				MyIO.println('1');                     //Escrita na saida padrao
			}//end else
			s = MyIO.readLine();                           //Leitura da entrada padrao
		}//end while
	}//end main()



	/*
	 * Recebe uma string e verifica se ela e igual a "0"
	 * A string "0" identifica o fim das entradas
	 */
	static boolean isFim(String s)
	{
		return(s.length() == 1 && s.charAt(0) == '0');
	}//end isFim()




	/*
	 * Substitui na string os valores de 'A', 'B' e 'C' por "true" ou "false"
	 * e elimina os valores no inicio restando apenas a expressao booleana 
	 */
	static String parse(String s)
	{
			if(s.charAt(2) == '1')
			{
				s = s.replace("A", "true");
			}//end if
			else
			{
				s = s.replace("A", "false");
			}//end else
			if(s.charAt(4) == '1')
                        {
                                s = s.replace("B", "true");
                        }//end if
			else
			{
				s = s.replace("B", "false");
			}//end else
			if(s.charAt(0) == '3')
			{
				if(s.charAt(6) == '1')
                        	{
                                	s = s.replace("C", "true");
                        	}//end if
				else
				{
					s = s.replace("C", "false");
				}//end else
				s = s.substring(8);

			}//end if
			else
			{
				s = s.substring(6);
			}//end else
			return s;
	}//end parse
	
	

	/*
	 * Recebe uma exprecao booleana e retorna sua resolucao
	 */
	static String doExpBool(String s)
	{
		int inicio = 0;
		int fim = 0;
		char tipo = 'a';
		String t;

		do
		{
			for(int i = 0; i < s.length() && s.contains("(")  && s.charAt(i) != ')'; i++)
			{
				if(s.charAt(i) == '(')
				{
					inicio = i + 1;
					tipo = s.charAt(i-1);
				}//end if
				fim = i;
			}//end for

			t = s.substring(inicio, fim + 1);
			switch(tipo)
			{
				case 'r':
				      	s = s.replace(s.substring((inicio - 3), (fim + 2)), or(t));
					break;
				case 'd':
					s = s.replace(s.substring((inicio - 4), (fim + 2)), and(t));
					break;
				case 't':
					s = s.replace(s.substring((inicio - 4), (fim + 2)), not(t));
					break;
			}//end switch
		
		}
		while((s.charAt(0) != 't') && (s.charAt(0) != 'f'));

		return s;
	}//end doExpBool()



	/*
	 * Recebe uma string contendo um valor booleano e executa a operacao
	 * logica not
	 */
	static String not(String s)
	{
		String resposta = "true";
		if(s.contains("true"))
		{
			resposta = "false";
		}//end if
		return resposta;
	}//end not()



	/*
	 * Recebe uma string contendo dois valores booleanos e executa a operacao
	 * logica and entre eles
	 */
	static String and(String s)
	{
		String resposta = "true";
		if(s.contains("false"))
		{
			resposta = "false";
		}//end if
		return resposta;
	}//end and()


	/*
	 * Recebe uma string contendo dois valores booleanos e executa a operacao
	 * logica or entre eles
	 */
	static String or(String s)
	{
		String resposta = "false";
		if(s.contains("true"))
		{
			resposta = "true";
		}//end if
		return resposta;
	}//end or()





}//end class
