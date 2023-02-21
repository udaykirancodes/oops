package dept;

class CSE
{
	void displaySubjects()
	{
		System.out.println("CSE :\n 1.OOPS 2.DBMS 3. Operating Systems");
	}
}

class ECE
{
	void displaySubjects()
	{
		System.out.println("ECE :\n 1.Control Systems 2.Analog Circuits 3.PTSP");
	}
}

class ME
{
	void displaySubjects()
	{
		System.out.println("ME :\n 1.Strenth of materials 2.Mechanics of maerials 3. BEE");
	}
}

class CE
{
	void displaySubjects()
	{
		System.out.println("CE :\n 1.BEE 2.M4 3.Mechanics");
	}
}

class Departments
{
	public static void main(String[] args)
	{
		CSE cse=new CSE();
		cse.displaySubjects();

		ECE ece=new ECE();
		ece.displaySubjects();

		ME me=new ME();
		me.displaySubjects();

		CE ce=new CE();
		ce.displaySubjects();
	}
}