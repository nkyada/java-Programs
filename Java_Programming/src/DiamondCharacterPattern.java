import java.util.Scanner;  
public class DiamondCharacterPattern  
	{  
		public static void main(String[] args)   
			{  
				char alphabet[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };  
				int alphabet_number = 0;  
				String diamond[] = new String[26];  
				System.out.print("Enter a Character between A to Z : ");  
				Scanner reader = new Scanner(System.in);  
				try   
					{  
						char user_alphabet = reader.next("[A-Z]").charAt(0);  
			 
						for (int i = 0; i < alphabet.length; i++)   
							{  
								if (alphabet[i] == user_alphabet)   
									{  
										alphabet_number = i;  
										break;  
									}  
							}  
			  
						for (int i = 0; i <= alphabet_number; i++)   
							{  
								diamond[i] = "";    
								for (int j = 0; j < alphabet_number - i; j++)   
									{  
										diamond[i] += " ";  
									}    
								diamond[i] += alphabet;   
								if (alphabet[i] != 'A')   
									{  
										for (int j = 0; j < 2 * i - 1; j++)   
											{   
												diamond[i] += " ";   
											}     
										diamond[i] += alphabet[i];   
									}      
								System.out.println(diamond[i]);   
							}   
						for (int i = alphabet_number - 1; i >= 0; i--)  
							{  
								System.out.println(diamond[i]);  
							}  
					}  
					catch (Exception e)   
						{  
							e.printStackTrace();  
						}  
					finally   
						{  
							reader.close();  
						}  
				}  
	}  