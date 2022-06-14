package exercicios.java.br;

/*
Exercício Turma de Alunos

(*) E.P.J. para receber o nome de um aluno com suas respectivas 2 notas, em seguida calcular a
média do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno.
(aprovado com média >= 6).

(*) Utilizar o código para uma turma de 30 alunos.
(*) Calcular e mostrar a média geral da turma
(*) Mostrar a maior média da turma
(*) Mostrar a menor média da turma
 */

import java.util.Scanner;

public class TurmaAlunos {
    public static void main(String[] args) {

        //para dar entrada no sistema
        Scanner scan = new Scanner(System.in);
        //declarando as variaveis solicitadas no exercicio
        String aluno[];
        float nota1[],nota2[], media[], mediaTurma;

        //utilizando vetor para classe de 30 alunos conforme proposto
        aluno = new String[30];
        nota1 = new  float[30];
        nota2 = new float[30];
        media = new float[30];

        //informando que o laço de repetição inicia-se com a mediaTurmo no 0
        mediaTurma = 0;

        //laço de repetição para dar entrada no nome do aluno e nas notas
        for (int i = 0;i < 3;i ++) {
            System.out.print("Nome do aluno: " );
            aluno[i] = scan.nextLine();
            System.out.print("Nota1: ");
            nota1[i] = scan.nextFloat();
            System.out.print("Nota2: ");
            nota2[i] = scan.nextFloat();
            scan.nextLine();

            //para calcular a media do aluno
            media[i] = (nota1[i] + nota2[i])/2;
            //calculando a media da turma
            mediaTurma += media[i];
            System.out.printf("Media do aluno é %.1f\n", media[i]);

            //informando a condição para o aluno ser aprovado
            if (media[i] >= 6) {
                System.out.print("Aluno aprovado, parabéns!\n");
            }else {
                System.out.print("Aluno reprovado.\n");
            }

            //para calcular a media da turma
            mediaTurma /= 3;
            for (i = 3; i < 3; i ++) {
                System.out.printf("Aluno: %s - Media: %.1f\n", aluno[i],media[i]);
            }
            System.out.printf("Media da turma = %.1f\n", mediaTurma);

            // Melhor aluno da turma
            // Pior aluno da turma
            // Alunos com média abaixo da média da turma
            if (media[i] >= mediaTurma) {
                System.out.println("Melhor aluno da turma.");
            } else if (media[i] > mediaTurma) {
                System.out.println("Aluno abaixo da media.");
            } else {
                System.out.println("Pior nota da turma.");
            }
            scan.close();
        }
    }
}
