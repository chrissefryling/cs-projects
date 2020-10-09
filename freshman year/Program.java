import java.util.*;
import javax.swing.*;


public class Program 
{
	public static void main(String[] args) 
	{
		int again = 0;
		do{
			String main = "Please type in a sentence or word.";
			String sentence = JOptionPane.showInputDialog(main);
			sentence.toLowerCase();
			Program bro = new Program();
			bro.read(sentence);
			again++;
			}while(again < 100);
	}
	
	public void read(String sentence)
	{
		String[] words = sentence.split(" ");
		
		//DICTIONARY
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].equals("hello"))
			{
				words[i] = "oi";
			}
			else if(words[i].equals("hey"))
			{
				words[i] = "yo";
			}
			else if(words[i].equals("home"))
			{
				words[i] = "yard";
			}
			else if(words[i].equals("house"))
			{
				words[i] = "yard";
			}
			else if(words[i].equals("cool"))
			{
				words[i] = "safe";
			}
			else if(words[i].equals("shoes"))
			{
				words[i] = "creps";
			}
			else if(words[i].equals("shoe"))
			{
				words[i] = "crep";
			}
			else if(words[i].equals("didn't"))
			{
				words[i] = "innit";
			}
			else if(words[i].equals("obviously"))
			{
				words[i] = "bait";
			}
			else if(words[i].equals("bro"))
			{
				words[i] = "blud";
			}
			else if(words[i].equals("talk"))
			{
				words[i] = "banter";
			}
			else if(words[i].equals("pants"))
			{
				words[i] = "trousers";
			}
			else if(words[i].equals("police"))
			{
				words[i] = "old bill";
			}
			else if(words[i].equals("stop"))
			{
				words[i] = "allow it";
			}
			else if(words[i].equals("mind"))
			{
				words[i] = "marbles";
			}
			else if(words[i].equals("how") && words[i+1].equals("are") && words[i+2].equals("you"))
			{
				words[i] = "wagwun";
			}
			else if(words[i].equals("argument"))
			{
				words[i] = "argy-bargy";
			}
			else if(words[i].equals("pleased"))
			{
				words[i] = "chuffed";
			}
			else if(words[i].equals("weeks"))
			{
				words[i] = "a fortnight";
			}
			else if(words[i].equals("car"))
			{
				words[i] = "whip";
			}
			else if(words[i].equals("cars"))
			{
				words[i] = "whips";
			}
			else if(words[i].equals("place"))
			{
				words[i] = "gaff";
			}
			else if(words[i].equals("drunk"))
			{
				words[i] = "mashed";
			}
			else if(words[i].equals("vomit"))
			{
				words[i] = "chunder";
			}
			else if(words[i].equals("idiot"))
			{
				words[i] = "numpty";
			}
			else if(words[i].equals("dick"))
			{
				words[i] = "nob";
			}
			else if(words[i].equals("broke"))
			{
				words[i] = "skint";
			}
			else if(words[i].equals("sick"))
			{
				words[i] = "ill";
			}
			else if(words[i].equals("mock"))
			{
				words[i] = "mickey";
			}
			else if(words[i].equals("male"))
			{
				words[i] = "mate";
			}
			else if(words[i].equals("sleep"))
			{
				words[i] = "knip";
			}
			else if(words[i].equals("call"))
			{
				words[i] = "ring";
			}
			else if(words[i].equals("like"))
			{
				words[i] = "fancy";
			}
			else if(words[i].equals("really"))
			{
				words[i] = "bloody";
			}
			else if(words[i].equals("male"))
			{
				words[i] = "mate";
			}
			else if(words[i].equals("leave"))
			{
				words[i] = "sod off";
			}
			else if(words[i].equals("wreck"))
			{
				words[i] = "in shambles";
			}
			else if(words[i].equals("fries"))
			{
				words[i] = "chips";
			}
			else if(words[i].equals("chips"))
			{
				words[i] = "crisps";
			}
			else if(words[i].equals("big"))
			{
				words[i] = "hench";
			}
			else if(words[i].equals("nice"))
			{
				words[i] = "pang";
			}
			else if(words[i].equals("stole"))
			{
				words[i] = "jacked";
			}
			else if(words[i].equals("man") || words[i].equals("boy"))
			{
				words[i] = "mandam";
			}
			else if(words[i].equals("girl"))
			{
				words[i] = "gandam";
			}
			else if(words[i].equals("mom"))
			{
				words[i] = "mum";
			}
			else if(words[i].equals("family"))
			{
				words[i] = "fam";
			}
			else if(words[i].equals("pee"))
			{
				words[i] = "piss";
			}
			else if(words[i].equals("vagina"))
			{
				words[i] = "snatch";
			}
			else if(words[i].equals("soccer"))
			{
				words[i] = "football";
			}
			else if(words[i].equals("friends"))
			{
				words[i] = "lads";
			}
			else if(words[i].equals("friend"))
			{
				words[i] = "blud";
			}
			else if(words[i].equals("masterbate"))
			{
				words[i] = "wank";
			}
			else if(words[i].equals("funny"))
			{
				words[i] = "cheeky";
			}
			else if(words[i].equals("shower"))
			{
				words[i] = "wash";
			}
			else if(words[i].equals("ass"))
			{
				words[i] = "arse";
			}
			else if(words[i].equals("men"))
			{
				words[i] = "mates";
			}
			else if(words[i].equals("aunt"))
			{
				words[i] = "auntie";
			}
			else if(words[i].equals("store"))
			{
				words[i] = "shops";
			}
			else if(words[i].equals("kill"))
			{
				words[i] = "merk";
			}
			else if(words[i].equals("happy"))
			{
				words[i] = "gassed";
			}
			else if(words[i].equals("bitch"))
			{
				words[i] = "twat";
			}
			else if(words[i].equals("scary"))
			{
				words[i] = "dodgy";
			}
			else if(words[i].equals("sick"))
			{
				words[i] = "ill";
			}
			else if(words[i].equals("kiss"))
			{
				words[i] = "snog";
			}
			else if(words[i].equals("sex"))
			{
				words[i] = "shag";
			}
			else if(words[i].equals("kissing"))
			{
				words[i] = "snogging";
			}
			else if(words[i].equals("cigarette"))
			{
				words[i] = "vag";
			}
		}
		print(words);
	}
	
	public void print(String[] words)
	{
		String brit = "";
		for(int i =0; i < words.length; i++)
		{
			brit += words[i] + " ";
		}
		JOptionPane.showMessageDialog(null,brit);	
	}
}
