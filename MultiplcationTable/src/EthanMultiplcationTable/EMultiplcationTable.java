package EthanMultiplcationTable;

public class EMultiplcationTable {

	public static void main(String[] args) {
		
		
		int [] [] multiplicationTable = new int [10] [10];
		
		for (int i=0; i<multiplicationTable.length; i++)
		{
			for (int j=0; j<multiplicationTable[i].length; j++)
			multiplicationTable [i] [j] = i*j; 
		}
			
	

	
System.out.println("Multiplication Table");
System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
for (int i=0; i<multiplicationTable.length; i++)
{
	System.out.print(i+"\t");
	for (int j=0; j<multiplicationTable[i].length; j++)
	{
	System.out.print(multiplicationTable [i] [j]+"\t");
	}
	System.out.println();
}
}
}
