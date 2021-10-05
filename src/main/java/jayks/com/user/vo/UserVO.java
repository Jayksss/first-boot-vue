package jayks.com.user.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class UserVO {
	
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	Date hireDate;
	String jobId;
	int salary;
	int commissionPct;
	int managerId;
	int departmentId;
}