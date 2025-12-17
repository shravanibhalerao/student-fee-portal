package student.StudentFees.cantroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import student.StudentFees.model.Register;
import student.StudentFees.repository.RegisterRepository;


@RestController
@RequestMapping("/StudentFees")
public class RegisterController {
@Autowired
@Qualifier("regRepo")
RegisterRepository regRepo;
@GetMapping("/register")
public String register() {
	return"register page";
}
@PostMapping("/register")
public Register handlepost(@RequestBody Register r) {
return regRepo.save(r);
}
}