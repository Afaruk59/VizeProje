package mainPackage;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		Scanner scan= new Scanner(System.in);
		
		System.out.println("1-Elit Uye Ekleme\n2-Genel Uye Ekleme\n3-Mail Gonderme\n4-Cikis Yap");
		
		String [][] elit= new String[5][3];
		String [][] genel= new String[5][3];                                                   //DEGISKENLERI VE NESNELERI TANIMLAMA
		
		elit[0][2]= ""; elit[1][2]= ""; elit[2][2]= ""; elit[3][2]= ""; elit[4][2]= "";
		genel[0][2]= ""; genel[1][2]= ""; genel[2][2]= ""; genel[3][2]= ""; genel[4][2]= "";
	
		int islem= sc.nextInt();
		int x=0,y=0; 
		int a=0,b=0;
		int islem2;
		
		Mail m= new Mail();
		
		while(islem!=4 && islem!=3) {
			
			if(islem==1) {																//ISIM SOYISIM VE MAILLERI KAYDETME
				System.out.print("Isim= "); String isim= sc.next();
				System.out.print("Soyisim= "); String soyisim= sc.next();
				System.out.print("Mail= "); String mail= sc.next();
				System.out.print("Kullanici Kaydedildi.");
				elit[x][y]= isim; y++;
				elit[x][y]= soyisim; y++;
				elit[x][y]= mail; y=0; x++;
				
			}
			else if(islem==2) {
				System.out.print("Isim= "); String isim= sc.next();
				System.out.print("Soyisim= "); String soyisim= sc.next();
				System.out.print("Mail= "); String mail= sc.next();
				System.out.print("Kullanici Kaydedildi.");
				genel[a][b]= isim; b++;
				genel[a][b]= soyisim; b++;
				genel[a][b]= mail; b=0; a++;
			}
			System.out.print("\n\nBaska bir islem?: ");
			islem= sc.nextInt();
		}
		
		while(islem!=4) {																				//TERCIHE GORE UYELERE MAIL ATMA
			if(islem==3) {
				String mail;
				System.out.println("1-Elit Uyelere Mail\n2-Genel Uyelere Mail\n3-Tum Uyelere Mail");
				islem2= sc.nextInt();
				
				System.out.print("Gonderilecek Mail: ");  
				mail = scan.nextLine();
				
				m.elit[0]=elit[0][2]; m.elit[1]=elit[1][2]; m.elit[2]=elit[2][2]; m.elit[3]=elit[3][2]; m.elit[4]=elit[4][2];
				m.genel[0]=genel[0][2]; m.genel[1]=genel[1][2]; m.genel[2]=genel[2][2]; m.genel[3]=genel[3][2]; m.genel[4]=genel[4][2]; 
				
				if(islem2==1) {
					m.elitmail(mail); System.out.print("Mail Basariyla Gonderildi.");
				}
				
				if(islem2==2) {
					m.genelmail(mail); System.out.print("Mail Basariyla Gonderildi.");
				}
				
				if(islem2==3) {
					m.tummail(mail); System.out.print("Mail Basariyla Gonderildi.");
				}
					
			}
			System.out.print("\n\nBaska bir islem?: ");
			islem= sc.nextInt();
		}
		if(islem==4) {
			Writer wr= new Writer(x,a);														//SON OLARAK UYELERI TXT DOSYASINA YAZDIRMA
			
			wr.elit[0][0]=elit[0][0]; wr.elit[0][1]=elit[0][1]; wr.elit[0][2]=elit[0][2]; 
			wr.elit[1][0]=elit[1][0]; wr.elit[1][1]=elit[1][1]; wr.elit[1][2]=elit[1][2]; 
			wr.elit[2][0]=elit[2][0]; wr.elit[2][1]=elit[2][1]; wr.elit[2][2]=elit[2][2];
			wr.elit[3][0]=elit[3][0]; wr.elit[3][1]=elit[3][1]; wr.elit[3][2]=elit[3][2];
			wr.elit[4][0]=elit[4][0]; wr.elit[4][1]=elit[4][1]; wr.elit[4][2]=elit[4][2];
			
			wr.genel[0][0]=genel[0][0]; wr.genel[0][1]=genel[0][1]; wr.genel[0][2]=genel[0][2]; 
			wr.genel[1][0]=genel[1][0]; wr.genel[1][1]=genel[1][1]; wr.genel[1][2]=genel[1][2]; 
			wr.genel[2][0]=genel[2][0]; wr.genel[2][1]=genel[2][1]; wr.genel[2][2]=genel[2][2];
			wr.genel[3][0]=genel[3][0]; wr.genel[3][1]=genel[3][1]; wr.genel[3][2]=genel[3][2];
			wr.genel[4][0]=genel[4][0]; wr.genel[4][1]=genel[4][1]; wr.genel[4][2]=genel[4][2];
			
			wr.writer();
			
			System.out.print("Cikis Yapiliyor...");
		}
		
	}
	
}
