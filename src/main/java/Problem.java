// The following example code solves the sum of two numbers
// Make sure you read and write EXACTLY in the specified format of the Problem
// and you don't print more or less, otherwise the checker will consider it a
// wrong answer

import java.util.*;
import java.lang.*;
import java.io.*;

// Your class should be named Problem otherwise it will not be compiled
class Problem {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		int st = 0;
		int dr = 0;
		int lung = 0;
		ArrayList<Integer> sta = new ArrayList<Integer>();
		ArrayList<Integer> dre = new ArrayList<Integer>();
		ArrayList<Integer> lungime = new ArrayList<Integer>();


		int i = 0;
		int flag = 0;
		int n = in.nextInt();
		int[] F = new int[n + 1];
		for (i = 1; i <= n; i++)
			F[i] = 0;
		int[] arr = new int[n + 1];
		for (i = 1; i <= n; i++) {
			F[i] = in.nextInt();
		}
		//System.out.println(a + b);


		for (i = 1; i <= n; i++) {
			F[arr[i]] = 1;//care numere se afla in sir
		}

		for (int nr = 1; nr <= n; nr++) {//numarul si lungimea secventei
			if (F[nr] == 1) {
				st = 1;//ceva trebuie sa fie
				dr = 1;
				flag = 0;
				for (int j = 1; j <= n; j++)
					if (arr[j] == nr) {
						if (flag == 0) {
							st = j;
							dr = j;
							flag = 1;
						} else
							dr = j;
					}

				if (st < dr) {
					int aux = dr - st + 1;//lungimea secventei
					dre.add(new Integer(dr));
					sta.add(new Integer(st));
					lungime.add(new Integer(aux));
					if (aux > lung)
						lung = aux;
				}
			}
		}//liste cu capetele seceventelor si lungime

		while (lungime.get(i) != lung)
			i++;
		System.out.print(sta.get(i) + " ");
		System.out.print(dre.get(i));
	}
}