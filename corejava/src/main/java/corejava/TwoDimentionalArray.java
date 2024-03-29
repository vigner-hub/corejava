package corejava;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 1.declare an arrray 2.add values into array 3.find size of an array
		 * 4.read single value from an array 5.read multiple values from an
		 * array
		 */

		// approach 1
		int a[][] = new int[5][5];

		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 500;
		a[1][1] = 600;

		// approach 2
		// int a[][]=new int[5][5];
		/// int [][]a=new int[5][5];
		// int []a[]=new int[5][5];

		int b[][] = {{100, 200}, {300, 600}, {400, 700}, {500, 550},
				{600, 400}};
		/*
		 * System.out.println("number of row :"+b.length);
		 * System.out.println("number of colums:"+b[0].length); //to read 2nd
		 * row and first col
		 * System.out.println("first row and first col value:"+b[0][0]);
		 */

		// to read all row and colum
		// normal for loop
		// out for loop for row and
		// inner for loop for read colums
		for (int r = 0; r <= 4; r++) // 0
		{
			// for(int c=0; c<=1; c++) //0
			// for(int c=0; c<b[r].length; c++)
			for (int c = 0; c <= b[r].length - 1; c++) // if we use <= use -1
			{
				System.out.print(b[r][c] + "  ");
			}
			System.out.println();

			// enchanced for loop

			/*for (int arr[] : b) 
			{
				for (int x : arr) 
				{
					System.out.print(x+" ");
				}

			}System.out.println();*/

		}

	}
}
