package controller;


import com.examly.springapp.model.Patient;
import com.examly.springapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    // Implement your controller methods here
}
