package def.very_04_02_20_springRestJson;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor 
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {

	
	private String id;
    private String firstName;
	private String lastName;
	
	
	
}

	
/*             dependecy to add(by maven only)
    1 lombok
	2 jackson databind
	
*/

//jackson will not call private members/attributes(to remmember)
