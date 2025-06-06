package by.morozmaksim.AgroTechCareApp.domain.workOrder;

import by.morozmaksim.AgroTechCareApp.domain.job.Job;
import by.morozmaksim.AgroTechCareApp.domain.legalEntity.LegalEntity;
import by.morozmaksim.AgroTechCareApp.domain.technique.Technique;

import java.time.LocalDateTime;
import java.util.List;

public class WorkOrder {

    private Long id;
    private String number;
    private double sum;
    private String reason;
    private LocalDateTime plannedWorkDate;
    private String workType;
    private Technique technique;
    private LegalEntity legalEntity;
    private String placeOfWork;
    private String contactPerson;
    private String contactPhoneNumber;
    private List<Job> jobs;

}
