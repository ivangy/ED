package Encriptado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Root {

	public static void Encriptar(String mensaje, int rot) {
		String ruta =("ROT"+rot+".txt");
		File file = new File(ruta);
		FileWriter fw=null;
			try {
				fw = new FileWriter(file, true);
			} catch (IOException e) {
				// TODO Bloque catch generado autom�ticamente
				e.printStackTrace();
			}
		PrintWriter writer = new PrintWriter(fw);

		for (int i = 0; i < mensaje.length(); i++) {
			String letra = mensaje.substring(i, i + 1);
			letra=letra.toLowerCase();
			if(letra.equals("a")||letra.equals("b")||letra.equals("c")||letra.equals("d")||letra.equals("e")||letra.equals("f")||letra.equals("g")||letra.equals("h")||letra.equals("i")||letra.equals("j")||letra.equals("k")||letra.equals("l")||letra.equals("m")||letra.equals("n")||letra.equals("�")||letra.equals("o")||letra.equals("p")||letra.equals("q")||letra.equals("r")||letra.equals("s")||letra.equals("t")||letra.equals("u")||letra.equals("v")||letra.equals("w")||letra.equals("x")||letra.equals("y")||letra.equals("z")) {
			int root=rot;
			switch (letra) {
			case "a": {root+=1;break;}
			case "b": {root+=2;break;}
			case "c": {root+=3;break;}
			case "d": {root+=4;break;}
			case "e": {root+=5;break;}
			case "f": {root+=6;break;}
			case "g": {root+=7;break;}
			case "h": {root+=8;break;}
			case "i": {root+=9;break;}
			case "j": {root+=10;break;}
			case "k": {root+=11;break;}
			case "l": {root+=12;break;}
			case "m": {root+=13;break;}
			case "n": {root+=14;break;}
			case "ñ": {root+=15;break;}
			case "o": {root+=16;break;}
			case "p": {root+=17;break;}
			case "q": {root+=18;break;}
			case "r": {root+=19;break;}
			case "s": {root+=20;break;}
			case "t": {root+=21;break;}
			case "u": {root+=22;break;}
			case "v": {root+=23;break;}
			case "w": {root+=24;break;}
			case "x": {root+=25;break;}
			case "y": {root+=26;break;}
			case "z": {root+=27;break;}
			}
			
			for (int j = 0; j < 1000; j++) {
				if (root > 27) {
					root -= 27;
				} else {
					j = 1000;
				}
			}
			
			switch (root) {
			case 1: {letra = "a";break;}
			case 2: {letra = "b";break;}
			case 3: {letra = "c";break;}
			case 4: {letra = "d";break;}
			case 5: {letra = "e";break;}
			case 6: {letra = "f";break;}
			case 7: {letra = "g";break;}
			case 8: {letra = "h";break;}
			case 9: {letra = "i";break;}
			case 10: {letra = "j";break;}
			case 11: {letra = "k";break;}
			case 12: {letra = "l";break;}
			case 13: {letra = "m";break;}
			case 14: {letra = "n";break;}
			case 15: {letra = "ñ";break;}
			case 16: {letra = "o";break;}
			case 17: {letra = "p";break;}
			case 18: {letra = "q";break;}
			case 19: {letra = "r";break;}
			case 20: {letra = "s";break;}
			case 21: {letra = "t";break;}
			case 22: {letra = "u";break;}
			case 23: {letra = "v";break;}
			case 24: {letra = "w";break;}
			case 25: {letra = "x";break;}
			case 26: {letra = "y";break;}
			case 27: {letra = "z";break;}
			}
			System.out.print(letra);
			writer.print(letra);
		}else{System.out.print(letra);
		writer.print(letra);}
		}
		writer.close();
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Bloque catch generado automaticamente
			e.printStackTrace();
		}System.out.println(" ");
	}

	public static void DesEncriptar(String ruta) {
		String num=ruta.substring(3, ruta.length());
		int rot=Integer.parseInt(num);
		File file = new File(ruta+".txt");
		FileWriter fw=null;
			try {
				fw = new FileWriter(file, true);
			} catch (IOException e) {
				// TODO Bloque catch generado automaticamente
				e.printStackTrace();
			}
		PrintWriter writer = new PrintWriter(fw);
		Reader fr = null;
		try {
			fr=new FileReader (ruta+".txt");
		} catch (FileNotFoundException e2) {
			// TODO Bloque catch generado automaticamente
			e2.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		br = new BufferedReader(fr);
		
		String mensaje="";
		try {
			mensaje = br.readLine();
		} catch (IOException e1) {
			// TODO Bloque catch generado automaticamente
			e1.printStackTrace();
		}
		for (int i = 0; i < mensaje.length(); i++) {
			String letra = mensaje.substring(i, i + 1);
			letra=letra.toLowerCase();
			if(letra.equals("a")||letra.equals("b")||letra.equals("c")||letra.equals("d")||letra.equals("e")||letra.equals("f")||letra.equals("g")||letra.equals("h")||letra.equals("i")||letra.equals("j")||letra.equals("k")||letra.equals("l")||letra.equals("m")||letra.equals("n")||letra.equals("�")||letra.equals("o")||letra.equals("p")||letra.equals("q")||letra.equals("r")||letra.equals("s")||letra.equals("t")||letra.equals("u")||letra.equals("v")||letra.equals("w")||letra.equals("x")||letra.equals("y")||letra.equals("z")) {
			int root=rot;
			switch (letra) {
			case "a": {root-=1;break;}
			case "b": {root-=2;break;}
			case "c": {root-=3;break;}
			case "d": {root-=4;break;}
			case "e": {root-=5;break;}
			case "f": {root-=6;break;}
			case "g": {root-=7;break;}
			case "h": {root-=8;break;}
			case "i": {root-=9;break;}
			case "j": {root-=10;break;}
			case "k": {root-=11;break;}
			case "l": {root-=12;break;}
			case "m": {root-=13;break;}
			case "n": {root-=14;break;}
			case "ñ": {root-=15;break;}
			case "o": {root-=16;break;}
			case "p": {root-=17;break;}
			case "q": {root-=18;break;}
			case "r": {root-=19;break;}
			case "s": {root-=20;break;}
			case "t": {root-=21;break;}
			case "u": {root-=22;break;}
			case "v": {root-=23;break;}
			case "w": {root-=24;break;}
			case "x": {root-=25;break;}
			case "y": {root-=26;break;}
			case "z": {root-=27;break;}
			}
			
			for (int j = 0; j < 1000; j++) {
				if (root>0 && root < 27) {
					root=27-root;
					root=(-root);
					break;
				} else {
					j = 1000;
				}
			}
			
			switch (root) {
			case -1: {letra = "a";break;}
			case -2: {letra = "b";break;}
			case -3: {letra = "c";break;}
			case -4: {letra = "d";break;}
			case -5: {letra = "e";break;}
			case -6: {letra = "f";break;}
			case -7: {letra = "g";break;}
			case -8: {letra = "h";break;}
			case -9: {letra = "i";break;}
			case -10: {letra = "j";break;}
			case -11: {letra = "k";break;}
			case -12: {letra = "l";break;}
			case -13: {letra = "m";break;}
			case -14: {letra = "n";break;}
			case -15: {letra = "ñ";break;}
			case -16: {letra = "o";break;}
			case -17: {letra = "p";break;}
			case -18: {letra = "q";break;}
			case -19: {letra = "r";break;}
			case -20: {letra = "s";break;}
			case -21: {letra = "t";break;}
			case -22: {letra = "u";break;}
			case -23: {letra = "v";break;}
			case -24: {letra = "w";break;}
			case -25: {letra = "x";break;}
			case -26: {letra = "y";break;}
			case -27: {letra = "z";break;}
			}
			System.out.print(letra);
			if(i==0) {
				writer.println(" ");
			}
			writer.print(letra);
		}else{System.out.print(letra);
		writer.print(letra);}
		}
		writer.close();
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Bloque catch generado automaticamente
			e.printStackTrace();
		}System.out.println(" ");
	}
}
