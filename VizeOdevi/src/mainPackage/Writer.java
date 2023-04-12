package mainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	String [][] elit= new String[5][3];
	String [][] genel= new String[5][3];
	int x,a;
	
	Writer(int a,int b){
		this.x=a; this.a=b;
	}
	
	File file= new File("Kullanicilar.txt");
	
	public void writer() throws IOException{ //TXT DOSYASINA YAZDIRAN FONKSIYON
		
		
		FileWriter fw= new FileWriter(file,false);
		BufferedWriter bw= new BufferedWriter(fw);
		
		
		bw.write("#ELIT UYELER#\n");
		for(int i=0;i<x;i++) {
			for(int j=0;j<3;j++) {
				String line=elit[i][j]; bw.write(line + "\t");
			}
			bw.write("\n");
		}
		bw.write("#GENEL UYELER#\n");
		for(int i=0;i<a;i++) {
			for(int j=0;j<3;j++) {
				String line=genel[i][j]; bw.write(line + "\t");
			}
			bw.write("\n"); 
		} 
		bw.close();
	}

}
