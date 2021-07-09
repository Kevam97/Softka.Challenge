package Entidades;

import java.io.*;
import java.util.ArrayList;

public class Datos {
	
	public void archivoTexto(ArrayList<String> info) {
		
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
			
			f = new File("Datos.txt");
			w = new FileWriter(f);
			bw = new BufferedWriter(w);
			wr =new PrintWriter(bw);
			
			wr.write("Lista de podio\n");
			for(String data :info)
				wr.append(data);
			
			wr.close();
			bw.close();
			
		}catch (Exception e){
			System.out.println("Error al guardar "+ e);
		}		
	}
	
	public void Leer() {
		File f;
		FileReader r;
		BufferedReader br;
		
		try {
			f = new File("Datos.txt");
			r = new FileReader(f);
			br = new BufferedReader(r);
			
			String info;
			
			while((info = br.readLine()) != null) 
				System.out.println(info);				
			br.close();
			r.close();
			
		}catch(Exception e) {
			System.out.println("Error al leer "+ e);
		}
	}

}
