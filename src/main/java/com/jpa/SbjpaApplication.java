package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepo;
import com.jpa.entity.User;

@SpringBootApplication
public class SbjpaApplication {

	public static void main(String[] args) {
	ApplicationContext con	=SpringApplication.run(SbjpaApplication.class, args);
	UserRepo userRepo = con.getBean(UserRepo.class);
//	
//	User u=new User();
//	u.setName("rakesh");
//	u.setCity("delhi");
//	u.setStatus("i am java developer");
//	
//	User user1=userRepo.save(u);
//	System.out.println(user1);
	
//	User user1=new User();
//	user1.setName("rakesh");
//	user1.setCity("shicanfoan");
//	user1.setStatus("i jaca ");
//	
//	User user2=new User();
//	user2.setName("aniket");
//	user2.setCity("oan");
//	user2.setStatus("i puna ");
	
	//saving single user 
	//User resultuser = userRepo.save(user2);
	
	//save multiple object
//	List<User> users = List.of(user1,user2);
//	
//	Iterable<User> result = userRepo.saveAll(users);
//	result.forEach(user->{
//		System.out.println(user);
//	});
//	//System.out.println("saved user"+resultuser);
//	System.out.println("done");
	
	
	
	
	//update aniket id 2
//	Optional<User> optional = userRepo.findById(2);
//	User user = optional.get();
//	System.out.println(user);
//	
//	user.setName("aniket khadse");
//	userRepo.save(user);
//	System.out.println(user);
	
	
	//how to get data
	//find by(id) --return optional containing your data
//	Iterable<User> itr = userRepo.findAll();
//	itr.forEach(user->{
//		System.out.println(user);
//	});
//	
//	Iterable<User> itr1 = userRepo.findAll();
//	itr1.forEach(user->{
//	System.out.println(user);
//	});
	//to delete data
//	userRepo.deleteById(3);
//	System.out.println("done");
	
	
	
	//*******custom finder method apn kelye swata
	//**derived query method
	
	
//	
//	 List<User> users = userRepo.findByName("rakesh");
//	users.forEach(e->
//		System.out.println(e)
//	);
	
//	 List<User> users = userRepo.findByCity("delhi");
//		users.forEach(e->
//			System.out.println(e)
//		);
		
	
//	**********by @QUERY 

//	List<User>allUser=userRepo.getAllUser();
//	allUser.forEach(e->{
//	System.out.println(e);
//	});
	
	//jpaquery
	
	
//	List<User> userByName = userRepo.getUserByName("rakesh","delhi");
//	userByName.forEach(e->{
//		System.out.println(e);
//	});
//	
//	System.out.println("________________________________________________________");
//	
//	//now native query
//	
//	List<User> users = userRepo.getUsers();
//	users.forEach(e->{
//		System.out.println(e);
//	});
}

}
