import java.util.Scanner;
class CRC {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System. in );
		int m,g[],n,d[],z[],r[],msb,i,j,k;
		System.out.print("Enter no. of data bits : ");
		n = sc.nextInt();
		System.out.print("Enter no. of generator bits : ");
		m = sc.nextInt();
		d = new int[n + m];
		g = new int[m];
		System.out.print("Enter data bits : ");
		for (i = 0; i < n; i++)
			d[i] = sc.nextInt();//saving the divisor
		System.out.print("Enter generator bits : ");
		for (j = 0; j < m; j++)//saving the generator
			g[j] = sc.nextInt();
		for (i = 0; i < m - 1; i++)
			d[n + i] = 0;
		r = new int[m + n];
		for (i = 0; i < m; i++)
			r[i] = d[i];
	
		z = new int[m];
		for (i = 0; i < m; i++)
			z[i] = 0;
		for (i = 0; i < n; i++) {
			k = 0;
			msb = r[i];//checking most signifcant bits
			for (j = i; j < m + i; j++) {
				//if msb is zero than do nothing
				if (msb == 0) r[j] = r[j]^z[k];
				else r[j] = r[j]^g[k];//if then do xor
				k++;
			}
			r[m + i] = d[m + i];//add next bit
		}
		System.out.print("The code bits added are : ");
		for (i = n; i < n + m - 1; i++) {
			d[i] = r[i];
			System.out.print(d[i]);
		}
		System.out.print("\nThe code data is : ");
		for (i = 0; i < n + m - 1; i++) {
			System.out.print(d[i]);
		}
	}
	}