package comparableTo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Student implements Comparable< Student >
{
	
	
	
	private  int student_Id;
	private double cgpa;
	private String first_Name;
	private String last_Name;
	
	
	@Override
	public int compareTo(Student s)
	{
		
		if((this.getFirst_Name().length()>8) && (this.getLast_Name().length()<5))
		{
			
			if(this.getCgpa()> s.getCgpa())
			{
			return 1;
			}
			
			if(this.getCgpa()< s.getCgpa())
			{
			return -1;
			}
			
			if(this.getCgpa()==s.getCgpa())
			{
				return 0;
				
			}
		}

		
		
		return 0;
	}


	*/

/*                       NOW USING INSTANCE OF VARIABLE                   */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Student implements Comparable {

	private int student_Id;
	private double cgpa;
	private String first_Name;
	private String last_Name;

	@Override
	public int compareTo(Object o) {
		Student s=null;

		if (o instanceof Student) {
			s = (Student)o;
		}

		if (this.getCgpa() > s.getCgpa())
			
		{

		}

		return 1;
	}
}



