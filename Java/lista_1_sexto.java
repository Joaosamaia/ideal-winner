import java.util.Scanner;
public class lista_1_sexto {
    public static void main(String[] args) {
        float num = 0; float cobre, alum;
        System.out.println("-----Nesse programa você podera, ao digitar uma certa quantidade de latao, saber quanto de cobre e quanto de aluminio constituem o latao..---");
        try (Scanner numb = new Scanner(System.in)) {
			System.out.print("Digite a quantidade de latao: "); num = numb.nextInt();	}
        cobre = num * 0.7f; alum = num * 0.3f;
        System.out.println("A quantidade de cobre e aluminio contida em "+num+" de latao e:\nCobre: "+cobre+"\nAluminio: "+alum);
    }   }